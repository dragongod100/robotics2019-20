import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class getScored extends JFrame implements ActionListener {
	
	static Scanner sc = new Scanner(System.in);
	static String s;
	static JTextField textfield;
	static JButton jButton;
	
	public static void getScoredCube() {
		
		JFrame jf = new JFrame();
		textfield = new JTextField("", 30);
		jButton = new JButton("Submit");
		jButton.addActionListener(new getScored());
		JPanel panel = new JPanel();
		JLabel jl = new JLabel("Green scored");
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(panel);
		panel.add(jl);
		panel.add(textfield);
		panel.add(jButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		s = textfield.getText();
		
	}
}