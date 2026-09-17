import java.awt.Color;
public class BoxBug extends Bug{
    private int length;
    private int steps;
    public BoxBug(int len){
        super(Color.DARK_GRAY);
        length = len;
        steps = 0;
    }
    public void act(){
        if(steps < length && canMove()){
            move();
            steps++;
        }else{
            turn();
            turn();
            steps=0;
        }
    }
}
