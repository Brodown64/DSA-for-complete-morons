import javax.swing.*;
import java.awt.*;

// update:
// show code

public class NewWindow {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel arrayLabel = new JLabel("Array");
    JLabel arrayLabelDef = new JLabel("arrays (int[]): a list of variables that can be sorted or done whatever with");
    JLabel arrayLabelCode = new JLabel("")

    public NewWindow() {
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        arrayLabel.setFont(new Font(null, Font.PLAIN, 25));
        arrayLabelDef.setFont(new Font(null, Font.PLAIN, 25));

        panel.add(arrayLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing
        panel.add(arrayLabelDef);

        frame.add(panel);  // Add panel with both labels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Array");
        frame.pack();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
    }
}