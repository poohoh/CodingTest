package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_06_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str;

        for(int i=1; i<=n; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            sb.append("Case #"+i+ ": " + (Integer.parseInt(st.nextToken())+(Integer.parseInt(st.nextToken()))) +"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
