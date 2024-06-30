import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static javax.swing.GroupLayout.Alignment.*;

public class Graphic extends Container {
      void construktGraohic(){
        JFrame f = new JFrame("Dictionary");
        GridLayout columns = new GridLayout(2, 2, 10, 5);
        f.setSize(600,400);
        f.setMaximumSize(new Dimension(600,400));
        f.setLocationRelativeTo(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(new JButton("New"));
        panel.add(new JButton("Delete"));
        panel.add(new JButton("Overdriver"));
        panel.add(new JButton("Test"));
        panel.setLayout(columns);
        f.add(panel);
        f.setVisible(true);






    }

}
