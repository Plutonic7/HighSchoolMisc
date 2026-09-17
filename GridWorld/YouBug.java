import java.awt.Color;
public class YouBug extends Bug
{
    public void act(){
        if(canBoost()){
            jump(); 
        } else if(canMove()){
            move();
        }else{
            turn();
        }
    }
    public boolean canBoost()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location jump = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(jump))
            return false;
        if (canMove() == false)
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
        Flower flower2 = new Flower(getColor());
        flower2.putSelfInGrid(gr, next);
    }
    
}
