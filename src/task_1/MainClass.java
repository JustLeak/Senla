package task_1;

import common.ConsoleReader;

import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Optional<Integer> integer = ConsoleReader.readIntOptional();
        integer.ifPresentOrElse(MainClass::printAnswer, MainClass::invalidInput);
    }

    private static void printAnswer(int i) {
        System.out.printf("%d is %s and %s.",
                i,
                Program.isPrime(i) ? "prime" : "composite",
                Program.isEven(i) ? "even" : "odd");
    }

    private static void invalidInput() {
        System.out.println("Invalid input.");
    }
}
