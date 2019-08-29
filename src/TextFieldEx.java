import javax.swing.*;

public class TextFieldEx extends JFrame
{
	JTextArea output = new JTextArea(5, 15);
	JTextArea textArea = new JTextArea(10,20);
	JTextField input = new JTextField(10);
	JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
			,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	public TextFieldEx()
	{
		output.setEditable(false);
		this.getContentPane().add(input);
		this.getContentPane().add(output);
		input.requestFocus();
		this.setName("Vex Tower Takeover");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(input);
		textArea.setText("Test");
		this.add(scrollPane);
		this.setSize(600,400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
}