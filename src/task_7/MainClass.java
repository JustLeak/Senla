package task_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        try {
            int[] result = Program.findMaxAndMin(Program.generate(in.nextInt()));
            System.out.printf("Max value: %d.\nMin value: %d.", result[0], result[1]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.\n" + e.getMessage());
        }
    }
}
