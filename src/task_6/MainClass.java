package task_6;


import common.ConsoleReader;

import java.util.InputMismatchException;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();

        System.out.println("Input values: ");
        try {
            double a = ConsoleReader.readDouble();
            double b = ConsoleReader.readDouble();
            double c = ConsoleReader.readDouble();

            System.out.println("Possibility to create a right triangle: " + program.isPythagorasSet(a, b, c));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
