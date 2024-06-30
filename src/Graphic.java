import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
      void construktGraohic(){
        JFrame window = new JFrame("Dictionary");
        window.setSize(600 , 400);
        window.setMinimumSize(new Dimension(600 , 400));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    class Button extends JButton{
          public Button(){

          }
    }


}
