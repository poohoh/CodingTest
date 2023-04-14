package baekjoon.ch04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01_10807 {
    private int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String N;
        int num = Integer.parseInt(br.readLine());
        int temp, v;
        int count = 0;

        N = br.readLine();
        st = new StringTokenizer(N, " ");

        v = Integer.parseInt(br.readLine());

        while (st.hasMoreTokens()) {
            temp = Integer.parseInt(st.nextToken());

            if(temp == v)
                count++;
        }

        System.out.println(count);
    }
}
