package task_3;

import common.ConsoleReader;

import java.util.InputMismatchException;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println("Enter the word: ");

        try {
            String word = ConsoleReader.readWord();
            System.out.printf("Word %s is %s", word, program.isPalindrome(word) ? "palindrome" : "not palindrome");

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
