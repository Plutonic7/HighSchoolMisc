import java.awt.Color;
public class Octobug extends Bug{
    private int length;
    private int steps;
    public Octobug(int len){
        super(Color.GREEN);
        length = len;
        steps = 0;
    }
    public void act(){
        if(steps < length && canMove()){
            move();
            steps++;
            
        }else{
            turn();
            steps=0;
        }
    }
}