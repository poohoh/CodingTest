package baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class No_11_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");

            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }

        System.out.println(sb);

        br.close();
        bw.close();
    }
}
