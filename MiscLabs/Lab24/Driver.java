public class Driver{
    public static void Main(){
        Life life = new Life();
        for( int i = 0; i < 5; i++ ){
            life.generation();
            life.print();
        }
        life.result();
    }
}
