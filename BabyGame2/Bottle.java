import java.awt.*;
import javax.swing.*;
public class Bottle extends JLabel
{
    private int x, y, width, height, speed;
    private Color color;
    private ImageIcon image;
    public int score;
    public Bottle()
    {
        width = 50;
        height = 100;
        y = -height;
        x = (int)(Math.random()*931)+10;
        speed = 20;
        color = Color.RED;
        setBounds(x, y, width, height);
        image = new ImageIcon("bottle.jpg");
        setIcon( image );
        setVisible(true);
    }
    public void move()
    {
        y += speed;
        setLocation( x, y );
        if( y >= 600 )
        {
            reset();
            score++;
        }
    }
    
    public int getLeft()
    { return x; }
    
    public int getTop()
    { return y; }
    
    public int getRight()
    { return x + width; }
    
    public int getBottom()
    { return y + height; }
    
    public void reset()
    {
        y = -height;
        speed = 20;
        x = (int)(Math.random()*931)+10;
        setLocation( x, y );
    }
    
    public void draw( Graphics g )
    {
        g.setColor( color );
        g.fillRect(x, y, width, height);
    }
}