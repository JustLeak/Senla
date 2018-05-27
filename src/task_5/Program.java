package task_5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Program {
    private static final String REGEX_WORD = "([a-zA-Z]+-?[a-zA-Z]+)|[a-zA-Z]+";

    void run() {
        try {
            System.out.println("Enter the text: ");
            String text = readText();
            System.out.println("Enter the word: ");
            String word = readWord();
            System.out.printf("The word \"%s\" occurs in the text %d times", word, getWordCount(text, word));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    private String readText() {
        Scanner in = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String token;

        while (true) {
            token = in.nextLine();
            if (token.equals("")) {
                return builder.toString();
            }
            builder.append(token).append('\n');
        }
    }

    //InputMismatchException
    private String readWord() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if (!isWord(word))
            throw new InputMismatchException("The entered word does not match regex\"" + REGEX_WORD + "\".");
        return word;
    }

    private int getWordCount(String text, String word) {
        int wordCount = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }

    private boolean isWord(String word) {
        return word.matches(REGEX_WORD);
    }
}
