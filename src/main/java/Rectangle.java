import java.awt.*;

public class Rectangle {
    private int width;
    private int height;// Fields
    private Point pos;
    private Color col;
    public Rectangle(Point initPos, Color col, int width, int height){ // The constructor
        this.width = width;
        this.height = height; // Initialize fields
        pos=initPos;
        this.col=col;
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }
}
