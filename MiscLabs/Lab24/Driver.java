public class Driver{
    public static void Main(){
        Life l = new Life();
        for(int i = 0; i < 5; i++){
            l.generation();
            l.print();
        }
        l.result();
    }
}
