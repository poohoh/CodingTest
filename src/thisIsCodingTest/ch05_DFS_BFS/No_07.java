package thisIsCodingTest.ch05_DFS_BFS;

import java.util.ArrayList;

public class No_07 {
    public static void main(String args[]) {
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>());
        }

        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        graph.get(1).add(new Node(0, 7));

        graph.get(2).add(new Node(0, 5));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
        }

    }
}

class Node {
    private int node;
    private int distance;

    public Node(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.node + ", " + this.distance + ") ");
    }
}
