package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_03 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char x = input.charAt(0);
        int y = input.charAt(1) - '0';

        int count = 8;
        int[] arr = {-2, -1, 1, 2};

        // x축 방향 2, y축 방향 1만큼 이동
        if (x + 2 - 'a' > 7 || y + 1 > 8) {
            count--;
        }
        if (x + 2 - 'a' > 7 || y - 1 < 1) {
            count--;
        }
        if (x - 2 - 'a' < 0 || y + 1 > 8) {
            count--;
        }
        if (x - 2 - 'a' < 0 || y - 1 < 1) {
            count--;
        }

        // x축 방향 1, y축 방향 2만큼 이동
        if (x + 1 - 'a' > 7 || y + 2 > 8) {
            count--;
        }
        if (x + 1 - 'a' > 7 || y - 2 < 1) {
            count--;
        }
        if (x - 1 - 'a' < 0 || y + 2 > 8) {
            count--;
        }
        if (x - 1 - 'a' < 0 || y - 2 < 1) {
            count--;
        }

        System.out.println(count);

    }
}
