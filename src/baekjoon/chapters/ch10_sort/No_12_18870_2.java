package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_12_18870_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] numbers = new int[num];

        st = new StringTokenizer(br.readLine(), " ");

        int temp;
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(st.nextToken());

            numbers[i] = temp;

            // 리스트에 저장
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }

        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < num; i++) {
            sb.append(list.indexOf(numbers[i])).append(' ');
        }

        System.out.println(sb);
    }
}
