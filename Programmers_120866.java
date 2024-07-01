public class Programmers_120866 {

    public static int solution(int[][] board) {
        int row = board[0].length;
        int col = board.length;
        int[][] copyBoard = getCopyBoard(board, row, col);
        return getAnswer(copyBoard);
    }

    private static int[][] getCopyBoard(int[][] board, int row, int col) {
        int[][] copyBoard = new int[col][row];

        for (int y = 0; y < col; y++) {
            for (int x = 0; x < row; x++) {
                if(board[y][x] == 1) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if(y + j < 0 || y + j >= row || x + i < 0 || x + i >= col) continue;
                            copyBoard[y + j][x + i] = 1;
                        }
                    }
                }
            }
        }
        return copyBoard;
    }

    private static int getAnswer(int[][] copyBoard) {
        int answer = 0;
        for (int[] line : copyBoard) {
            for (int i : line) {
                if (i == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}
        }));
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}
        }));
        System.out.println(solution(new int[][]{
                {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}
        }));
    }

}
