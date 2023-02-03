package ch09_array_2dim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_02_2566 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int temp, max, maxRow = 0, maxCol = 0;

        max = -1;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                temp = Integer.parseInt(st.nextToken());

                if (temp > max) {
                    max = temp;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}
