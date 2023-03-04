package thisIsCodingTest.ch09_shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_03 {

    static int N, M;
    static int[][] graph = new int[1001][1001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 노드의 개수와 간선의 개수 입력
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = 987654321;
                }
            }
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = c;
        }

        // 플루이드 워셜 알고리즘 수행
        for (int i = 1; i <= N; i++) {

            // j에서 k로 가는 최단 거리 계산 (i를 거치는 경로 고려)
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        // 수행 결과 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(graph[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
