import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Board extends JPanel implements ActionListener
{
    private Player p;
    private Platform[] platforms;
    private JButton jump, left, right;
    public Board()
    {
        this.setLayout( null );
        this.setBackground( new Color( 167, 66, 234) );
        this.setPreferredSize( new Dimension( 1000, 600 ) );
        p = new Player();
        platforms = new Platform[4];
        platforms[0] = new Platform( 100, 500, 800, 10 );
        platforms[1] = new Platform( 200, 350, 300, 10 );
        platforms[2] = new Platform( 400, 200, 300, 10 );
        platforms[3] = new Platform(0, 600, 1000, 10 );
        jump = new JButton( "JUMP" );
        jump.setBounds( 400, 10, 200, 50 );
        add( jump );
        jump.addActionListener(this);
        jump.setVisible(true);
        
        left = new JButton( "LEFT" );
        left.setBounds(150, 10, 200, 50 );
        add( left );
        left.addActionListener(this);
        left.setVisible(true);
        
        right = new JButton( "RIGHT" );
        right.setBounds(650, 10, 200, 50 );
        add( right );
        right.addActionListener(this);
        right.setVisible(true);
        setFocusable(true);
    }

    public void go()
    {
        while( true )
        {
            p.move( platforms );
            try
            {
                Thread.sleep(30);
            }catch( InterruptedException ex ){}
            this.repaint();
        }
    }
    
    public void actionPerformed( ActionEvent e )
    {
        if( e.getSource().equals( jump ) && p.isJumping() == false )
        {
            p.jump();
        }
        else if( e.getSource().equals( left ) )
        {
            p.left();
        }
        else if( e.getSource().equals( right ) )
        {
            p.right();
        }
    }

    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        for( int i = 0; i < platforms.length; i++ )
        {
            platforms[i].draw( g );
        }
        p.draw( g );
        
    }
}