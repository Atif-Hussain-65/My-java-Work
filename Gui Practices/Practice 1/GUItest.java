import javax.swing.*;
import java.awt.*;
public class GUItest
{
    public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setSize(400,450);
        fr.setTitle("BANK info and atm");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setResizable(false);


        ImageIcon image=new ImageIcon("C:\\Users\\atifa\\IdeaProjects\\test\\classwork\\logo.png");
        fr.setIconImage(image.getImage());
        fr.getContentPane().setBackground(new Color(14, 207, 232));
        fr.setVisible(true);
    }
}
