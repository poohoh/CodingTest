package thisIsCodingTest.ch08_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_06 {

    // 식량창고 100개
    static int[] food = new int[101];
    static int[] sum = new int[101];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 식량 창고 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 식량 창고 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            food[i] = Integer.parseInt(st.nextToken());
        }

        // 식량 창고 누적 계산
        sum[1] = food[1];
        sum[2] = food[2];
        sum[3] = food[3] + sum[1];
        for (int i = 4; i <= N; i++) {
            sum[i] = food[i] + Math.max(sum[i - 2], sum[i - 3]);
        }

        System.out.println(sum[N]);

    }
}
