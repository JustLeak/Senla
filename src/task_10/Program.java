package task_10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Program {
    void run() {
        try {

            System.out.println("Enter 3 digits: ");
            List<Integer> integers = getCombinations(readInt(), readInt(), readInt());
            System.out.println("Combinations: ");
            for (int i : integers) {
                System.out.print(i + " ");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid input.");
        }
    }

    //InputMismatchException
    private int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }


    private List<Integer> getCombinations(int a, int b, int c) {
        List<Integer> integers = new ArrayList<>();

        if ((a | b | c) < 0 || (a | b | c) > 9) throw new IllegalArgumentException();
        int temp;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                integers.add(a * 100 + b * 10 + c);
                temp = b;
                b = c;
                c = temp;
            }
            temp = a;
            a = b;
            b = temp;

            temp = b;
            b = c;
            c = temp;
        }
        return integers;
    }
}
