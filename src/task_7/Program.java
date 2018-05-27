package task_7;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    private static final int MAX_SIZE = 100000;
    private static final int MIN_SIZE = 1;

    void run() {
        System.out.println("Enter the size of the array: ");

        try {
            int[] result = findMaxAndMin(generate(readInt()));
            System.out.printf("Max value: %d.\nMin value: %d.", result[0], result[1]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.\n" + e.getMessage());
        }
    }

    //InputMismatchException
    private int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    //IllegalArgumentException
    private int[] generate(int size) {
        if (size > MAX_SIZE || size < MIN_SIZE) throw new IllegalArgumentException("Unacceptable value of \"size\".");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
        }
        return arr;
    }

    private int[] findMaxAndMin(int[] arr) {
        int[] result = {arr[0], arr[0]};
        for (int anArr : arr) {
            if (result[0] < anArr)
                result[0] = anArr;
            if (result[1] > anArr)
                result[1] = anArr;
        }

        return result;
    }
}
