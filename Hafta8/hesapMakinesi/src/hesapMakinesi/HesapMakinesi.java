package hesapMakinesi;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HesapMakinesi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final AbstractButton label = null;
	private JPanel contentPane;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(label.getText());
			label.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(label.getText());
			label.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(label.getText());
			label.setText(Double.toString(answer));
			break;
		case 4:
			answer = number % Double.parseDouble(label.getText());
			label.setText(Double.toString(answer));
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("");
		label.setEnabled(false);
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setAlignment(Label.RIGHT);
		label.setBackground(new Color(255, 255, 255));
		label.setBounds(41, 101, 318, 47);
		contentPane.add(label);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(41, 82, 318, 13);
		contentPane.add(lbl);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button0.setForeground(Color.WHITE);
		button0.setFont(new Font("Tahoma", Font.BOLD, 30));
		button0.setBackground(new Color(199, 21, 133));
		button0.setBounds(129, 383, 60, 60);
		contentPane.add(button0);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
				
			}
		});
		button1.setBackground(new Color(199, 21, 133));
		button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Tahoma", Font.BOLD, 30));
		button1.setBounds(59, 313, 60, 60);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button2.setForeground(Color.WHITE);
		button2.setFont(new Font("Tahoma", Font.BOLD, 30));
		button2.setBackground(new Color(199, 21, 133));
		button2.setBounds(129, 313, 60, 60);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button3.setForeground(Color.WHITE);
		button3.setFont(new Font("Tahoma", Font.BOLD, 30));
		button3.setBackground(new Color(199, 21, 133));
		button3.setBounds(199, 313, 60, 60);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button4.setForeground(Color.WHITE);
		button4.setFont(new Font("Tahoma", Font.BOLD, 30));
		button4.setBackground(new Color(199, 21, 133));
		button4.setBounds(59, 244, 60, 60);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button5.setForeground(Color.WHITE);
		button5.setFont(new Font("Tahoma", Font.BOLD, 30));
		button5.setBackground(new Color(199, 21, 133));
		button5.setBounds(129, 244, 60, 60);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button6.setForeground(Color.WHITE);
		button6.setFont(new Font("Tahoma", Font.BOLD, 30));
		button6.setBackground(new Color(199, 21, 133));
		button6.setBounds(199, 244, 60, 60);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button7.setForeground(Color.WHITE);
		button7.setFont(new Font("Tahoma", Font.BOLD, 30));
		button7.setBackground(new Color(199, 21, 133));
		button7.setBounds(59, 174, 60, 60);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button8.setForeground(Color.WHITE);
		button8.setFont(new Font("Tahoma", Font.BOLD, 30));
		button8.setBackground(new Color(199, 21, 133));
		button8.setBounds(129, 174, 60, 60);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + e.getActionCommand());
			}
		});
		button9.setForeground(Color.WHITE);
		button9.setFont(new Font("Tahoma", Font.BOLD, 30));
		button9.setBackground(new Color(199, 21, 133));
		button9.setBounds(199, 174, 60, 60);
		contentPane.add(button9);
		
		JButton buttonSil = new JButton("C");
		buttonSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("");
			}
		});
		buttonSil.setForeground(Color.WHITE);
		buttonSil.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonSil.setBackground(new Color(25, 25, 112));
		buttonSil.setBounds(53, 383, 66, 60);
		contentPane.add(buttonSil);
		
		JButton buttoEsittir = new JButton("=");
		buttoEsittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculate();
			}
		});
		buttoEsittir.setForeground(Color.WHITE);
		buttoEsittir.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttoEsittir.setBackground(new Color(139, 0, 0));
		buttoEsittir.setBounds(199, 383, 60, 60);
		contentPane.add(buttoEsittir);
		
		JButton buttonTopla = new JButton("+");
		buttonTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(label.getText());
				operation = 1;
				label.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		buttonTopla.setForeground(Color.WHITE);
		buttonTopla.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonTopla.setBackground(new Color(255, 160, 122));
		buttonTopla.setBounds(271, 383, 60, 60);
		contentPane.add(buttonTopla);
		
		JButton buttonCikar = new JButton("-");
		buttonCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(label.getText());
				operation = 2;
				label.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		buttonCikar.setForeground(Color.WHITE);
		buttonCikar.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonCikar.setBackground(new Color(138, 43, 226));
		buttonCikar.setBounds(271, 313, 60, 60);
		contentPane.add(buttonCikar);
		
		JButton buttonCarp = new JButton("x");
		buttonCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(label.getText());
				operation = 3;
				label.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		buttonCarp.setForeground(Color.WHITE);
		buttonCarp.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonCarp.setBackground(new Color(0, 100, 0));
		buttonCarp.setBounds(269, 244, 60, 60);
		contentPane.add(buttonCarp);
		
		JButton buttonBol = new JButton("%");
		buttonBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(label.getText());
				operation = 4;
				label.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		buttonBol.setForeground(Color.WHITE);
		buttonBol.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonBol.setBackground(new Color(255, 255, 0));
		buttonBol.setBounds(269, 174, 60, 60);
		contentPane.add(buttonBol);
		
		Label label_1 = new Label("HESAP MAK\u0130NES\u0130");
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setFont(new Font("Raleway Black", Font.BOLD, 23));
		label_1.setBounds(96, 23, 254, 40);
		contentPane.add(label_1);
		
	
		
		
	}
}
