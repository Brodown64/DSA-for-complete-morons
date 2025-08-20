import javax.swing.*;
import java.awt.*;

public class NewQueueWindow {
	
	public NewQueueWindow() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel queueLabel = new JLabel("Queue");
        JLabel queueLabelDef = new JLabel("queue: like a nightclub, first in at the door is let in by the bouncer");
        JLabel multilineLabel = new JLabel("<html>q.add('Seymour')<br>q.add('Tyler')<br>q.add('Joy')<br>System.out.println('Queue: '  + q);<br><br>String front = q.remove();<br><br>System.out.println('Removed element: ' + front);<br><br>System.out.println('Queue after removal: ' + q);<br></html>");

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        queueLabel.setFont(new Font(null, Font.PLAIN, 25));
        queueLabelDef.setFont(new Font(null, Font.PLAIN, 25));

        panel.add(queueLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing
        panel.add(queueLabelDef);
        panel.add(multilineLabel);

        frame.add(panel);  // Add panel with both labels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Queue");
        frame.pack();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
	}
}