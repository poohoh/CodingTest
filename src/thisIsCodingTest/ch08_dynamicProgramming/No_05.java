package thisIsCodingTest.ch08_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_05 {

    static int[] arr = new int[30001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        makeOne(x);

        System.out.println(arr[26]);
    }

    public static void makeOne(int x) {

        for (int i = 2; i < x + 1; i++) {

            // 1을 더하는 경우
            arr[i] = arr[i - 1] + 1;

            // i가 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }

            // i가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }

            // i가 5로 나누어 떨어지는 경우
            if (i % 5 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 5] + 1);
            }
        }

    }
}
