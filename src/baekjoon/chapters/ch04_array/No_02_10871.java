package baekjoon.ch04_array;

import java.io.*;
import java.util.StringTokenizer;

public class No_02_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str, " ");

        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if(a<x)
                bw.write(a + " ");
        }

        br.close();
        bw.close();
    }
}
