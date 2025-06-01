import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("Draw Star Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Define the points of the star
        int[] xPoints = { 100, 125, 175, 125, 150, 100, 50, 75, 25, 75 };
        int[] yPoints = { 25, 75, 75, 100, 150, 125, 150, 100, 75, 75 };

 g2d.drawPolygon(xPoints, yPoints, 10);
    }

    public static void main(String[] args) {
        Main drawStar = new Main();
        drawStar.setVisible(true);
    }
}
