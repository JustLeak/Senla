package task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    private static final String REGEX_WORD = "([a-zA-Z]+-?[a-zA-Z]+)|[a-zA-Z]+";

    void run() {
        System.out.println("Enter the word: ");
        try {
            String word = readWord();
            System.out.printf("Word %s is %s", word, isPalindrome(word) ? "palindrome" : "not palindrome");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
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

    //not case-sensitive
    private boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    private boolean isWord(String word) {
        return word.matches(REGEX_WORD);
    }
}
