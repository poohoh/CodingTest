package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No_12_18870_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int temp;
        int[] origin = new int[num];
        int[] sorted = new int[num];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(st.nextToken());
            origin[i] = temp;
            sorted[i] = temp;
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < num; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], count++);
            }
        }

        for (int i = 0; i < num; i++) {
            sb.append(map.get(origin[i])).append(' ');
        }

        System.out.println(sb);

    }
}
