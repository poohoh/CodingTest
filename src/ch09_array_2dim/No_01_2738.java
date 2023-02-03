package ch09_array_2dim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01_2738 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int row, col;
        String str;
        int[][] arr;

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        arr = new int[row][col];

        //배열 초기화
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = 0;
            }
        }

        //배열 덧셈
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < row; i++) {
                str = br.readLine();
                st = new StringTokenizer(str, " ");
                for (int j = 0; j < col; j++) {
                    arr[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        //배열 출력
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
