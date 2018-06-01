package task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Program {
    static List<String> getWords(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[\\w\\-]+");
        Matcher matcher = pattern.matcher(sentence);

        ArrayList<MatchResult> matches = matcher.results().collect(Collectors.toCollection(ArrayList::new));
        for (MatchResult match : matches) {
            words.add(match.group());
        }
        return words;
    }

    static void sort(List<String> strings) {
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
