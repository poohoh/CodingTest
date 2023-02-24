package thisIsCodingTest.ch05_DFS_BFS;

public class No_05 {
    public static void main(String args[]) {
        System.out.println("반복적으로 구현: " + iterativeFactorial(5));
        System.out.println("재귀적으로 구현: " + recursiveFactorial(5));
    }

    public static int iterativeFactorial(int n) {

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int recursiveFactorial(int n) {

        if (n < 2) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }
}
