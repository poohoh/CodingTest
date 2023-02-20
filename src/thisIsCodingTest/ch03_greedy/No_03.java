package thisIsCodingTest.ch03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_03 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int min;
        int result = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i < N; i++) {

            min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                temp  = Integer.parseInt(st.nextToken());
                arr[i][j] = temp;
                if (min > temp) {
                    min = temp;
                }
            }

            if (result < min) {
                result = min;
            }
        }


        /*for (int i = 0; i < N; i++) {
            Arrays.sort(arr[i]);

            if (min < arr[i][0]) {
                min = arr[i][0];
            }
        }*/

        System.out.println(result);

    }
}
