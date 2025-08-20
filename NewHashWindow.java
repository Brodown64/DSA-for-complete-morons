import javax.swing.*;
import java.awt.*;

public class NewHashWindow {
	
	public NewHashWindow() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel hashLabel = new JLabel("Hash Table");
        JLabel hashLabelDef = new JLabel("hash table: like a locker room, converts the code into a locker number");
        JLabel multilineLabel = new JLabel("<html>Hashtable<String, Integer> num = new Hashtable<String, Integer>();<br>num.put('one', 1);<br>num.put('two', 2);<br>num.put('three', 3);<br><br>Integer n = num.get('two');<br><br>if (n != null) {<br><br>System.out.println('two = ' + n);<br>}<br><br>}<br></html>");

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        hashLabel.setFont(new Font(null, Font.PLAIN, 25));
        hashLabelDef.setFont(new Font(null, Font.PLAIN, 25));

        panel.add(hashLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing
        panel.add(hashLabelDef);
        panel.add(multilineLabel);

        frame.add(panel);  // Add panel with both labels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hash Table");
        frame.pack();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
	}
}