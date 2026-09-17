import java.awt.Color;
public class ZedBug extends Bug{
    private int length;
    private int steps;
    private int segment;
    public ZedBug(int len){
        super(Color.GREEN);
        length = len;
        segment = 1;
        steps = 0;
    }
    public void act(){
        if(segment <= 5 && steps < length){
            if(canMove())
            {
                move();
                steps++;

            }
        }else if(segment == 0){
            setDirection(Location.EAST);
            steps =0;
            segment++;
        }else if(segment ==1){
            setDirection(Location.SOUTHWEST);
            steps =0;
            segment++;
        }else if(segment == 2){
            setDirection(Location.EAST);
            steps =0;
            segment++;
        }else if(segment == 3){
            setDirection(Location.WEST);
            steps= 0;
            segment++;
        }else if(segment == 4){
            setDirection(Location.NORTHEAST);
            steps=0;
            segment++;
        }else if(segment==5){
            setDirection(Location.WEST);
            steps=0;
            segment=0;
        }
        }
    }
      