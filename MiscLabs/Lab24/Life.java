import java.util.Scanner;
import java.io.*;
public class Life
{
    private boolean[][] bacteria;
    public Life(){
        bacteria = new boolean[22][22];
        try{
            Scanner sc = new Scanner( new File( "life100.txt" ) );
            int numPairs = sc.nextInt();
            for( int i = 0; i < numPairs; i++ ){
                int row = sc.nextInt();
                int col = sc.nextInt();
                bacteria[row][col] = true;
            }
        }catch( FileNotFoundException ex ){System.out.println( "No file"); }
    }
    public void result(){
        int rowTenCount = 0;
        for(int c = 0; c < bacteria[10].length; c++){
            if (bacteria[10][c] == true){
                rowTenCount++;
            }
        }
        System.out.println("Number in Row 10 ---> " + rowTenCount);
        int columnTenCount = 0;
        for(int r = 0; r < bacteria[10].length; r++){
            if (bacteria[r][10] == true){
                columnTenCount++;
            }
        }
        System.out.println("Number in Column 10 ---> " + columnTenCount);
        int count = 0;
        for( int r = 0; r < bacteria.length; r++){
            for(int c = 0; c < bacteria[0].length; c++){
                if(bacteria[r][c] == true){
                    count++;
                }
            }
        }
        System.out.println("Number of living organisms ---> " + count);
    }
    public void print(){
        for( int r = 0; r < bacteria.length; r++ ){
            for( int c = 0; c < bacteria[0].length; c++ ){
                if( bacteria[r][c] == true ){
                    System.out.print( "*" );
                }else{
                    System.out.print( " " );
                }
            }
            System.out.println();
        }
    }
    public void generation()
    {
        boolean[][] temp = new boolean[22][22];//create a new blank array
        for( int r = 1; r < bacteria.length-1; r++ ){
            for( int c = 1; c < bacteria[0].length-1; c++ ){
                if( bacteria[r][c] == false ){
                    if(neighbors(r,c) == 3){
                        temp[r][c] = true;
                    }
                }
                else if(bacteria[r][c] == true ){
                    if( neighbors(r,c) <= 1 || neighbors(r,c) >= 4 ){
                        temp[r][c] = false;
                    }else if( neighbors(r,c) == 2 || neighbors(r,c) == 3){
                        temp[r][c] = true;
                    }
                }
            }
        }
        bacteria = temp;//assign updated array to bacteria
    }
    public int neighbors( int row, int col ){
        int neighbor = 0;
        for( int r = row - 1; r <= row + 1; r++ ){
            for( int c = col - 1; c <= col + 1; c++ ){
                if( bacteria[r][c] == true ){
                    neighbor++;
                    if( r == row && c == col ){
                        neighbor--;
                    }
                }
            }
        }
        return neighbor;
    }
}
