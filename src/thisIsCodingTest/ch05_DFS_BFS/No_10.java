package thisIsCodingTest.ch05_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_10 {

    static int count = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 세로 길이
        int M = Integer.parseInt(st.nextToken());   // 가로 길이

        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        // 맵 생성
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    dfs(map, visited, i, j, N, M);
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    public static void bfs(int[][] map, boolean[][] visited, int x, int y, int N, int M) {
        Queue<Integer[]> queue = new LinkedList<>();

        Integer[] arr = {x, y};
        queue.offer(arr);
        visited[x][y] = true;

        while (!queue.isEmpty()) {

            Integer[] temp = queue.poll();
            x = temp[0];
            y = temp[1];

            if (x < N - 1) {        // 마지막 줄이 아닐 때
                Integer[] arr1 = {x + 1, y};

                if (map[x + 1][y] == 0 && !visited[x + 1][y]) {
                    queue.offer(arr1);
                    visited[x + 1][y] = true;
                }
            }

            if (y < M - 1) {
                Integer[] arr2 = {x, y + 1};

                if (map[x][y + 1] == 0 && !visited[x][y + 1]) {
                    queue.offer(arr2);
                    visited[x][y + 1] = true;
                }
            }

        }

    }

    public static void dfs(int[][] map, boolean[][] visited, int x, int y, int N, int M) {

        visited[x][y] = true;

        if (x + 1 < N && map[x + 1][y] == 0) {
            dfs(map, visited, x + 1, y, N, M);
        }

        if (y + 1 < M && map[x][y + 1] == 0) {
            dfs(map, visited, x, y + 1, N, M);
        }

    }
}
