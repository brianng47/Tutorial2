import java.awt.*;

public class Square extends Rectangle{
    public Square(Point initPos, Color col, int width, int height) {
        super(initPos, col, width, height);
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }
}
