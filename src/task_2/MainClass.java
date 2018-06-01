package task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("Sum: %d; Difference: %d;\nGreatest Common Divisor: %d;\nLeast Common Multiple: %d.",
                    Program.sum(a, b), Program.diff(a, b), Program.gcd(a, b), Program.lcm(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
