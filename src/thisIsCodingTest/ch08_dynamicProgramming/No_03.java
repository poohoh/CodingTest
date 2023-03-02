package thisIsCodingTest.ch08_dynamicProgramming;

public class No_03 {

    static long[] arr = new long[100];

    public static void main(String args[]) {
        fibo(6);
    }

    public static long fibo(int n) {

        System.out.print("f("+n+") ");

        if (n == 1 || n == 2) {
            return 1L;
        }

        if (arr[n] != 0) {
            return arr[n];
        }

        arr[n] = fibo(n - 1) + fibo(n - 2);

        return arr[n];
    }
}
