import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Life{
    private boolean[][] clumpy;
    public void clumpGone(){
        clumpy = new boolean[22][22];
        try{
            Scanner sc = new Scanner(new File("digital.txt"));
            int numRows  = sc.nextInt();
            for(int i = 0; i < numRows; i++){
                int r = sc.nextInt();
                int c = sc.nextInt();
                clumpy[r][c] = true;
            }
        }catch(FileNotFoundException ex){}
    }
    public void erase(int row, int col){  
                if (clumpy[row][col]==true){
                    clumpy[row][col]=false;
                    if(clumpy[row+1][col]==true){
                        erase(row+1,col);
                    }
                    if(clumpy[row][col+1]==true){
                        erase(row,col+1);
                    }
                    if(clumpy[row-1][col]==true){
                        erase(row-1,col);
                    }
                    if(clumpy[row][col-1]==true){
                        erase(row,col-1);
                    }
                    return;
        }
    }
    public void print(){
        for(int r = 1; r < clumpy.length - 1;r++){
            for(int c = 1; c < clumpy[0].length - 1; c++){
                if (clumpy[r][c]== true){
                    System.out.print("@");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}