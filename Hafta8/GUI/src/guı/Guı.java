package guý;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guý extends JFrame {

	private JPanel contentPane;
	private JButton buton1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guý frame = new Guý();
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
	public Guý() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buton1 = new JButton("Sayfa1");
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guý2 sayfa2 = new Guý2();
				dispose();
				sayfa2.setVisible(true);
			}
		});
		buton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		buton1.setForeground(new Color(255, 0, 0));
		buton1.setBackground(new Color(255, 51, 153));
		buton1.setBounds(122, 74, 134, 76);
		contentPane.add(buton1);
	}
}
