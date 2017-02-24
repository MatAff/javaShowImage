
import java.awt.*;
import javax.swing.*;

public class ShowImage extends JPanel {

    public ShowImage() {
        ImageIcon im = new ImageIcon("redball.png");
        JLabel label = new JLabel(im);
        add(label);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new ShowImage());
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setPreferredSize(new Dimension(200, 300));
    }    

}
