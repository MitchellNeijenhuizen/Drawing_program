import java.awt.*;

public class Rectangle extends Shapes {

    @Override
    public void draw(Graphics g) {
        g.drawRect(x1, y1, x2-x1, y2-y1);
    }
}