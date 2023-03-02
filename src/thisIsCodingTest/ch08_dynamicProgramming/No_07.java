package thisIsCodingTest.ch08_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_07 {

    static int[] arr = new int[1001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 3;
        for (int i = 3; i <= N; i++) {
            // arr[i-2]에 2를 곱한 이유는 2X1 크기의 타일을 놓는 경우는 arr[i-1]에서 고려되었기 때문.
            arr[i] = (arr[i - 1] + arr[i - 2] * 2) % 796796;
        }

        System.out.println(arr[N]);
    }
}
