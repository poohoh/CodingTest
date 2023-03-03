package thisIsCodingTest.shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No_01 {

    // 각 노드에 연결되어 있는 노드에 대한 정보 배열
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

    // 방문한 적이 있는지를 나타내는 배열
    static boolean[] visited;

    // 최단 거리 테이블
    static int[] distance;

    // 노드의 개수, 간선의 개수, 시작 노드 번호
    static int N, M, start;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 노드의 개수, 간선의 개수 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 시작 노드의 번호 입력
        start = Integer.parseInt(br.readLine());

        // 방문 배열 초기화
        visited = new boolean[N + 1];

        // 최단 거리 테이블을 무한으로 초기화
        distance = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 모든 간선 정보 입력
        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // a번 노드에서 b번 노드로 가는 비용이 c
            graph.get(a).add(new Node(b, c));
        }

        // 다익스트라 알고리즘 실행
        dijkstra(start);

        // 각 노드로 가는 최단 거리 출력
        for (int i = 1; i < N + 1; i++) {

            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INFINITY");
            } else {
                System.out.println(distance[i]);
            }
        }

    }

    private static void dijkstra(int start) {

        // 시작 노드에 대해서 초기화
        distance[start] = 0;
        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++) {
            distance[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }

        // 시작 노드를 제외한 전체 n-1개 노드에 대해 반복
        for (int i = 0; i < N - 1; i++) {

            // 거리가 가장 짧은 노드 선택
            int now = getSmallestNode();
            visited[now] = true;

            // 최단 거리 테이블 갱신
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = distance[now] + graph.get(now).get(j).getDistance();

                if (cost < distance[graph.get(now).get(j).getIndex()]) {
                    distance[graph.get(now).get(j).getIndex()] = cost;
                }
            }

        }

    }

    private static int getSmallestNode() {
        int index = 0;      // 최단 거리인 노드의 번호 (인덱스)
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            // 방문한 적이 없고 거리가 가장 짧은 인덱스
            if (!visited[i] && (distance[i] < min)) {
                index = i;
                min = distance[i];
            }
        }

        return index;
    }
}

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }
}