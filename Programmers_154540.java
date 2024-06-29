import java.util.*;

public class Programmers_154540 {

    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int size = 0;

    public static int[] solution(String[] maps) {
        int row = maps[0].length();
        int col = maps.length;

        int[][] map = getMap(maps, row, col);
        visited = new boolean[col][row];  // 방문 체크 배열 초기화

        List<Integer> areas = getAreas(row, col, map);
        if (areas.isEmpty())
            return new int[]{-1};
        return areas.stream().mapToInt(i -> i).sorted().toArray();
    }

    private static int[][] getMap(String[] maps, int row, int col) {
        int[][] map = new int[col][row];

        for (int x = 0; x < col; x++) {
            for (int y = 0; y < row; y++) {
                char grid = maps[x].charAt(y);
                map[x][y] = grid == 'X' ? 0 : grid - '0';
            }
        }
        return map;
    }

    private static List<Integer> getAreas(int row, int col, int[][] map) {
        List<Integer> areas = new ArrayList<>();

        for (int x = 0; x < col; x++) {
            for (int y = 0; y < row; y++) {
                if (!visited[x][y] && map[x][y] != 0) {
                    size = 0;
                    dfs(map, x, y, row, col);
                    areas.add(size);
                }
            }
        }
        return areas;
    }

    private static void dfs(int[][] map, int x, int y, int row, int col) {
        visited[x][y] = true;
        size += map[x][y];  // 현재 위치의 값을 size에 더함

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= col || ny < 0 || ny >= row) continue;  // 경계 체크
            if (!visited[nx][ny] && map[nx][ny] != 0) {  // 방문하지 않았고, 값이 0이 아닌 경우
                dfs(map, nx, ny, row, col);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{
                "X591X",
                "X1X5X",
                "X231X",
                "1XXX1"
        })));
    }
}