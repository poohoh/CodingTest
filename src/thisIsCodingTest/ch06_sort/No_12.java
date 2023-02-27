package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class No_12 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // A배열과 B배열을 하나의 이차원 배열로 생성
        int[][] arr = new int[2][N];

        // 입력된 값을 배열에 저장
        for (int i = 0; i < 2; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // A배열과 B배열 정렬
        for (int i = 0; i < 2; i++) {
            Arrays.sort(arr[i]);
        }
        
        // A의 원소가 B의 원소보다 작을 때에만 교환
        for (int i = 0; i < K; i++) {
            if (arr[0][i] < arr[1][N - 1 - i]) {
                swap(arr, N, i);
            } else {
                break;
            }
        }

        // A배열의 합
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[0][i];
        }

        System.out.println(sum);
        
    }

    private static void swap(int[][] arr, int N, int i) {
        int temp = arr[0][i];
        arr[0][i] = arr[1][N - 1 - i];
        arr[1][N - 1 - i] = temp;
    }
}
