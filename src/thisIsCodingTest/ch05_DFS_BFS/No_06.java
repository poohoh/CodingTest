package thisIsCodingTest.ch05_DFS_BFS;

public class No_06 {
    public static void main(String args[]) {
        final int inf = 999999999;

        int[][] graph = {
                {0, 7, 5},
                {7, 0, inf},
                {5, inf, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
