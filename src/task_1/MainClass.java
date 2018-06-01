package task_1;

import common.ConsoleReader;

import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        Optional<Integer> optional;

        System.out.println("Enter an integer: ");
        optional = ConsoleReader.readIntOptional();

        if (optional.isPresent()) {
            System.out.printf("%d is %s and %s.",
                    optional.get(),
                    program.isPrime(optional.get()) ? "prime" : "composite",
                    program.isEven(optional.get()) ? "even" : "odd");

        } else System.out.println("Invalid input.");
    }
}
