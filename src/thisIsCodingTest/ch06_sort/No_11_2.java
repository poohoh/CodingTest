package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_11_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        List<Student2> students = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            students.add(new Student2(st.nextToken(), Integer.parseInt(st.nextToken())));
        }

        // 익명 객체 사용
        /*Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getScore() - o2.getScore();
            }
        });*/

        // 람다식 사용
        Collections.sort(students, (o1, o2) -> o1.getScore() - o2.getScore());

        for (int i = 0; i < num; i++) {
            sb.append(students.get(i).getName()).append(' ');
        }

        System.out.println(sb);

    }
}

class Student2 {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }
}