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
            for(int i = 0; i<numRows; i++){
                int row = sc.nextInt();
                int col = sc.nextInt();
                clumpy[row][col] = true;
            }
        }catch(FileNotFoundException ex){}
    }
    public void erase(int row, int col){
        for(int r = 1; r < clumpy.length - 1;r++){
            for(int c = 1; c < clumpy[0].length - 1; c++){
                if (clumpy[r][c]== true){
                    if(clumpy[row+r][col]==true){
                        erase(r+1,c);
                    }else if(clumpy[row-r][col+c]==true){
                        erase(r,c+1);
                    }else if(clumpy[row-r][col]==true){
                        erase(r-1,c);
                    }else if(clumpy[row][col-c]==true){
                        erase(r,c-1);
                    }
                    clumpy[row][col]=false;
                }
            }
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