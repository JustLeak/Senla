package task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    void run() {
        System.out.println("Enter two integers.");
        try {
            int a = readInt();
            int b = readInt();
            System.out.printf("Sum: %d; Difference: %d;\nGreatest Common Divisor: %d;\nLeast Common Multiple: %d.",
                    a + b, a - b, gcd(a, b), lcm(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
    //InputMismatchException
    private int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
