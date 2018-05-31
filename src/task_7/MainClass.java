package task_7;

import common.ConsoleReader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        try {
            int[] result = program.findMaxAndMin(program.generate(in.nextInt()));
            System.out.printf("Max value: %d.\nMin value: %d.", result[0], result[1]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.\n" + e.getMessage());
        }
    }
}
