package ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_06_2108 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp, sum = 0;
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            sum += temp;
        }

        Arrays.sort(arr);

        System.out.println(sum / num);
        System.out.println(arr[num/2]);
        System.out.println();                       //최빈값: 다시 풀어보기
        System.out.println(arr[num-1] - arr[0]);

    }
}
