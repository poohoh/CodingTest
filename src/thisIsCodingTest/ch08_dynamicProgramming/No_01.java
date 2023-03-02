package thisIsCodingTest.ch08_dynamicProgramming;

public class No_01 {
    public static void main(String args[]) {
        int result = fibonacci(4);

        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
