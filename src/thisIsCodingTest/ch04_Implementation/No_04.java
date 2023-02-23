package thisIsCodingTest.ch04_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_04 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 세로 크기 N, 가로 크기 M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        // (A, B) - A: 북쪽으로부터 떨어진 칸의 개수, B: 서쪽으로부터 떨어진 칸의 개수, 0부터 시작
        // direction: 현재 캐릭터가 바라보는 방향. 0: 북쪽, 1: 동쪽, 2:남쪽, 3:서쪽
        st = new StringTokenizer(br.readLine(), " ");
        int curRow = Integer.parseInt(st.nextToken());
        int curCol = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());

        // 0: 육지, 1: 바다, 2: 방문한 칸. 바다는 갈 수 없음.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 방문한 칸의 개수
        int count = 0;

        boolean stop = false;
        while (!stop) {

            // 위치한 칸을 방문한 칸으로 변경하고 횟수 증가
            if (map[curRow][curCol] == 0) {
                map[curRow][curCol] = 2;
                count++;
            }

            int turnCount = 0;
            while (turnCount < 4) {

                // 방향 왼쪽으로 전환
                direction = (direction + 3) % 4;
                turnCount++;                        // 방문한 칸을 다시 방문해도 카운트하는지 확인

                // 앞에 육지가 존재하면 한 칸 이동. 바다이거나 가 본 칸이면 contiunue.
                if (direction == 0) {           // 북쪽
                    if (curRow > 0 && map[curRow - 1][curCol] == 0) {      // 맨 윗줄이 아니고 앞 칸이 육지인 경우
                        curRow--;
                        break;
                    } else {
                        continue;
                    }
                } else if (direction == 1) {    // 동쪽
                    if ((curCol < M - 1) && map[curRow][curCol + 1] == 0) {      // 맨 오른쪽 줄이 아니고 앞 칸이 육지인 경우
                        curCol++;
                        break;
                    } else {
                        continue;
                    }
                } else if (direction == 2) {    // 남쪽
                    if ((curCol < N - 1) && map[curRow+1][curCol] == 0) {      // 맨 아래 줄이 아니고 앞 칸이 육지인 경우
                        curRow++;
                        break;
                    } else {
                        continue;
                    }
                } else {                        // 서쪽
                    if (curCol > 0 && map[curRow][curCol - 1] == 0) {      // 맨 왼쪽 줄이 아니고 앞 칸이 육지인 경우
                        curCol--;
                        break;
                    } else {
                        continue;
                    }
                }
            }

            // 네 방향 모두 가 본 칸이거나 이동할 수 없으면 방향을 유지한 채로 한 칸 뒤로 간 후 continue.
            // 뒤쪽 방향이 바다이면 break.
            if (turnCount >= 4) {       // 네 번 회전
                if (direction == 0) {           // 북쪽
                    if (map[curRow + 1][curCol] == 1) {     // 뒤쪽 방향이 바다이면 break
                        stop = true;
                        break;
                    } else {
                        curRow++;
                        continue;
                    }
                } else if (direction == 1) {    // 동쪽
                    if (map[curRow][curCol - 1] == 1) {     // 뒤쪽 방향이 바다이면 break
                        stop = true;
                        break;
                    } else {
                        curCol--;
                        continue;
                    }
                } else if (direction == 2) {    // 남쪽
                    if (map[curRow - 1][curCol] == 1) {     // 뒤쪽 방향이 바다이면 break
                        stop = true;
                        break;
                    } else {
                        curRow--;
                        continue;
                    }
                } else {                        // 서쪽
                    if (map[curRow][curCol + 1] == 1) {     // 뒤쪽 방향이 바다이면 break
                        stop = true;
                        break;
                    } else {
                        curCol++;
                        continue;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
