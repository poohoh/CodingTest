package baekjoon.ch03;

import java.io.*;

public class No_08_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++)
                bw.write("*");
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
