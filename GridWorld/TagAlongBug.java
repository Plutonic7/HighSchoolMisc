import java.awt.Color;
public class TagAlongBug extends Bug{
    private int steps;
    private Bug target;
    public TagAlongBug( Bug x ){
        super(Color.BLUE);
        steps = 0;
        target = x;
    }
    public void act(){
        if(canMove()){
            move();
            steps++;
        }
        setDirection(getLocation().getDirectionToward(target.getLocation()));
    }
}
