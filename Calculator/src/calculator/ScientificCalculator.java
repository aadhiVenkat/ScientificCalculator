package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class ScientificCalculator {

	private JFrame frmScientificcalculator;
	private JTextField textField;
	private JRadioButton rdbtnOff,rdbtnOn;
	private JButton btnR;
	private JButton btnR_1;
	private JButton btnR_2;
	private JButton btnR_3;
	private JButton btnR_4;
	private JButton btnR_5;
	private JButton btnR_6;
	private JButton btnR_7;
	private JButton btnR_8;
	private JButton btnR_9;
	private JButton btnR_10;
	private JButton btnR_11;
	private JButton btnR_12;
	private JButton btnR_13;
	private JButton btnR_14;
	private JButton btnR_15;
	private JButton btnR_16;
	private JButton btnR_17;
	private JButton btnR_18;
	private JButton btnR_19;
	private JButton btnR_20;
	private JButton btnR_21;
	private JButton btnR_22;
	private JButton btnR_23;
	private JButton btnR_24;
	private JButton btnR_25;
	private JButton btnR_26;
	private JButton btnR_27;
	private JButton btnR_28;
	private JButton btnR_29;
	private JButton btnR_30;
	private JButton btnR_32;
	private JButton btnR_33;
	private JButton btnR_34;
	JLabel lblNewLabel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	double num1,result;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmScientificcalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}


	public void disable() {
		textField.setEnabled(false);
		rdbtnOn.setEnabled(true);
		rdbtnOff.setEnabled(false);
		
		btnR.setEnabled(false);
		btnR_1.setEnabled(false);
		btnR_2.setEnabled(false);
		btnR_3.setEnabled(false);
		btnR_4.setEnabled(false);
		btnR_5.setEnabled(false);
		btnR_6.setEnabled(false);
		btnR_7.setEnabled(false);
		btnR_8.setEnabled(false);
		btnR_9.setEnabled(false);
		btnR_10.setEnabled(false);
		btnR_11.setEnabled(false);
		btnR_12.setEnabled(false);
		btnR_13.setEnabled(false);
		btnR_14.setEnabled(false);
		btnR_15.setEnabled(false);
		btnR_16.setEnabled(false);
		btnR_17.setEnabled(false);
		btnR_18.setEnabled(false);
		btnR_19.setEnabled(false);
		btnR_20.setEnabled(false);
		btnR_21.setEnabled(false);
		btnR_22.setEnabled(false);
		btnR_23.setEnabled(false);
		btnR_24.setEnabled(false);
		btnR_25.setEnabled(false);
		btnR_26.setEnabled(false);
		btnR_27.setEnabled(false);
		btnR_28.setEnabled(false);
		btnR_29.setEnabled(false);
		btnR_30.setEnabled(false);		
		btnR_32.setEnabled(false);
		btnR_33.setEnabled(false);
		btnR_34.setEnabled(false);		
		
	}
	public void enable() {
		textField.setEnabled(true);
		rdbtnOff.setEnabled(true);
		rdbtnOn.setEnabled(false);
		btnR.setEnabled(true);
		btnR_1.setEnabled(true);
		btnR_2.setEnabled(true);
		btnR_3.setEnabled(true);
		btnR_4.setEnabled(true);
		btnR_5.setEnabled(true);
		btnR_6.setEnabled(true);
		btnR_7.setEnabled(true);
		btnR_8.setEnabled(true);
		btnR_9.setEnabled(true);
		btnR_10.setEnabled(true);
		btnR_11.setEnabled(true);
		btnR_12.setEnabled(true);
		btnR_13.setEnabled(true);
		btnR_14.setEnabled(true);
		btnR_15.setEnabled(true);
		btnR_16.setEnabled(true);
		btnR_17.setEnabled(true);
		btnR_18.setEnabled(true);
		btnR_19.setEnabled(true);
		btnR_20.setEnabled(true);
		btnR_21.setEnabled(true);
		btnR_22.setEnabled(true);
		btnR_23.setEnabled(true);
		btnR_24.setEnabled(true);
		btnR_25.setEnabled(true);
		btnR_26.setEnabled(true);
		btnR_27.setEnabled(true);
		btnR_28.setEnabled(true);
		btnR_29.setEnabled(true);
		btnR_30.setEnabled(true);		
		btnR_32.setEnabled(true);
		btnR_33.setEnabled(true);
		btnR_34.setEnabled(true);		
		
	}
	public void operation() {
		switch(operation){
		case 1:
			result=num1+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			result=num1=0;
			break;
		case 2:
			result=num1-Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			result=num1=0;
			break;
		case 3:
			result=num1*Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			result=num1=0;
			break;
		case 4:
			result=num1/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			result=num1=0;
			break;
		case 5:
			result=num1%Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			result=num1=0;
			break;
		}
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificcalculator = new JFrame();
		frmScientificcalculator.setResizable(false);
		frmScientificcalculator.setTitle("ScientificCalculator");
		frmScientificcalculator.setBounds(100, 100, 324, 357);
		frmScientificcalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificcalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 36, 300, 28);
		frmScientificcalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		rdbtnOn = new JRadioButton("ON");
		buttonGroup.add(rdbtnOn);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			enable();
			}
		});
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOn.setBounds(10, 71, 47, 23);
		frmScientificcalculator.getContentPane().add(rdbtnOn);
		
		rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			disable();
			}
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOff.setBounds(59, 71, 59, 23);
		frmScientificcalculator.getContentPane().add(rdbtnOff);
		
		btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnR.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR.setBounds(10, 94, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR);
		
		btnR_1 = new JButton("exp");
		btnR_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnR_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_1.setBounds(69, 94, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_1);
		
		btnR_2 = new JButton("sin");
		btnR_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_2.setBounds(129, 94, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_2);
		
		btnR_3 = new JButton("cos");
		btnR_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_3.setBounds(190, 94, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_3);
		
		btnR_4 = new JButton("tan");
		btnR_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_4.setBounds(251, 94, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_4);
		
		btnR_5 = new JButton("tanh");
		btnR_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnR_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnR_5.setBounds(251, 126, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_5);
		
		btnR_6 = new JButton("cosh");
		btnR_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnR_6.setBounds(190, 126, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_6);
		
		btnR_7 = new JButton("sinh");
		btnR_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnR_7.setBounds(129, 126, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_7);
		
		btnR_8 = new JButton("log");
		btnR_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_8.setBounds(69, 126, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_8);
		
		btnR_9 = new JButton("1/x");
		btnR_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_9.setBounds(10, 126, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_9);
		
		btnR_10 = new JButton("-");
		btnR_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num=Double.parseDouble(textField.getText());
				num1=num1-Double.parseDouble(textField.getText());			
				textField.setText(Double.toString(num1));
				lblNewLabel.setText(lblNewLabel.getText()+""+num+"-");	
				operation=2;
			}
		});
		btnR_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_10.setBounds(251, 159, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_10);
		
		btnR_11 = new JButton("<-");
		btnR_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder s=new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length()-1);
					backspace=s.toString();
					textField.setText(backspace);
				}
			}
		});
		btnR_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_11.setBounds(190, 159, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_11);
		
		btnR_12 = new JButton("Clr");
		btnR_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnR_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_12.setBounds(129, 159, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_12);
		
		btnR_13 = new JButton("%");
		btnR_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num=Double.parseDouble(textField.getText());
				num1=num1%Double.parseDouble(textField.getText());			
				textField.setText(Double.toString(num1));
				lblNewLabel.setText(lblNewLabel.getText()+""+num+"%");	
				operation=5;
				
			}
		});
		btnR_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_13.setBounds(69, 159, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_13);
		
		btnR_14 = new JButton("x^y");
		btnR_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnR_14.setBounds(10, 159, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_14);
		
		btnR_15 = new JButton("+");
		btnR_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num=Double.parseDouble(textField.getText());
				num1=num1+Double.parseDouble(textField.getText());			
				textField.setText(Double.toString(num1));
				lblNewLabel.setText(lblNewLabel.getText()+""+num+"+");
				operation=1;
			}
		});
		btnR_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_15.setBounds(251, 191, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_15);
		
		btnR_16 = new JButton("9");
		btnR_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"9");
			}
		});
		btnR_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_16.setBounds(190, 191, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_16);
		
		btnR_17 = new JButton("8");
		btnR_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"8");
			}
		});
		btnR_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_17.setBounds(129, 191, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_17);
		
		btnR_18 = new JButton("7");
		btnR_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"7");
			}
		});
		btnR_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_18.setBounds(69, 191, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_18);
		
		btnR_19 = new JButton("x^3");
		btnR_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnR_19.setBounds(10, 191, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_19);
		
		btnR_20 = new JButton("*");
		btnR_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num=Double.parseDouble(textField.getText());
				num1=num1*Double.parseDouble(textField.getText());			
				textField.setText(Double.toString(num1));
				lblNewLabel.setText(lblNewLabel.getText()+""+num+"*");	
				operation=3;
				
			}
		});
		btnR_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_20.setBounds(251, 223, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_20);
		
		btnR_21 = new JButton("6");
		btnR_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"6");
			}
		});
		btnR_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_21.setBounds(190, 223, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_21);
		
		btnR_22 = new JButton("5");
		btnR_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"5");
			}
		});
		btnR_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_22.setBounds(129, 223, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_22);
		
		btnR_23 = new JButton("4");
		btnR_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"4");
			}			
		});
		btnR_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_23.setBounds(69, 223, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_23);
		
		btnR_24 = new JButton("x^2");
		btnR_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnR_24.setBounds(10, 223, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_24);
		
		btnR_25 = new JButton("/");
		btnR_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num=Double.parseDouble(textField.getText());
				num1=num1/Double.parseDouble(textField.getText());			
				textField.setText(Double.toString(num1));
				lblNewLabel.setText(lblNewLabel.getText()+""+num+"/");	
				operation=4;
			}
		});
		btnR_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_25.setBounds(251, 255, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_25);
		
		btnR_26 = new JButton("3");
		btnR_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"3");
			}
		});
		btnR_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_26.setBounds(190, 255, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_26);
		
		btnR_27 = new JButton("2");
		btnR_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"2");
			}
		});
		btnR_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_27.setBounds(129, 255, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_27);
		
		btnR_28 = new JButton("1");
		btnR_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"1");
			}
		});
		btnR_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_28.setBounds(69, 255, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_28);
		
		btnR_29 = new JButton("n!");
		btnR_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_29.setBounds(10, 255, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_29);
		
		btnR_30 = new JButton("=");
		btnR_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation();
				lblNewLabel.setText("");					
			}
		});
		btnR_30.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnR_30.setBounds(190, 287, 120, 30);
		frmScientificcalculator.getContentPane().add(btnR_30);
		
		btnR_32 = new JButton(".");
		btnR_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnR_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_32.setBounds(129, 287, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_32);
		
		btnR_33 = new JButton("0");
		btnR_33.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText()+"0");
				
			}
		});
		btnR_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_33.setBounds(69, 287, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_33);
		
		btnR_34 = new JButton("+/-");
		btnR_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnR_34.setBounds(10, 287, 59, 30);
		frmScientificcalculator.getContentPane().add(btnR_34);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(27, 11, 283, 23);
		frmScientificcalculator.getContentPane().add(lblNewLabel);
	}
}
