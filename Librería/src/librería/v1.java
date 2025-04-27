package librería;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class v1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDePrstamo = new JLabel("Sistema de Préstamo de libro - Biblioteca Lima");
		lblSistemaDePrstamo.setBounds(98, 22, 230, 14);
		contentPane.add(lblSistemaDePrstamo);
		
		JLabel lblNewLabel = new JLabel("Libro:");
		lblNewLabel.setBounds(25, 67, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(209, 67, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblFechaDePrstamo = new JLabel("Fecha de préstamo:");
		lblFechaDePrstamo.setBounds(25, 110, 115, 14);
		contentPane.add(lblFechaDePrstamo);
		
		JLabel lblFechaDeDevolucin = new JLabel("Fecha de devolución:");
		lblFechaDeDevolucin.setBounds(25, 135, 115, 14);
		contentPane.add(lblFechaDeDevolucin);
		
		JLabel lblListaDePrstamos = new JLabel("Lista de Préstamos:");
		lblListaDePrstamos.setBounds(25, 202, 163, 14);
		contentPane.add(lblListaDePrstamos);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(64, 64, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 64, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 107, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 132, 86, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Registrar préstamo");
		btnNewButton.setBounds(35, 168, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRegistrarDevolucin = new JButton("Registrar devolución");
		btnRegistrarDevolucin.setBounds(242, 168, 144, 23);
		contentPane.add(btnRegistrarDevolucin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 227, 399, 76);
		contentPane.add(scrollPane);
	}
}
