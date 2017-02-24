
import java.awt.*;
import javax.swing.*;

public class ShowImage2 extends JPanel {

    JFrame frame; 
    
    public ShowImage2() {
        
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setPreferredSize(new Dimension(200, 300));
        
        ImageIcon im = new ImageIcon("redball.png");
        JLabel label = new JLabel(im);
        frame.add(label);
    }

    public static void main(String[] args) {
        
        ShowImage2 si = new ShowImage2();
        
    }    

}
