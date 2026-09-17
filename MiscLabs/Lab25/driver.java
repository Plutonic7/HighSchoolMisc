import java.util.*;
import java.io.*;
public class driver{
    public static void main(){
        Life n = new Life();
        n.clumpGone();
        n.print(); 
        System.out.println("Row of clump to delete?");
        Scanner xp = new Scanner(System.in);
        int row = xp.nextInt();
        System.out.println("Column of clump to delete?");
        int col = xp.nextInt();
        n.erase(row+1,col+1);
        n.print();
    }
}