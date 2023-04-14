package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_07_1427 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        Integer[] result = new Integer[input.length()];

        String[] arr = input.split("");

        for (int i = 0; i < input.length(); i++) {
            result[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(result, (i1, i2) -> i2 - i1);

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }

        System.out.println(sb);
    }
}
