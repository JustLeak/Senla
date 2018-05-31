package task_4;

import common.ConsoleReader;

import java.util.InputMismatchException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println("Enter the sentence: ");

        try {
            String sentence = ConsoleReader.readSentence();

            List<String> words = program.getWords(sentence);
            System.out.println("Count of words: " + words.size());
            program.sort(words);

            System.out.println(words);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
