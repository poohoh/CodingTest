package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No_10_1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        String str;

        for (int i = 0; i < num; i++) {
            str = br.readLine();

            // 중복값 찾기
            for (int j = 0; j < words.size(); j++) {
                if (words.get(j).equals(str)) {
                    words.remove(j);
                }
            }

            words.add(str);
        }

        words.sort((e1, e2)->{
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}
