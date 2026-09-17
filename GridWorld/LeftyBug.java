import java.awt.Color;
public class LeftyBug extends Bug
{
    public void act(){
        if(canMove()){
            move();
        } else{
            turnLeft();
        }
    }
    public void turnLeft(){
        setDirection(getDirection()-45);
    }
}