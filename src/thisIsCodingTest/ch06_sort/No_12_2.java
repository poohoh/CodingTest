package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class No_12_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // A 배열과 B 배열 생성
        Integer[] a = new Integer[N];
        Integer[] b = new Integer[N];

        // A 배열에 입력값 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // B 배열에 입력값 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // A배열은 오름차순, B배열은 내림차순으로 정렬
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        // A배열의 원소가 B배열의 원소보다 작을 때에만 교환
        for (int i = 0; i < K; i++) {
            if (a[i] < b[i]) {
                swap(a, b, i);
            } else {
                break;
            }
        }

        // A배열의 합
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }

    private static void swap(Integer[] a, Integer[] b, int i) {
        int temp = a[i];
        a[i] = b[i];
        b[i] = a[i];
    }
}
