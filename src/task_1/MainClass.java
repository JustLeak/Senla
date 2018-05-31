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
            int i = optional.get();
            System.out.printf("%d is %s and %s.", i, program.isPrime(i) ? "prime" : "composite", program.isEven(i) ? "even" : "odd");
        } else System.out.println("Invalid input.");
    }
}
