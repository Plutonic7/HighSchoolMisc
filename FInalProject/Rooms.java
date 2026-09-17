import java.util.Scanner;
import java.io.*;
public class Rooms{
    public String[][] Room;
    public void room(){
        Room = new String[12][12];
        for( int r = 0; r < Room.length; r++ ){
            for( int c = 0; c < Room[0].length; c++ ){
                Room[r][c]="-";
            }
        }
        try{
            Scanner sc = new Scanner( new File("Walls.txt"));
            int numPairs = sc.nextInt();
            for( int i = 0; i < numPairs; i++ ){
                int row = sc.nextInt();
                int col = sc.nextInt();
                Room[row][col] = "#";
            }
        }catch( FileNotFoundException ex ){System.out.println( "No file"); }
        try{
            Scanner sc = new Scanner( new File("Mobs.txt"));
            int numPairs = sc.nextInt();
            for( int i = 0; i < numPairs; i++ ){
                int row = sc.nextInt();
                int col = sc.nextInt();
                Room[row][col] = "X";
            }
        }catch( FileNotFoundException ex ){System.out.println( "No file"); }
    } 
    public void printRoom(){
        for( int r = 1; r < Room.length; r++ ){
            for( int c = 1; c < Room[0].length; c++ ){
                System.out.print(Room[r][c]);
            }
            System.out.println();
        }
    }
}