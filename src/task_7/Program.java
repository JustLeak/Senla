package task_7;

class Program {
    private static final int MAX_SIZE = 100000;
    private static final int MIN_SIZE = 1;

    //IllegalArgumentException
    static int[] generate(int size) {
        if (size > MAX_SIZE || size < MIN_SIZE) throw new IllegalArgumentException("(generate) Unacceptable value of \"size\".");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
        }
        return arr;
    }

    //IllegalArgumentException
    static int[] findMaxAndMin(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("(findMaxAndMin) Array is empty.");

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
