import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LaskinApplication {

	private JFrame frame;
	private JTextField textField;
	
	double eka;
	double toka;
	double tulos;
	String laskutoimitus;
	String vastaus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaskinApplication window = new LaskinApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LaskinApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 361, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField.setBounds(10, 10, 327, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setForeground(Color.LIGHT_GRAY);
		btnBackspace.setBackground(Color.DARK_GRAY);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackspace.setBounds(10, 94, 75, 55);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.LIGHT_GRAY);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn7.setBounds(10, 159, 75, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.LIGHT_GRAY);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn4.setBounds(10, 224, 75, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.LIGHT_GRAY);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn1.setBounds(10, 289, 75, 55);
		frame.getContentPane().add(btn1);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.LIGHT_GRAY);
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDot.setBounds(95, 354, 75, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.LIGHT_GRAY);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn8.setBounds(95, 159, 75, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.LIGHT_GRAY);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn5.setBounds(95, 224, 75, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.LIGHT_GRAY);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn2.setBounds(95, 289, 75, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.LIGHT_GRAY);
		btn0.setBackground(Color.DARK_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn0.setBounds(10, 354, 75, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setForeground(Color.LIGHT_GRAY);
		btnDivide.setBackground(Color.DARK_GRAY);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "/";
			}
		});
		btnDivide.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDivide.setBounds(265, 289, 75, 55);
		frame.getContentPane().add(btnDivide);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.LIGHT_GRAY);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn9.setBounds(180, 159, 75, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.LIGHT_GRAY);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn6.setBounds(180, 224, 75, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.LIGHT_GRAY);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn3.setBounds(180, 289, 75, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setForeground(Color.BLACK);
		btnEquals.setBackground(Color.ORANGE);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vastaus;
				toka = Double.parseDouble(textField.getText());
				if(laskutoimitus == "+") {
					tulos = eka + toka;
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
				else if(laskutoimitus == "-") {
					tulos = eka - toka;
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
				else if(laskutoimitus == "*") {
					tulos = eka * toka;
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
				else if(laskutoimitus == "/") {
					tulos = eka / toka;
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
				else if(laskutoimitus == "%") {
					tulos = eka % toka;
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
				else if(laskutoimitus == "^") {
					tulos = Math.pow(eka, toka);
					vastaus = String.valueOf(tulos);
					textField.setText(vastaus);
				}
			}
		});
		btnEquals.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnEquals.setBounds(180, 354, 160, 55);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.LIGHT_GRAY);
		btnPlus.setBackground(Color.DARK_GRAY);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "+";
			}
		});
		btnPlus.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnPlus.setBounds(265, 94, 75, 55);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(Color.LIGHT_GRAY);
		btnMinus.setBackground(Color.DARK_GRAY);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "-";
			}
		});
		btnMinus.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMinus.setBounds(265, 159, 75, 55);
		frame.getContentPane().add(btnMinus);
		
		JButton btnTimes = new JButton("*");
		btnTimes.setForeground(Color.LIGHT_GRAY);
		btnTimes.setBackground(Color.DARK_GRAY);
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "*";
			}
		});
		btnTimes.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnTimes.setBounds(265, 224, 75, 55);
		frame.getContentPane().add(btnTimes);
		
		JButton btnPower = new JButton("^");
		btnPower.setForeground(Color.LIGHT_GRAY);
		btnPower.setBackground(Color.DARK_GRAY);
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "^";
			}
		});
		btnPower.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnPower.setBounds(180, 94, 75, 55);
		frame.getContentPane().add(btnPower);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setForeground(Color.LIGHT_GRAY);
		btnPercent.setBackground(Color.DARK_GRAY);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eka = Double.parseDouble(textField.getText());
				textField.setText("");
				laskutoimitus = "%";
			}
		});
		btnPercent.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnPercent.setBounds(95, 94, 75, 55);
		frame.getContentPane().add(btnPercent);
	}
}
