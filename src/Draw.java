import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Draw extends JFrame implements MouseListener {

    Shapes figure = new Rectangle();

    ArrayList <Shapes> figureStorage = new ArrayList<>();

    public Draw() throws HeadlessException {
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        figure.draw(g);

        for (Shapes item : figureStorage) {
            item.draw(g);
        }
    }
    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setSize(200, 200);
        draw.setVisible(true);
        draw.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed is working! ");

        figure.x1 = e.getX();
        figure.y1 = e.getY();
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased is working! ");

        if (e.getButton() == MouseEvent.BUTTON1){  //(e.isPopupTrigger())
            figure = new Rectangle();
        }
        else if (e.getButton() == MouseEvent.BUTTON2) {
            figure = new Line();
        }

        else if (e.getButton() == MouseEvent.BUTTON3){
            figure = new Oval();
        }
        figureStorage.add(figure);
        figure.x2 = e.getX();
        figure.y2 = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}