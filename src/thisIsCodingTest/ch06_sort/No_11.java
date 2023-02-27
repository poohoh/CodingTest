package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_11 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students, (o1, o2) -> o1.getScore() - o2.getScore());

        for (int i = 0; i < num; i++) {
            sb.append(students[i].getName()).append(' ');
        }

        System.out.println(sb);

    }
}

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}