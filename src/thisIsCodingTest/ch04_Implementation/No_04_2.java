package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_04_2 {

    static int N, M, curRow, curCol, direction;

    static void turn() {
        direction = (direction + 3) % 4;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        st = new StringTokenizer(br.readLine(), " ");
        curRow = Integer.parseInt(st.nextToken());
        curCol = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        map[curRow][curCol] = 2;
        int visitCount = 1;

        int dRow[] = {-1, 0, 1, 0};
        int dCol[] = {0, 1, 0, -1};

        int turnCount = 0;
        while (true) {

            turn();
            turnCount++;
            int nextRow = curRow + dRow[direction];
            int nextCol = curCol + dCol[direction];

            // 회전하고 가보지 않은 칸이 존재하면 전진
            if (map[nextRow][nextCol] == 0) {
                curRow = nextRow;
                curCol = nextCol;
                map[curRow][curCol] = 2;    // 방문한 칸은 2로 표시
                visitCount++;
                turnCount = 0;
                continue;
            }

            if (turnCount >= 4) {
                nextRow = curRow + dRow[(direction + 2) % 4];
                nextCol = curCol + dCol[(direction + 2) % 4];

                if (map[nextRow][nextCol] == 1) {
                    break;
                }
            }

        }

        System.out.println(visitCount);

    }
}
