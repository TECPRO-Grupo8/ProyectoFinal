package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;

public class InterfazAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JMenuItem menuItem;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAdministrador frame = new InterfazAdministrador();
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
	public InterfazAdministrador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\UPN\\5to ciclo\\Tecnica de prog. orientada a obj\\EXAMEN FINAL TECPRO\\admin icon.png"));
		setTitle("ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 621);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("¡BIENVENIDO, ADMINISTRADOR!");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
			lblNewLabel.setBounds(325, 30, 316, 37);
			contentPane.add(lblNewLabel);
		}
		{
			panel = new JPanel();
			panel.setBackground(SystemColor.textHighlight);
			panel.setBounds(0, 0, 267, 582);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				lblNewLabel_1 = new JLabel("¡Hola, [ADMIN]!");
				lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 25));
				lblNewLabel_1.setBounds(38, 42, 200, 60);
				panel.add(lblNewLabel_1);
			}
			{
				btnNewButton = new JButton("Principal");
				btnNewButton.setBounds(0, 127, 267, 60);
				panel.add(btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Préstamos");
				btnNewButton_1.setBounds(0, 185, 267, 60);
				panel.add(btnNewButton_1);
			}
			{
				btnNewButton_2 = new JButton("Devoluciones");
				btnNewButton_2.setBounds(0, 242, 267, 60);
				panel.add(btnNewButton_2);
			}
			{
				btnNewButton_3 = new JButton("Libros");
				btnNewButton_3.setBounds(0, 300, 267, 60);
				panel.add(btnNewButton_3);
			}
			{
				btnNewButton_4 = new JButton("Reportes");
				btnNewButton_4.setBounds(0, 357, 267, 60);
				panel.add(btnNewButton_4);
			}
			{
				menuItem = new JMenuItem("New menu item");
				menuItem.setBounds(73, 11, 137, 26);
				panel.add(menuItem);
			}
			{
				btnNewButton_5 = new JButton("Reportes");
				btnNewButton_5.setBounds(0, 414, 267, 60);
				panel.add(btnNewButton_5);
			}
		}
	}
}
