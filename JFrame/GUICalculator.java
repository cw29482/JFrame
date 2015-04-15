import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUICalculator implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel label;
	private JLabel label2;
	private JButton button;
	
	public GUICalculator() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		label = new JLabel();
		label.setText("Enter a number");
		label.setForeground(Color.WHITE);
		label2 = new JLabel();
		label2.setText("_______");
		label2.setForeground(Color.WHITE);
		
		
		textField1 = new JTextField(5); 
		textField2 = new JTextField(5);
		
		button = new JButton("Find Sum");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(label2);
		
		frame.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1 + num2;
		
		label2.setText(String.valueOf(sum));
		
	}
}
