package odev2Hesaplama;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Hesaplama extends JFrame {

	private JPanel contentPane;
	private JTextField number1;
	private JTextField number2;
	private JButton cikarma;
	private JButton carpma;
	private JButton bolme;
	private JLabel label;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hesaplama frame = new Hesaplama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hesaplama() {
		setTitle("hesapmakinesi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setForeground(new Color(204, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		number1 = new JTextField();
		number1.setForeground(Color.CYAN);
		number1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		number1.setBackground(Color.PINK);
		number1.setBounds(64, 67, 130, 49);
		contentPane.add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.setForeground(Color.CYAN);
		number2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		number2.setBackground(Color.PINK);
		number2.setBounds(243, 67, 130, 49);
		contentPane.add(number2);
		number2.setColumns(10);
		
		JButton toplamma = new JButton("+");
		toplamma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(number1.getText());
				int n2 = Integer.parseInt(number2.getText());
				int alinanDeger = (n1+n2);
				label.setText(String.valueOf(alinanDeger));
		
			}
		});
		toplamma.setBackground(new Color(255, 255, 102));
		toplamma.setFont(new Font("Tahoma", Font.BOLD, 25));
		toplamma.setForeground(new Color(204, 0, 0));
		toplamma.setBounds(30, 137, 57, 37);
		contentPane.add(toplamma);
		
		cikarma = new JButton("-");
		cikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(number1.getText());
				int n2 = Integer.parseInt(number2.getText());
				int alinanDeger = (n1-n2);
				label.setText(String.valueOf(alinanDeger));
			}
		});
		cikarma.setForeground(new Color(204, 0, 0));
		cikarma.setFont(new Font("Tahoma", Font.BOLD, 25));
		cikarma.setBackground(new Color(255, 255, 102));
		cikarma.setBounds(137, 137, 57, 37);
		contentPane.add(cikarma);
		
		carpma = new JButton("x");
		carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(number1.getText());
				int n2 = Integer.parseInt(number2.getText());
				int alinanDeger = (n1*n2);
				label.setText(String.valueOf(alinanDeger));
			}
		});
		carpma.setForeground(new Color(204, 0, 0));
		carpma.setFont(new Font("Tahoma", Font.BOLD, 25));
		carpma.setBackground(new Color(255, 255, 102));
		carpma.setBounds(243, 137, 57, 37);
		contentPane.add(carpma);
		
		bolme = new JButton("/");
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(number1.getText());
				double n2 = Double.parseDouble(number2.getText());
				double alinanDeger = (n1/n2);
				label.setText(String.valueOf(alinanDeger));
			}
		});
		bolme.setForeground(new Color(204, 0, 0));
		bolme.setFont(new Font("Tahoma", Font.BOLD, 25));
		bolme.setBackground(new Color(255, 255, 102));
		bolme.setBounds(336, 137, 57, 37);
		contentPane.add(bolme);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 26));
		label.setForeground(new Color(102, 0, 51));
		label.setBounds(137, 192, 168, 49);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("HESAP MAK\u0130NES\u0130");
		lblNewLabel.setForeground(new Color(102, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBackground(new Color(255, 102, 255));
		lblNewLabel.setBounds(82, 20, 255, 37);
		contentPane.add(lblNewLabel);
		
	
	}

}
