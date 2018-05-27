package task_1;

import java.util.Optional;
import java.util.Scanner;

class Program {
    void run() {
        Optional<Integer> optional;

        System.out.println("Enter an integer: ");
        optional = readInt();

        if (optional.isPresent()) {
            int i = optional.get();
            System.out.printf("%d is %s and %s.", i, isPrime(i) ? "prime" : "composite", isEven(i) ? "even" : "odd");
        } else System.out.println("Invalid input.");
    }

    private Optional<Integer> readInt() {
        Scanner in = new Scanner(System.in);
        return in.hasNextInt() ? Optional.of(in.nextInt()) : Optional.empty();
    }

    private boolean isPrime(int num) {
        int temp;
        if (isEven(num)) {
            return num == 2;
        }

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}
