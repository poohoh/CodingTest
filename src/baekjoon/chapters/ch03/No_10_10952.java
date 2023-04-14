package baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class No_10_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if((a==0) && (b==0))
                break;

            sb.append(a+b+"\n");
        }

        System.out.println(sb);

        br.close();
        bw.close();
    }
}
