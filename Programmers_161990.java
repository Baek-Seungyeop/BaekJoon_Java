import java.util.*;

public class Programmers_161990 {

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
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

    public static int[] solution(String[] wallpaper) {
        int row = wallpaper.length;
        int col = wallpaper[0].length();

        boolean[][] drag = getDrag(wallpaper, row, col);
        Point[] points = getPoints(row, col, drag);

        List<Integer> answer = getAnswer(points);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    private static List<Integer> getAnswer(Point[] points) {
        int maxX = -1;
        int maxY = -1;
        int minX = 100;
        int minY = 100;
        Point s1 = null, s2 = null;
        Point e1 = null, e2 = null;

        for (Point point : points) {
            if (point.getX() > maxX) {
                maxX = point.getX();
                e1 = point;
            }
            if (point.getY() > maxY) {
                maxY = point.getY();
                e2 = point;
            }
            if (point.getX() < minX) {
                minX = point.getX();
                s1 = point;
            }
            if (point.getY() < minY) {
                minY = point.getY();
                s2 = point;
            }
        }

        int sx = Math.min(s1.getX(), s2.getX());
        int sy = Math.min(s1.getY(), s2.getY());
        int ex = Math.max(e1.getX(), e2.getX());
        int ey = Math.max(e1.getY(), e2.getY());

        Point S = new Point(sx, sy);
        Point E = new Point(ex + 1, ey + 1);

        List<Integer> answer = new ArrayList<>();
        answer.add(S.getX());
        answer.add(S.getY());
        answer.add(E.getX());
        answer.add(E.getY());
        return answer;
    }

    private static Point[] getPoints(int row, int col, boolean[][] drag) {
        List<Point> pointList = new ArrayList<>();

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                if (drag[x][y]) {
                    pointList.add(new Point(x, y));
                }
            }
        }
        return pointList.toArray(new Point[0]);
    }

    private static boolean[][] getDrag(String[] wallpaper, int row, int col) {
        boolean[][] drag = new boolean[row][col];

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                if (wallpaper[x].charAt(y) == '#') {
                    drag[x][y] = true;
                }
            }
        }
        return drag;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new String[]{".#...", "..#..", "...#."})));
//        System.out.println(Arrays.toString(solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
//        System.out.println(Arrays.toString(solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
        System.out.println(Arrays.toString(solution(new String[]{"..", "#."})));
    }
}