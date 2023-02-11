package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class No_07_1427_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int num = Integer.parseInt(str);
        Integer[] result = new Integer[str.length()];

        int j = 0;
        while (num != 0) {
            result[j] = num % 10;
            num /= 10;
            j++;
        }

        Arrays.sort(result, Collections.reverseOrder());

        for (int i = 0; i < str.length(); i++) {
            sb.append(result[i]);
        }

        System.out.println(sb);

    }
}
