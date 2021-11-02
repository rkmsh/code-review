import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Rohit's Hi-Lo Gessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblRohitsHiloGuessing = new JLabel("Rohit's Hi-Lo Guessing Game");
		lblRohitsHiloGuessing.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblRohitsHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblRohitsHiloGuessing.setBounds(12, 12, 428, 35);
		getContentPane().add(lblRohitsHiloGuessing);
		
		JLabel lblNewLabel = new JLabel("Guess a number between 1 and 100:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 59, 282, 29);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(312, 59, 78, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.setBounds(171, 116, 94, 25);
		getContentPane().add(btnGuess);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a number above and click Guess!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 182, 428, 29);
		getContentPane().add(lblNewLabel_1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
