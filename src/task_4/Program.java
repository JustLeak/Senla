package task_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Program {
    private static final String REGEX_SENTENCE = "[^\\.!?;]+";

    void run() {
        System.out.println("Enter the sentence: ");

        try {
            String sentence = readSentence();

            List<String> words = getWords(sentence);
            System.out.println("Count of words: " + words.size());
            sort(words);

            for (String word : words) {
                System.out.println(word);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    //InputMismatchException
    private String readSentence() {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        if (!isSentence(sentence))
            throw new InputMismatchException("The entered sentence does not match regex \"" + REGEX_SENTENCE + "\".");
        return sentence;
    }

    private List<String> getWords(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^, ]+");
        Matcher matcher = pattern.matcher(sentence);

        ArrayList<MatchResult> matches = matcher.results().collect(Collectors.toCollection(ArrayList::new));
        for (MatchResult match : matches) {
            words.add(match.group());
        }
        return words;
    }

    private boolean isSentence(String sentence) {
        return sentence.matches(REGEX_SENTENCE);
    }

    private void sort(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size() - 1 - i; j++) {
                if (strings.get(j).length() > strings.get(j + 1).length()) {
                    String str = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, str);
                }
            }
        }
    }
}
