import java.awt.*;
import javax.swing.*;
public class Bin extends JLabel
{
    private int x, y, width, height;
    private Color color;
    private boolean left, right, down;
    private ImageIcon image;
    public Bin()
    {
        x = 400;
        y = 500;
        color = Color.GREEN;
        width = 200;
        height = 100;
        setBounds(x, y, width, height);
        image = new ImageIcon( "bin.png" );
        setIcon( image );
        setVisible(true);
    }
    public void move()
    {
        if( left == true && x > 0 )
        {
            if( down == true){
                x-=50;
            }else{
                x -= 30;
            }
        }
        else if( right == true && x + width < 1000 )
        {
            if( down == true){
                x+=50;
            }else{
                x += 30;
            }
        }
        setLocation(x, y);
    }
    
    public int getLeft()
    { return x; }
    
    public int getTop()
    { return y; }
    
    public int getRight()
    { return x + width; }
    
    public int getBottom()
    { return y + height; }
    
    public void setLeft( boolean temp )
    { left = temp; }
    
    public void setRight( boolean temp )
    { right = temp; }
    
    public void setDown(boolean temp)
    {down = temp;}
    
    public void draw( Graphics g )
    {
        g.setColor( color );
        g.fillRect( x, y, width, height );
    }
}