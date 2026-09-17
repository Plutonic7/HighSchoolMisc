import java.awt.*;
public class Player
{
    private int x, y, size, yInc, xInc;
    private Color color;
    private boolean up, down, left, right, onPlatform;
    public Player()
    {
        x = 500;
        y = 550;
        size = 50;
        xInc = 10;
        yInc = 0;
        color = Color.BLACK;
        onPlatform = true;
    }

    public void move( Platform[] plats )
    {
        if( left == true )
        {
            x -= xInc;
            xInc -= 1;
            left = false;
        }
        if( right == true )
        {
            x += xInc;
            xInc +=1;
            right = false;
        }
        if( up == true || down == true )
        {
            y += yInc;
            yInc += 2;
            if( yInc == 0 )
            {
                up = false;
                down = true;
            }
            else if( onPlatform == true )
            {
                down = false;
                yInc = 0;
            }
        }
        if( down == true )
        {
            for( int i = 0; i < plats.length; i++ )
            {
                if( getRight() > plats[i].getLeft() && getLeft() < plats[i].getRight() )
                {
                    if( getBottom() - plats[i].getTop() > 0 && getBottom() - plats[i].getTop() < yInc )
                    {
                        down = false;
                        yInc = 0;
                        y = plats[i].getTop() - size;
                        onPlatform = true;
                    }
                }
            }
        }
        if( onPlatform == true )
        {
            for( int i = 0; i < plats.length; i++ )
            {
                if( plats[i].getTop() == getBottom() )
                {
                    if( getLeft() > plats[i].getRight() || getRight() < plats[i].getLeft() )
                    {
                        onPlatform = false;
                        down = true;
                        yInc = 2;
                    }
                }
            }
        }
    }
    
    public int getLeft()
    { return x; }
    
    public int getRight()
    { return x + size; }
    
    public int getBottom()
    { return y + size; }
    
    public void left()
    {
        left = true;
    }
    
    public void right()
    {
        right = true;
    }

    public void jump()
    {
        yInc = -30;
        up = true;
        down = false;
        onPlatform = false;
    }
    
    public boolean isJumping()
    {
        return up || down;
    }

    public void draw( Graphics g )
    {
        g.setColor( color );
        g.fillRect( x, y, size, size );
    }
}