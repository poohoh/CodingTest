package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_01_2750 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr;
        int num = Integer.parseInt(br.readLine());
        int temp;

        arr = new int[num];

        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
        }

        for (int i = 0; i < num; i++) {

            temp = arr[i];

            for (int j = i + 1; j < num; j++) {

                if (arr[j] < temp) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
