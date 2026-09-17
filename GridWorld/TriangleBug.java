import java.awt.Color;
public class TriangleBug extends Bug{
    private int length;
    private int steps;
    private int vertex;
    public TriangleBug(int len){
        super( Color.PINK );
        length = len;
        steps = 0;
        vertex = 0;
    }
    public void act(){
        if(steps < length && canMove()){
            move();
            steps++;
        }else{
            turn();
            turn();
            if(vertex < 2){
                turn();
            }
            vertex++;
            if(vertex==3){
                vertex=0;
            }steps=0;
        }
    }
}
