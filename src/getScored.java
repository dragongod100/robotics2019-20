import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class getScored extends JFrame implements ActionListener
{
	
	static Scanner sc = new Scanner(System.in);
	static String s;
	static JTextField textfield;
	static JButton jButton;
	
	public static JLabel jl = new JLabel("Green scored");
	public static void getScoredCube()
	{
		
		JFrame jf = new JFrame();
		textfield = new JTextField("", 30);
		jButton = new JButton("Submit");
		JPanel panel = new JPanel();
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.add(panel);
		panel.add(jl);
		panel.add(textfield);
		panel.add(jButton);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		s = textfield.getText();
	}
	
	public static void getScoredCubes(String name, int count)
	{
		jl.setText(name);
		getScored.jButton.addActionListener(evt -> System.out.println(textfield.getText()));
		getScored.jButton.addActionListener(evt -> count = Integer.parseInt(textfield.getText()));
		getScored.jButton.addActionListener(evt -> textfield.setText(""));
		jButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent evt)
			{
				count = Integer.parseInt(textfield.getText());
			}
		});
	}
}