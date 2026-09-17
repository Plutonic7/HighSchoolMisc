import java.util.Scanner;
public class Driver{
    public static void main() {
        Recursion r = new Recursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int dove = r.sumOfFirst(num1);
        System.out.println("Factorial sum: "+dove);
        int fac = r.factorial(num1);
        System.out.println("Factorial: "+fac);
        int fib = r.fibValue(num1);
        System.out.println("Fibonacci: "+fib);
        int col = r.collatz(num1);
        System.out.println("Collatz: "+col);
    }
}