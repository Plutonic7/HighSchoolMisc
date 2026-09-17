import java.awt.Color;
public class SpiralBug extends Bug{
    private int steps;
    int dist = 9;
    int count = 0;
    public SpiralBug(){
        super(Color.RED);
        steps = 0;
    }
    public void move(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }
    public void act(){
        if(steps < dist && dist != 0 && canMove()){
            move();
            steps++;
        }else if(steps == dist){
            turn();
            turn();
            steps=0;
            count++;
            if (count == 3){
                count =0;
                dist--;
            }
        }
    }
}

