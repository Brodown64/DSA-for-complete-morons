import javax.swing.*;
import java.awt.*;

public class NewStackWindow {
	
	public NewStackWindow() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel arrayLabel = new JLabel("Stacks");
        JLabel arrayLabelDef = new JLabel("stacks: like a stack of plates, you use the first plate on top (FIFO)");
        JLabel multilineLabel = new JLabel("<html>Stack<Integer> s = new Stack<>();<br>Queue<String> q = new LinkedList<>();<br>s.push(1);<br>s.push(2);<br><br>s.push(3);<br><br>s.push(4);<br><br>while(!s.isEmpty()) {<br><br>System.out.println(s.pop());<br><br>}<br></html>");

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
        frame.setTitle("Stacks");
        frame.pack();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
	}
}