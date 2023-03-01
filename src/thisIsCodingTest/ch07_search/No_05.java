package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_05 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 전체 원소 개수 입력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 전체 원소 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 타겟 개수 입력
        int M = Integer.parseInt(br.readLine());
        int[] targets = new int[M];

        // 타겟 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        // 전체 원소 정렬
        Arrays.sort(arr);

        // 이진 탐색
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr, targets[i], 0, arr.length - 1)) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }

    }

    /*public static boolean binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }

    }*/

    public static boolean binarySearch(int[] arr, int target, int start, int end) {

        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return false;
    }
}
