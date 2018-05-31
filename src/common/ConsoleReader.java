package common;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleReader {
    private static final String REGEX_WORD = "\\w+(-\\w+)|\\w*";
    private static final String REGEX_SENTENCE = "[^.!?;]+[.!?;]*";

    public static Optional<Integer> readIntOptional() {
        Scanner in = new Scanner(System.in);
        return in.hasNextInt() ? Optional.of(in.nextInt()) : Optional.empty();
    }

    //InputMismatchException
    public static double readDouble() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    //InputMismatchException
    public static String readWord() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if (!word.matches(REGEX_WORD))
            throw new InputMismatchException("The input does not match regex \"" + REGEX_WORD + "\" (word).");
        return word;
    }

    //InputMismatchException
    public static String readSentence() {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        if (!sentence.matches(REGEX_SENTENCE))
            throw new InputMismatchException("The input does not match regex \"" + REGEX_SENTENCE + "\" (sentence).");
        return sentence;
    }

    public static String readText() {
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
}
