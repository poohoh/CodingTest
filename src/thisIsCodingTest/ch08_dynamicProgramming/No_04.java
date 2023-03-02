package thisIsCodingTest.ch08_dynamicProgramming;

public class No_04 {

    static long[] arr = new long[100];

    public static void main(String args[]) {
        arr[1] = 1;
        arr[2] = 2;

        int n = 99;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[n]);
    }

}
