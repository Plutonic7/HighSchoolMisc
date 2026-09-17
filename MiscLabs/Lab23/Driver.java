import java.util.Scanner;
import java.util.*;
public class Driver{
    public static void main(){
        Array a = new Array();
        System.out.println("type a number to find the amount of times it occurs");
        Scanner sc = new Scanner(System.in); 
        a.Array1();
        int x = sc.nextInt();
        int large = a.Largest();
        System.out.println("The largest number is " + large);
        double ave = a.highestAverage();
        System.out.println("The highest average row is row " + ave);
        int mval = a.MostVal();
        System.out.println("The number that shows the most is "+ mval);
        int nval = a.NumOfVal(x);
        System.out.println("The number "+ x +" shows " + nval + " times");
        int odds = a.highestOdds();
        System.out.println("The column with the most odds is "+ odds);
    } 
}