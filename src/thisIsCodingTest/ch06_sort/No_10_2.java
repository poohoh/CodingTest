package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_10_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[num];

        // 입력된 수를 배열에 저장
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 람다식을 사용한 내림차순 정렬
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        // 출력
        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);

    }
}
