import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

	private int count = 0;
	private JLabel label;

	public GUI() {

		JFrame frame = new JFrame();
		label = new JLabel("Number of clicks: 000");

        JButton button = new JButton("Deez nuts");
        button.addActionListener(this);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120)); // top, bottom, left, right
		panel.setLayout(new GridLayout(0, 1));

		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("DSA");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

	public void actionPerformed(ActionEvent e) {
		count++; // increases count var by 1
		label.setText("Number of clicks: " + count);

	}
}