package baekjoon.ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_09_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[6];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i=0; i<6; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        a[0] = 1 - a[0];
        a[1] = 1 - a[1];
        a[2] = 2 - a[2];
        a[3] = 2 - a[3];
        a[4] = 2 - a[4];
        a[5] = 8 - a[5];

        for(int i=0; i<6; i++)
            System.out.print(a[i]+" ");

        br.close();

    }
}
