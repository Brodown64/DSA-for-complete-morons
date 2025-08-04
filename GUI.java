import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

	private int count = 0;

	private JButton myButton;

	public GUI() {

    JFrame frame = new JFrame();

    myButton = new JButton("Arrays");
    myButton.addActionListener(this);
    myButton.setBounds(100,160,200,40);
    myButton.setFocusable(false);

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(420, 420, 420, 420));
    panel.setLayout(new GridLayout(0, 1));

    panel.add(myButton);
    frame.add(panel, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setTitle("DSA");
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

	public static void main(String[] args) {
		new GUI();
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==myButton) {
			NewWindow myWindow = new NewWindow();
		}

	}
}