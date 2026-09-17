public class Recursion{
    private int n = 0;
    public int sumOfFirst(int n){
       if(n != 1){
           return (n + sumOfFirst(n - 1));
       }
       return n;
    }
    public int factorial(int n){
        if(n != 1){
            return (n * factorial(n-1));
        }
        return n;
    }
    public int fibValue(int loc){
        if (loc <= 1){
            return loc;
        }
        return fibValue(loc - 1) + fibValue(loc - 2);
    }
    public int collatz(int n){
        if (n == 1){
            return 0;}
        if (n % 2 == 1){
            n = 3 * n + 1;
            return 1 + collatz(n);
        }else{
            n = n/2;
            return 1 + collatz(n);
        }
    }
}
