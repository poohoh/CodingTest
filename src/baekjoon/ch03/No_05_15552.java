package baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class No_05_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            bw.write(a+b+"\n");
        }
        bw.flush();

        br.close();
        bw.close();

    }
}
