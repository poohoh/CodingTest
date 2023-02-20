package thisIsCodingTest.ch03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_04 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int target;

        while (true) {
            target = N / K * K;
            count += N - target;
            N = target;

            if (N < K)
                break;

            N /= K;
            count++;
        }

        count += N - 1;

        /*while (N > 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N--;
            }
            count++;
        }*/

        System.out.println(count);

    }
}
