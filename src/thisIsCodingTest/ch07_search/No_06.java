package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_06 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 0부터 1,000,000 까지의 원소 배열
        boolean[] arr = new boolean[1000001];

        // 전체 원소 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 전체 원소 입력
        st = new StringTokenizer(br.readLine(), " ");
        int input;
        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(st.nextToken());
            arr[input] = true;
        }

        // 타겟 개수 입력
        int M = Integer.parseInt(br.readLine());

        // 타겟 입력
        st = new StringTokenizer(br.readLine(), " ");
        int target;
        for (int i = 0; i < M; i++) {
            target = Integer.parseInt(st.nextToken());
            if (arr[target]) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }

    }
}
