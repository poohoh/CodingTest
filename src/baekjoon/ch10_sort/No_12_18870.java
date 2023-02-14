package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_12_18870 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int temp;
        int[] raw = new int[num];
        int[] sorted = new int[num];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(st.nextToken());
            raw[i] = temp;
            sorted[i] = temp;
        }

        Arrays.sort(sorted);
        int count;

        for (int i = 0; i < num; i++) {
            temp = raw[i];
            count = 0;

            if (sorted[0] < temp) {
                count++;
            }

            for (int j = 1; sorted[j] < temp; j++) {
                if (sorted[j] != sorted[j - 1])
                    count++;
            }

            sb.append(count).append(' ');
        }

        System.out.println(sb);

    }
}
