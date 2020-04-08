import java.awt.*;

public class Line extends Shapes {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x1, y1, x2-x1, y2-y1);
    }
}