package task_9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the sequence: ");
        try {

            List<Integer> integers = new ArrayList<>();
            int n = in.nextInt();
            if (n > 0) {
                for (int i = 0; i < n + 1; i += 2) {
                    integers.add(i);
                    System.out.print(i + " ");
                }
                System.out.println("\nSum = " + program.getSum(integers));

            } else System.out.println("The length of the sequence must be greater than 0.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
