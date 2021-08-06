package guý;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Guý2 extends JFrame {

	private JPanel contentPane;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guý2 frame = new Guý2();
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
	public Guý2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 306);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text = new JTextField();
		text.setFont(new Font("Tahoma", Font.BOLD, 23));
		text.setBackground(new Color(153, 0, 153));
		text.setForeground(new Color(255, 0, 0));
		text.setBounds(64, 120, 154, 56);
		contentPane.add(text);
		text.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(new Color(255, 255, 102));
		label.setForeground(new Color(238, 130, 238));
		label.setBounds(64, 190, 154, 46);
		contentPane.add(label);
		
		JButton buton2 = new JButton("Sayfa 2 ");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alinanDeger = text.getText();
				label.setText(alinanDeger);
				
				
			}
		});
		buton2.setFont(new Font("Tahoma", Font.BOLD, 24));
		buton2.setBackground(new Color(255, 165, 0));
		buton2.setForeground(new Color(255, 51, 255));
		buton2.setBounds(64, 10, 154, 100);
		contentPane.add(buton2);
		
		
		
		
		
		
	}
}
