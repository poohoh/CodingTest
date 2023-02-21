package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int x = 1, y = 1;
        int nx, ny;

        String direction;
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < num; i++) {
            direction = st.nextToken();
            nx = x;
            ny = y;

            if (direction.equals("R")) {
                ny++;
            } else if (direction.equals("L")) {
                ny--;
            } else if (direction.equals("U")) {
                nx--;
            } else if (direction.equals("D")) {
                nx++;
            }

            if (nx < 1 || nx > 5 || ny < 1 || ny > 5) {
                i--;
                continue;
            }

            x = nx;
            y = ny;

        }

        System.out.println(x + " " + y);

    }
}
