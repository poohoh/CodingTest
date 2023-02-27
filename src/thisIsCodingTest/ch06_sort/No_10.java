package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class No_10 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[num];

        // 배열에 입력된 수 저장
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Collections.reverseOrder()를 사용하여 내림차순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        // 출력
        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}
