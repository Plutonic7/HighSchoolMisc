import javax.swing.*;
import java.awt.*;
public class Driver
{
    public static void main()
    {
        JFrame frame = new JFrame( "This is my frame" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLocation( 100, 100 );
        Board b = new Board();
        frame.add( b );
        frame.pack();
        frame.setVisible( true );
        b.go();
    }
}