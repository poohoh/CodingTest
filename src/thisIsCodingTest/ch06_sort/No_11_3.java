package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No_11_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Student3>> students = new ArrayList<ArrayList<Student3>>();

        // 0점부터 100점까지 점수가 존재하므로 101개의 점수에 대한 리스트 생성 
        for (int i = 0; i < 101; i++) {
            students.add(new ArrayList<Student3>());
        }

        // 학생 이름과 점수를 입력받고 점수에 해당하는 인덱스의 리스트에 객체를 저장
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            students.get(score).add(new Student3(name, score));
        }

        // 0점부터 순서대로 각 인덱스의 객체들의 이름을 출력
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).size(); j++) {
                sb.append(students.get(i).get(j).getName()).append(' ');
            }
        }

        System.out.println(sb);

    }
}

class Student3 {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student3(String name, int score) {
        this.name = name;
        this.score = score;
    }
}