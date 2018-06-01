package task_2;

class Program {
    static int gcd(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("lcm(a ,b). Parameters a and b are equals to zero.");
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("lcm(a ,b). Parameters a and b are equals to zero.");
        return a / gcd(a, b) * b;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int diff(int a, int b) {
        return a - b;
    }
}
