package task_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Program {
    //no case-sensitive
    int getWordCount(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();

        int wordCount = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}
