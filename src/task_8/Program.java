package task_8;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    void run() {
        System.out.println("Enter the length of the sequence from 0 to 100: ");
        try {
            int n = readInt();
            if (!(n < MIN_VALUE || n > MAX_VALUE)) {
                for (int i = MIN_VALUE; i < n + 1; i++) {
                    if (isPalindrome(i)) System.out.println(i);
                }
            } else System.out.println("The length of the sequence must be in the range from 0 to 100.aa");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. ");
        }
    }

    //InputMismatchException
    private int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    //IllegalArgumentException
    private boolean isPalindrome(int i) {
        int next = 0;
        int temp = i;

        while (temp != 0) {
            next = (next * 10) + (temp % 10);
            temp /= 10;
        }

        return i == next;
    }
}
