package thisIsCodingTest.ch05_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_11 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        // 맵을 입력받아 생성
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int result = bfs(map, 0, 0, N, M);

        System.out.println(result);

    }

    public static int bfs(int[][] map, int x, int y, int N, int M) {
        
        Queue<Node2> queue = new LinkedList<>();

        queue.offer(new Node2(x, y));

        while (!queue.isEmpty()) {

            Node2 node = queue.poll();
            int row = node.getX();
            int col = node.getY();

            // 범위가 벗어나지 않으면서 아직 방문하지 않은 길
            for (int i = 0; i < 4; i++) {

                int nextRow = row + dx[i];
                int nextCol = col + dy[i];

                // 범위를 벗어나지 않을 때
                if (nextRow >= 0 && nextRow < N && nextCol >= 0 && nextCol < M) {

                    // 아직 방문하지 않은 길일 때
                    if (map[nextRow][nextCol] == 1) {
                        map[nextRow][nextCol] = map[row][col] + 1;
                        queue.offer(new Node2(nextRow, nextCol));
                    }
                }
            }
        }

        return map[N-1][M-1];

    }
}

class Node2 {
    private int x;
    private int y;

    public Node2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}