import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Circle c1;
    private Rectangle r1;
    private Frame f;
    // The constructor
    public Drawing(){

        Point p1=new Point(200,200);
        Point p2=new Point(300,200);
        Color c=new Color(0x992266);// The RGB number comprises three bytes: red, green and blue

        c1 = new Circle(p1,c,50);
        r1 = new Rectangle(p2,c,25, 25);

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        r1.draw(g);
        c1.draw(g);
    }


}

