import java.util.*;

public class Programmers_49189 {

    public static int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int[] result = bfs(graph, 1, n);
        return getFurthestNode(result);
    }

    private static int getFurthestNode(int[] result) {
        int max = 0;
        int cnt = 0;

        for (int i : result) {
            if (i > max) {
                max = i;
                cnt = 1;
            } else if (i == max) {
                cnt++;
            }
        }

        return cnt;
    }

    private static int[] bfs(List<List<Integer>> graph, int start, int n) {
        int[] visited = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int next : graph.get(x)) {
                if (visited[next] != 0) continue;
                visited[next] = visited[x] + 1;
                queue.add(next);
            }
        }

        return visited;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };
        System.out.println(solution(n, edge));
    }
}