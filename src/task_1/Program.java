package task_1;

class Program {
    static boolean isPrime(int num) {
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

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
