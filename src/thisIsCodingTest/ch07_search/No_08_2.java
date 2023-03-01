package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_08_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 떡의 개수 N과 요청한 떡의 길이 M
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 떡의 개별 높이 배열
        int[] arr = new int[N];

        // 떡의 개별 높이 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 떡의 개별 길이 정렬
        Arrays.sort(arr);

        //
        int result = binarySearch(arr, M, 0, 1000000);

        System.out.println(result);

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        int result = 0;

        while (start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;

            // 잘린 떡의 총 길이 계산
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mid) {
                    sum += arr[i] - mid;
                }
            }

            if (sum < target) {     // 떡의 양이 부족한 경우 더 자름
                end = mid - 1;
            } else {                // 떡의 양이 충분한 경우 덜 자름
                start = mid + 1;
                result = mid;       // 최대한 덜 잘랐을 때가 정답이므로 결과 기록
            }
        }

        return result;

    }
}
