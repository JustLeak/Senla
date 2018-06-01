package task_1;

import common.ConsoleReader;

import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println("Enter an integer: ");
        Optional<Integer> integer = ConsoleReader.readIntOptional();

        if (integer.isPresent()) {
            System.out.printf("%d is %s and %s.",
                    integer.get(),
                    program.isPrime(integer.get()) ? "prime" : "composite",
                    program.isEven(integer.get()) ? "even" : "odd");

        } else System.out.println("Invalid input.");
    }
}
