import java.awt.Color;
public class BogoBug extends Bug{
    private int length;
    private int steps;
    public BogoBug(int len){
        length = (int)(Math.random()*10);
        steps = 0;
        setColor(new Color(50,125,(int)(Math.random()*256)));
    }
    public void act(){
        if(steps < length && canMove()){
            move();
            steps++;
            
        }else{
            length = (int)(Math.random()*10);
            steps = 0;
            setColor(new Color(50,125,(int)(Math.random()*256))); 
            setDirection((int)(Math.random()*360));
        }
    }
}
