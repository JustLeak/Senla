package task_6;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner in = new Scanner(System.in);
        System.out.println("Input values: ");
        try {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            System.out.println("Possibility to create a right triangle: " + program.isPythagorasSet(a, b, c));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
