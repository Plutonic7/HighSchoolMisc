public class EightQueens{
    boolean[][] board = new boolean[8][8];
    public void findQueens(int row)
    {        
        if (row == 8){
            printGrid();
            return;
        }
        for(int col = 0; col < board[0].length; col++){
            boolean up = false;
            for(int r = 0; r < board.length; r++){
                if(board[r][col]){
                    up = true;
                }
            }
            if(!up && !checkDiag(row, col)){
                board[row][col] = true;
                findQueens(row + 1);
                board[row][col] = false;                
            }
        }
    }
    public boolean checkDiag(int r, int c){
        return checkDiag(r, c, -1, 1) || checkDiag(r, c, -1, -1);
    }
    public boolean checkDiag(int r, int c, int dx, int dy){
        if(r + dx < 0 || c + dy < 0 || c + dy > 7){
            return false;
        } else{
            if (board[r + dx][c + dy]){
                return true;
            }else{
                return checkDiag(r+dx, c+dy, dx, dy);
            }
        }
    }
    public void printGrid(){
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                if (board[row][col]){
                    System.out.print("Q");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
