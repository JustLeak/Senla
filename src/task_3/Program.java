package task_3;

class Program {
    //not case-sensitive
    boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
