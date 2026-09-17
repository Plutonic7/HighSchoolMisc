public class Knight{
    private int [][] board;
    private int moveCount;
    private final int size = 8;
    public void go(){
        board[0][0] = moveCount;
        move(0,0);
        printBoard();
    }
    public Knight(){
        board = new int[size][size];
        moveCount = 0;
    }
    private boolean move(int row, int col){
        if(moveCount == size * size -1){
            return true;
        }
        int[] rowMoves = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};
        for(int i = 0; i < rowMoves.length; i++){
            int nextRow = row + rowMoves[i];
            int nextCol = col + colMoves[i];
            if(okMove(nextRow, nextCol)){
                moveCount++;
                board[nextRow][nextCol] = moveCount;
                if(move(nextRow, nextCol)){
                    return true;}
                moveCount--;
                board[nextRow][nextCol] = 0;
            }
        }
        return false;
    }
    private boolean okMove(int row, int col){
        return row >= 0 && row < size && col >= 0 && col < size && board[row][col] == 0;
    }
    private void printBoard() {
        System.out.print("  ");
        for(int j = 0; j < size; j++){
            System.out.print(j + "  ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                if (board[i][j] < 10) {
                    System.out.print("0" + board[i][j] + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
