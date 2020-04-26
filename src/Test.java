import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int sayi_1, sayi_2, sonuc;
	int islem, memory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(12, 13, 289, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton rakam_1 = new JButton("1");
		rakam_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "1");
			}
		});
		rakam_1.setBackground(Color.GREEN);
		rakam_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_1.setBounds(12, 49, 65, 25);
		contentPane.add(rakam_1);
		
		JButton rakam_2 = new JButton("2");
		rakam_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "2");
			}
		});
		rakam_2.setBackground(Color.GREEN);
		rakam_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_2.setBounds(88, 48, 65, 25);
		contentPane.add(rakam_2);
		
		JButton rakam_3 = new JButton("3");
		rakam_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "3");
			}
		});
		rakam_3.setBackground(Color.GREEN);
		rakam_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_3.setBounds(165, 48, 65, 25);
		contentPane.add(rakam_3);
		
		JButton rakam_4 = new JButton("4");
		rakam_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "4");
			}
		});
		rakam_4.setBackground(Color.GREEN);
		rakam_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_4.setBounds(12, 102, 65, 25);
		contentPane.add(rakam_4);
		
		JButton rakam_5 = new JButton("5");
		rakam_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "5");
			}
		});
		rakam_5.setBackground(Color.GREEN);
		rakam_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_5.setBounds(88, 103, 65, 25);
		contentPane.add(rakam_5);
		
		JButton rakam_6 = new JButton("6");
		rakam_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "6");
			}
		});
		rakam_6.setBackground(Color.GREEN);
		rakam_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_6.setBounds(165, 103, 65, 25);
		contentPane.add(rakam_6);
		
		JButton rakam_7 = new JButton("7");
		rakam_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "7");
			}
		});
		rakam_7.setBackground(Color.GREEN);
		rakam_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_7.setBounds(12, 151, 65, 25);
		contentPane.add(rakam_7);
		
		JButton rakam_8 = new JButton("8");
		rakam_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "8");
			}
		});
		rakam_8.setBackground(Color.GREEN);
		rakam_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_8.setBounds(88, 152, 65, 25);
		contentPane.add(rakam_8);
		
		JButton rakam_9 = new JButton("9");
		rakam_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "9");
			}
		});
		rakam_9.setBackground(Color.GREEN);
		rakam_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_9.setBounds(165, 152, 65, 25);
		contentPane.add(rakam_9);
		
		JButton btn_toplama = new JButton("+");
		btn_toplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi_1 = Integer.parseInt(textField.getText());
				islem = 1;
				textField.setText("");
			}
		});
		btn_toplama.setBackground(Color.PINK);
		btn_toplama.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_toplama.setBounds(242, 48, 65, 25);
		contentPane.add(btn_toplama);
		
		JButton btn_cikarma = new JButton("-");
		btn_cikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi_1 = Integer.parseInt(textField.getText());
				islem = 2;
				textField.setText("");
			}
		});
		btn_cikarma.setBackground(Color.PINK);
		btn_cikarma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_cikarma.setBounds(242, 102, 65, 25);
		contentPane.add(btn_cikarma);
		
		JButton btn_carpma = new JButton("*");
		btn_carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi_1 = Integer.parseInt(textField.getText());
				islem = 3;
				textField.setText("");
			}
		});
		btn_carpma.setBackground(Color.PINK);
		btn_carpma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_carpma.setBounds(242, 151, 65, 25);
		contentPane.add(btn_carpma);
		
		JButton btn_bolme = new JButton("/");
		btn_bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi_1 = Integer.parseInt(textField.getText());
				islem = 4;
				textField.setText("");
			}
		});
		btn_bolme.setBackground(Color.PINK);
		btn_bolme.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_bolme.setBounds(242, 200, 65, 25);
		contentPane.add(btn_bolme);
		
		JButton rakam_0 = new JButton("0");
		rakam_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "0");
			}
		});
		rakam_0.setBackground(Color.GREEN);
		rakam_0.setFont(new Font("Tahoma", Font.BOLD, 15));
		rakam_0.setBounds(12, 201, 107, 25);
		contentPane.add(rakam_0);
		
		JButton btn_memory = new JButton("M");
		btn_memory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				memory = Integer.parseInt(textField.getText());
			}
		});
		btn_memory.setBackground(Color.CYAN);
		btn_memory.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_memory.setBounds(12, 245, 65, 25);
		contentPane.add(btn_memory);
		
		JButton btn_memory_plus = new JButton("M+");
		btn_memory_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(Integer.toString(memory));
			}
		});
		btn_memory_plus.setBackground(Color.CYAN);
		btn_memory_plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_memory_plus.setBounds(88, 245, 65, 25);
		contentPane.add(btn_memory_plus);
		
		JButton btn_clear = new JButton("CLEAR");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");//textField'ý temizler.
			}
		});
		btn_clear.setBackground(Color.RED);
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_clear.setBounds(165, 245, 136, 25);
		contentPane.add(btn_clear);
		
		JButton btn_esittir = new JButton("=");
		btn_esittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi_2 = Integer.parseInt(textField.getText());
				if(islem == 1) {
					
					sonuc = sayi_1 + sayi_2;
					textField.setText(Integer.toString(sonuc));
				}
				else if (islem == 2) {
					
					sonuc = sayi_1 - sayi_2;
					textField.setText(Integer.toString(sonuc));
				}
				else if(islem == 3) {
					
					sonuc = sayi_1 * sayi_2;
					textField.setText(Integer.toString(sonuc));
				}
				else if (islem == 4) {
					
					sonuc = sayi_1 / sayi_2;
					textField.setText(Integer.toString(sonuc));
					
				}
			}
		});
		btn_esittir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_esittir.setBackground(Color.ORANGE);
		btn_esittir.setBounds(131, 201, 99, 25);
		contentPane.add(btn_esittir);
	}
}
