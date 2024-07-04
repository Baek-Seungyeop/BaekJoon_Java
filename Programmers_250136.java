import java.util.LinkedList;
import java.util.Queue;

public class Programmers_250136 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[][] land) {
        int row = land.length;
        int col = land[0].length;
        int[] oilSize = new int[col];

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (land[y][x] == 1) {
                    int left = 501, right = 0, size = 0;
                    Queue<Point> queue = new LinkedList<>();
                    queue.add(new Point(x, y));
                    land[y][x] = 0;

                    while (!queue.isEmpty()) {
                        Point p = queue.poll();
                        int px = p.x, py = p.y;
                        size++;

                        if (left > px) left = px;
                        if (right < px) right = px;

                        for (int i = 0; i < 4; i++) {
                            int nx = px + dx[i];
                            int ny = py + dy[i];

                            if (nx >= 0 && nx < col && ny >= 0 && ny < row && land[ny][nx] == 1) {
                                land[ny][nx] = 0;
                                queue.add(new Point(nx, ny));
                            }
                        }
                    }

                    for (int i = left; i <= right; i++) {
                        oilSize[i] += size;
                    }
                }
            }
        }

        int answer = 0;
        for (int oil : oilSize) {
            answer = Math.max(answer, oil);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {
                {0, 0},
                {0, 1},
        }));
    }
}