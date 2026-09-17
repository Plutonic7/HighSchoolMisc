import java.awt.Color;
public class JumperBug extends Bug{
    private int steps;
    public JumperBug(){
        super(Color.GREEN);
        steps = 0;
    }
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
    public boolean canJump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location jump = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(jump))
            return false;
        Actor neighbor = gr.get(jump);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
    public void move()
    {
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
    public void jump(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location jump = next.getAdjacentLocation(getDirection());
        if (gr.isValid(jump))
            moveTo(jump);
        else
            removeSelfFromGrid();
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }
    public void act(){
        if(canMove()){
            move();
            steps++;
        }else if(canJump()){
            jump();
            steps=0;
        }else{
            turn();
            steps=0;
        }
    }
}