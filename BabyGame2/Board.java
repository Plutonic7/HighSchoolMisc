import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Board extends JPanel implements KeyListener
{
    private Bin bin;
    private Bottle[] bottles;
    private JLabel label;
    public int score = 0;
    public Board()
    {
        setLayout(null);
        setPreferredSize( new Dimension( 1000, 600 ) );
        setBackground( new Color( 0, 0, 0) );
        bin = new Bin();
        add(bin);
        bottles = new Bottle[3];
        for( int i = 0; i < bottles.length; i++ )
        {
            bottles[i] = new Bottle();
            add( bottles[i] );
        }
        label = new JLabel( "COLLISIONS: 0" );
        label.setBounds( 300, 10, 400, 50 );
        label.setFont( new Font( "Arial", Font.BOLD, 30) );
        label.setForeground( Color.WHITE );
        label.setHorizontalAlignment( SwingConstants.CENTER );
        add( label );
        label.setVisible(true);
        addKeyListener(this);
        setFocusable(true);
    }
    
    public void go()
    {
        int score = 0;
        while( true )
        {
            bin.move();
            for( int i = 0; i < bottles.length; i++ )
            {
                bottles[i].move();
                if( bin.getRight() > bottles[i].getLeft() && bin.getLeft() < bottles[i].getRight() && bin.getTop() < bottles[i].getBottom() && bin.getBottom() > bottles[i].getTop() )
                {
                    score++;
                    label.setText( "COLLISIONS: " + score );
                    bottles[i].reset();
                }
            }
            try
            {
                Thread.sleep(30);
            }catch( InterruptedException ex ){}
            this.repaint();
        }
    }
    
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        for( int i = 0; i < bottles.length; i++ )
        {
            //bottles[i].draw( g );
        }
        bin.draw( g );
    }
    
    public void keyTyped( KeyEvent e )
    {}
    
    public void keyPressed( KeyEvent e )
    {
        if( e.getKeyCode() == KeyEvent.VK_LEFT ){
            bin.setLeft(true);
            bin.setRight(false);
        }
        else if( e.getKeyCode() == KeyEvent.VK_RIGHT ){
            bin.setRight(true);
            bin.setLeft(false);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            bin.setDown(true);
        }
    }
    
    public void keyReleased( KeyEvent e )
    {
        if( e.getKeyCode() == KeyEvent.VK_LEFT )
        {
            bin.setLeft(false);
        }
        else if( e.getKeyCode() == KeyEvent.VK_RIGHT )
        {
            bin.setRight(false);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            bin.setDown(false);
        }
    }
    
}