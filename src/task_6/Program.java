package task_6;

class Program {
    static boolean isPythagorasSet(double a, double b, double c) {
        if (a == 0 || b == 0 || c == 0) return false;

        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
            return true;
        else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
            return true;
        else return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
    }
}
