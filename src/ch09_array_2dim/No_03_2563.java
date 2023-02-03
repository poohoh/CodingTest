package ch09_array_2dim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_03_2563 {

    //false: Èò»ö, true: °ËÁ¤»ö
    static boolean[][] arr = new boolean[100][100];
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int row, col, count = 0;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());

            for (int j = row; j < row + 10; j++) {
                for (int k = col; k < col + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
