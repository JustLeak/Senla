package task_9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Program {
    void run() {
        System.out.println("Enter the length of the sequence: ");
        try {

            List<Integer> integers = new ArrayList<>();
            int n = readInt();
            if (n > 0) {

                for (int i = 0; i < n + 1; i++) {
                    if (isEven(i)) {
                        integers.add(i);
                        System.out.print(i + " ");
                    }
                }
                System.out.println("\nSum = " + getSum(integers));

            } else System.out.println("The length of the sequence must be greater than 0.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }

    //InputMismatchException
    private int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private int getSum(List<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        return sum;
    }
}
