package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_03_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int row = input.charAt(1) - '0';
        int col = input.charAt(0) - 'a' + 1;
        int cnt = 0;

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        int nextRow, nextCol;

        for (int i = 0; i < 8; i++) {
            nextRow = row + dx[i];
            nextCol = col + dy[i];

            if (nextRow > 0 && nextRow < 9 && nextCol > 0 && nextCol < 9) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
