package thisIsCodingTest.ch03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_02 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        int result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> b - a);      // Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < K; j++) {
                result += arr[0];
                i++;
            }

            result += arr[1];
        }

        // int count = ( m / (k + 1) ) * k  +  m % (k + 1);
        // result = count * arr[0] + (m-count) * arr[1];

        System.out.println(result);

    }
}

// 정렬을 역순으로 하지 않고 바로 정렬한 후에 arr[N-1]과 arr[N-2]를 사용해도 됨.
// 가장 큰 수를 K번 더하고 그 다음 수를 한 번 더하는 과정을 반복.
// 가장 큰 수가 더해지는 횟수 count를 구해도 되는데, 전체 m을 k+1로 나누고 k를 곱하면 k+1 단위의 길이로 나누어진 부분들 중에서 가장 큰 수가 더해지는 횟수만 구해진다.
// 그리고 m에서 k+1로 나머지 부분을 계산하면 가장 큰 수가 더해지는 나머지 횟수가 구해진다.