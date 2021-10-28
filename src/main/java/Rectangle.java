import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int height;// Fields

    public Rectangle(Point initPos, Color col, int width, int height){
        super(initPos, col); // The constructor
        this.width = width;
        this.height = height; // Initialize fields

    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }
}
