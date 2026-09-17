import java.awt.*;
public class Platform
{
    private int x, y, width, height;
    private Color color;
    
    public Platform( int xPos, int yPos, int w, int h )
    {
        x = xPos;
        y = yPos;
        width = w;
        height = h;
        color = new Color( 100, 100, 20 );
    }
    
    public int getTop()
    { return y; }
    
    public int getLeft()
    { return x; }
    
    public int getRight()
    { return x + width; }
    
    public void draw( Graphics page )
    {
        page.setColor( color );
        page.fillRect( x, y, width, height );
    }
    
}