package task_10;

import java.util.HashSet;
import java.util.Set;

class Program {
    static Set<Integer> getCombinations(int a, int b, int c) {
        Set<Integer> integers = new HashSet<>();

        if ((a | b | c) < 0 || (a | b | c) > 9) throw new IllegalArgumentException();

        if (a == b && b == c) {
            integers.add(a * 100 + b * 10 + c);
            return integers;
        }

        int temp;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (a != 0) integers.add(a * 100 + b * 10 + c);
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
