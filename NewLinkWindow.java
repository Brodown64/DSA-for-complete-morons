import javax.swing.*;
import java.awt.*;

// update:
// show code

public class NewLinkWindow {

    public NewLinkWindow() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel arrayLabel = new JLabel("Linked List");
        JLabel arrayLabelDef = new JLabel("linked list: arrays but connected head to toe, like a map (ex: searching a list until you find the number)");
        JLabel multilineLabel = new JLabel("<html>System.out.println('Link');<br>LinkedList<String> games = new LinkedList<String>();<br>games.add('Mario');<br>games.add('Sonic');<br><br>games.add('Link');<br><br>games.addFirst('Sora');<br><br>games.removeLast();<br><br>System.out.println(games);<br></html>");

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        arrayLabel.setFont(new Font(null, Font.PLAIN, 25));
        arrayLabelDef.setFont(new Font(null, Font.PLAIN, 25));

        panel.add(arrayLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing
        panel.add(arrayLabelDef);
        panel.add(multilineLabel);

        frame.add(panel);  // Add panel with both labels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Array");
        frame.pack();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
    }
}