package task_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter 3 digits: ");
            Program.getCombinations(in.nextInt(), in.nextInt(), in.nextInt()).forEach(System.out::println);
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid input.");
        }
    }
}
