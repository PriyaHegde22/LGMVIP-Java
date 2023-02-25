package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 153, 204));
		frame.setBounds(100, 100, 544, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Scientific Calculator");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(90, 10, 395, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Arial Black", Font.BOLD, 20));
		textField.setBounds(10, 44, 509, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnroots = new JButton("\u221A");
		btnroots.setEnabled(false);
		btnroots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnroots.setFont(new Font("Calibri", Font.BOLD, 22));
		btnroots.setBounds(10, 154, 101, 49);
		frame.getContentPane().add(btnroots);
		
		final JButton btndivx = new JButton("1/x");
		btndivx.setEnabled(false);
		btndivx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btndivx.setFont(new Font("Calibri", Font.BOLD, 22));
		btndivx.setBounds(10, 213, 101, 49);
		frame.getContentPane().add(btndivx);
		
		final JButton btnpow = new JButton("x^y");
		btnpow.setEnabled(false);
		btnpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnpow.setFont(new Font("Calibri", Font.BOLD, 22));
		btnpow.setBounds(425, 331, 94, 49);
		frame.getContentPane().add(btnpow);
		
		final JButton btncube = new JButton("x^3");
		btncube.setEnabled(false);
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncube.setFont(new Font("Calibri", Font.BOLD, 22));
		btncube.setBounds(422, 390, 97, 49);
		frame.getContentPane().add(btncube);
		
		final JButton btnsqr = new JButton("x^2");
		btnsqr.setEnabled(false);
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsqr.setFont(new Font("Calibri", Font.BOLD, 22));
		btnsqr.setBounds(425, 449, 94, 49);
		frame.getContentPane().add(btnsqr);
		
		final JButton btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnfact.setFont(new Font("Calibri", Font.BOLD, 22));
		btnfact.setBounds(10, 272, 101, 49);
		frame.getContentPane().add(btnfact);
		
		final JButton btnplsmin = new JButton("+/-");
		btnplsmin.setEnabled(false);
		btnplsmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplsmin.setFont(new Font("Calibri", Font.BOLD, 22));
		btnplsmin.setBounds(112, 272, 101, 49);
		frame.getContentPane().add(btnplsmin);
		
		final JButton btnsin = new JButton("Sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Calibri", Font.BOLD, 22));
		btnsin.setBounds(217, 154, 98, 49);
		frame.getContentPane().add(btnsin);
		
		final JButton btnsinh = new JButton("Sinh");
		btnsinh.setEnabled(false);
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setFont(new Font("Calibri", Font.BOLD, 22));
		btnsinh.setBounds(217, 213, 98, 49);
		frame.getContentPane().add(btnsinh);
		
		final JButton bclear = new JButton("C");
		bclear.setEnabled(false);
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bclear.setFont(new Font("Calibri", Font.BOLD, 22));
		bclear.setBounds(321, 272, 98, 49);
		frame.getContentPane().add(bclear);
		
		final JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn8.setBounds(115, 331, 98, 49);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn5.setBounds(115, 390, 98, 49);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn2.setBounds(115, 449, 98, 49);
		frame.getContentPane().add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn0.setBounds(10, 508, 204, 49);
		frame.getContentPane().add(btn0);
		
		final JButton btncos = new JButton("Cos");
		btncos.setEnabled(false);
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setFont(new Font("Calibri", Font.BOLD, 22));
		btncos.setBounds(321, 154, 97, 49);
		frame.getContentPane().add(btncos);
		
		final JButton btncosh = new JButton("Cosh");
		btncosh.setEnabled(false);
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setFont(new Font("Calibri", Font.BOLD, 22));
		btncosh.setBounds(321, 213, 97, 49);
		frame.getContentPane().add(btncosh);
		
		final JButton btnB = new JButton("\uF0E7");
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bspace=str.toString();
					textField.setText(bspace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnB.setBounds(422, 272, 97, 49);
		frame.getContentPane().add(btnB);
		
		final JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn9.setBounds(217, 331, 97, 49);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn6.setBounds(217, 390, 97, 49);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn3.setBounds(217, 449, 97, 49);
		frame.getContentPane().add(btn3);
		
		final JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.setFont(new Font("Arial Black", Font.BOLD, 22));
		btndot.setBounds(217, 508, 97, 49);
		frame.getContentPane().add(btndot);
		
		final JButton btntan = new JButton("Tan");
		btntan.setEnabled(false);
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setFont(new Font("Calibri", Font.BOLD, 22));
		btntan.setBounds(421, 154, 98, 49);
		frame.getContentPane().add(btntan);
		
		final JButton btntanh = new JButton("Tanh");
		btntanh.setEnabled(false);
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setFont(new Font("Calibri", Font.BOLD, 22));
		btntanh.setBounds(421, 213, 98, 49);
		frame.getContentPane().add(btntanh);
		
		final JButton btnplus = new JButton("+");
		btnplus.setEnabled(false);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("+");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnplus.setBounds(321, 508, 98, 49);
		frame.getContentPane().add(btnplus);
		
		final JButton btnsub = new JButton("-");
		btnsub.setEnabled(false);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnsub.setBounds(321, 331, 98, 49);
		frame.getContentPane().add(btnsub);
		
		final JButton btnmul = new JButton("*");
		btnmul.setEnabled(false);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnmul.setBounds(321, 390, 98, 49);
		frame.getContentPane().add(btnmul);
		
		final JButton btndiv = new JButton("/");
		btndiv.setEnabled(false);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Arial Black", Font.BOLD, 22));
		btndiv.setBounds(321, 449, 98, 49);
		frame.getContentPane().add(btndiv);
		
		final JButton btneql = new JButton("=");
		btneql.setEnabled(false);
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double result1=1;
					for(int i=0;i<second;i++)
					{
					result1=Math.pow(first,second);
					}
					answer=String.format("%.2f",result1);
					textField.setText(answer);
				}
			}
		});
		btneql.setFont(new Font("Arial Black", Font.BOLD, 22));
		btneql.setBounds(421, 508, 98, 49);
		frame.getContentPane().add(btneql);
		
		final JButton btnexponen = new JButton("e^x");
		btnexponen.setEnabled(false);
		btnexponen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnexponen.setFont(new Font("Calibri", Font.BOLD, 22));
		btnexponen.setBounds(112, 154, 102, 49);
		frame.getContentPane().add(btnexponen);
		
		final JButton btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Calibri", Font.BOLD, 22));
		btnlog.setBounds(112, 213, 102, 49);
		frame.getContentPane().add(btnlog);
		
		final JButton btnpercent = new JButton("%");
		btnpercent.setEnabled(false);
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Calibri", Font.BOLD, 22));
		btnpercent.setBounds(217, 272, 98, 49);
		frame.getContentPane().add(btnpercent);
		
		final JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn7.setBounds(10, 331, 102, 49);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn4.setBounds(10, 390, 102, 49);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn1.setBounds(10, 449, 102, 49);
		frame.getContentPane().add(btn1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btndot.setEnabled(true);
				btnplsmin.setEnabled(true);
				btnplus.setEnabled(true);
				btnsub.setEnabled(true);
				btndiv.setEnabled(true);
				btnmul.setEnabled(true);
				btneql.setEnabled(true);

				btnpercent.setEnabled(true);
				bclear.setEnabled(true);
				btnB.setEnabled(true);

				btnroots.setEnabled(true);
				btndivx.setEnabled(true);
				btnlog.setEnabled(true);
				btnsinh.setEnabled(true);
				btncosh.setEnabled(true);
				btntanh.setEnabled(true);
				btnpow.setEnabled(true);
				btncube.setEnabled(true);
				btnsqr.setEnabled(true);
				btnfact.setEnabled(true);
				btnexponen.setEnabled(true);
				btnsin.setEnabled(true);
				btncos.setEnabled(true);
				btntan.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(10, 117, 103, 31);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btndot.setEnabled(false);
				btnplsmin.setEnabled(false);
				btnplus.setEnabled(false);
				btnsub.setEnabled(false);
				btndiv.setEnabled(false);
				btnmul.setEnabled(false);
				btneql.setEnabled(false);

				btnpercent.setEnabled(false);
				bclear.setEnabled(false);
				btnB.setEnabled(false);

				btnroots.setEnabled(false);
				btndivx.setEnabled(false);
				btnlog.setEnabled(false);
				btnsinh.setEnabled(false);
				btncosh.setEnabled(false);
				btntanh.setEnabled(false);
				btnpow.setEnabled(false);
				btncube.setEnabled(false);
				btnsqr.setEnabled(false);
				btnfact.setEnabled(false);
				btnexponen.setEnabled(false);
				btnsin.setEnabled(false);
				btncos.setEnabled(false);
				btntan.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Arial", Font.BOLD, 16));
		rdbtnOff.setBounds(114, 117, 103, 31);
		frame.getContentPane().add(rdbtnOff);
	}
}