package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        String direction;
        int x = 1, y = 1;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            direction = st.nextToken();

            if (direction.equals("R")) {
                y++;
            } else if (direction.equals("L")) {
                y--;
            } else if (direction.equals("U")) {
                x--;
            } else if (direction.equals("D")) {
                x++;
            }

            if (x < 1) {
                x++;
                i--;
            } else if (x > 5) {
                x--;
                i--;
            } else if (y < 1) {
                y++;
                i--;
            } else if (y > 5) {
                y--;
                i--;
            }
        }

        System.out.println(x + " " + y);

    }
}
