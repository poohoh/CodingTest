package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_08 {
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

        // 가장 긴 떡의 길이부터 시작해서 1씩 줄여가며 잘린 총 길이 계산
        int result = -1;
        for (int i = arr[arr.length - 1] - 1; i > 0; i--) {

            int sum = 0;
            
            // 자를 수 있는 최소 길이의 인덱스 탐색
            int minIdx = binarySearch(arr, i, 0, arr.length - 1);

            // 모든 떡들을 자른 길이의 합 구하기
            for (int j = minIdx; j < arr.length; j++) {
                sum += arr[j] - i;
            }

            // 총 길이가 M 이상
            if (sum >= M) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        int mid;

        while (start <= end) {

            mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {    // 타겟 발견
                return mid;
            } else {
                end = mid - 1;
            }
        }

        // 타겟이 존재하지 않는 경우 target은 end와 start 사이의 값
        return end;
    }
}
