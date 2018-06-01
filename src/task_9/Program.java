package task_9;

import java.util.List;

class Program {
    int getSum(List<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }

        return sum;
    }
}
