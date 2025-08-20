import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

	private int count = 0;

	private JButton myButton;
    private JButton myLinked;
    private JButton myStack;
    private JButton myQueue;
    private JButton myHash;

	public GUI() {

    JFrame frame = new JFrame();

    myButton = new JButton("Arrays");
    myLinked = new JButton("Linked Lists");
    myStack = new JButton("Stacks");
    myQueue = new JButton("Queue");
    myHash = new JButton("Hash Table");
    myButton.addActionListener(this);
    myButton.setBounds(100,160,200,40);
    myButton.setFocusable(false);
    myLinked.addActionListener(this);
    myLinked.setBounds(100,160,200,40);
    myLinked.setFocusable(false);
    myStack.addActionListener(this);
    myStack.setBounds(100,160,200,40);
    myStack.setFocusable(false);
    myQueue.addActionListener(this);
    myQueue.setBounds(100,160,200,40);
    myQueue.setFocusable(false);
    myHash.addActionListener(this);
    myHash.setBounds(100,160,200,40);
    myHash.setFocusable(false);

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(420, 420, 420, 420));
    panel.setLayout(new GridLayout(0, 1));

    panel.add(myButton);
    panel.add(myLinked);
    panel.add(myStack);
    panel.add(myQueue);
    panel.add(myHash);
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
        if(e.getSource()==myLinked) {
            NewLinkWindow myLinkWindow = new NewLinkWindow();
        }
        if(e.getSource()==myStack) {
            NewStackWindow myStackWindow = new NewStackWindow();
        }
        if(e.getSource()==myQueue) {
            NewQueueWindow myQueueWindow = new NewQueueWindow();
        }
        if(e.getSource()==myHash) {
            NewQueueWindow myHashWindow = new NewQueueWindow();
        }


	}
}