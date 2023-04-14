package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11_10814_03 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int age;

        // 0살부터 200살까지
        StringBuilder[] persons = new StringBuilder[201];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new StringBuilder();
        }

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            age = Integer.parseInt(st.nextToken());
            persons[age].append(age).append(' ').append(st.nextToken()).append('\n');
        }

        for (int i = 0; i < persons.length; i++) {
            sb.append(persons[i]);
        }

        System.out.println(sb);

    }
}
