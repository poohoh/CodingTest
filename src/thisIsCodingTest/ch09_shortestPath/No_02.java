package thisIsCodingTest.ch09_shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No_02 {

    static ArrayList<ArrayList<Node1>> graph = new ArrayList<>();
    static int[] distance = new int[100001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 노드 개수, 간선 개수, 시작 노드 번호 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 각 노드에 대한 간선 입력
        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node1(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 설정
        for (int i = 0; i <= N; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // 다익스트라 알고리즘 수행
        dijkstra(start);

        for (int i = 1; i <= N; i++) {
            System.out.println(distance[i]);
        }

    }

    private static void dijkstra(int start) {
        PriorityQueue<Node1> pq = new PriorityQueue<>();
        pq.offer(new Node1(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Node1 node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();

            // 현재 인덱스의 거리가 이미 기록된 거리보다 크면 패스
            if (distance[now] < dist) {
                continue;
            }

            for (int i = 0; i < graph.get(now).size(); i++) {

                // 계산한 거리가 더 짧으면 최단 거리 테이블 갱신
                int cost = distance[now] + graph.get(now).get(i).getDistance();
                if (cost < distance[graph.get(now).get(i).getIndex()]) {
                    distance[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node1(graph.get(now).get(i).getIndex(), cost));
                }
            }

        }


    }
}

class Node1 implements Comparable<Node1> {

    private int index;
    private int distance;

    public Node1(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public int compareTo(Node1 other) {
        if (this.distance < other.distance) {
            return -1;
        }

        return 1;
    }
}