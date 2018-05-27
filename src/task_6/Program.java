package task_6;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    void run() {
        System.out.println("Input values: ");
        try {
            double a = readDouble();
            double b = readDouble();
            double c = readDouble();
            System.out.println(c);
            System.out.println("Possible: " + isPythagorasSet(a, b, c));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }

    //InputMismatchException
    private double readDouble() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    private boolean isPythagorasSet(double a, double b, double c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
            return true;
        else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
            return true;
        else if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
            return true;
        return false;
    }
}
