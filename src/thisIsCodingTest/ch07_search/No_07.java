package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No_07 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 집합 자료형
        Set<Integer> set = new HashSet<>();

        // 전체 원소 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 전체 원소 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // 타겟 개수 입력
        int M = Integer.parseInt(br.readLine());

        // 타겟 입력 및 확인
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }

    }
}
