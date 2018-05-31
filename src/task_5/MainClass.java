package task_5;

import common.ConsoleReader;

import java.util.InputMismatchException;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();

        try {
            System.out.println("Enter the text: ");
            String text = ConsoleReader.readText();
            System.out.println("Enter the word: ");
            String word = ConsoleReader.readWord();
            System.out.printf("The word \"%s\" occurs in the text %d times", word, program.getWordCount(text, word));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
