package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_11_10814_02 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        String[][] persons = new String[num][2];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            persons[i][0] = st.nextToken();
            persons[i][1] = st.nextToken();
        }

        Arrays.sort(persons, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < num; i++) {
            sb.append(persons[i][0]).append(' ').append(persons[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
