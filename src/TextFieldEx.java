import javax.swing.*;
import java.awt.event.ActionEvent;

public class TextFieldEx extends JFrame
{
	static JTextArea output = new JTextArea(5, 15);
	static JTextArea textArea = new JTextArea(10,20);
	static JTextField input = new JTextField(10);
	static JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
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
		textArea.setText("");
		this.add(scrollPane);
		this.setSize(600,400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	public  int getScored(String cubeColor)
	{
		textArea.setText("" + cubeColor);
		return Integer.parseInt(textArea.getText());
	}
}