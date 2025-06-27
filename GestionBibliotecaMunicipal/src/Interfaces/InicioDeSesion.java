package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Administrador;
import Clases.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InicioDeSesion extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox TipoUsuario;
	private JTextField txtUsuario;
	private JButton btnNewButton;
	private JButton btneresNuevoUsuario;
	private JPasswordField txtContrasñea;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioDeSesion frame = new InicioDeSesion();
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
	public InicioDeSesion() {
		setTitle("INICIAR SESIÓN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 245, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel_1 = new JLabel("Usuario:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(100, 188, 137, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Contraseña:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(100, 216, 137, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Tipo de Usuario:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(100, 138, 147, 22);
			contentPane.add(lblNewLabel_3);
		}
		{
			TipoUsuario = new JComboBox();
			TipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
			TipoUsuario.addItemListener(this);
			TipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Lector", "Administrador"}));
			TipoUsuario.setBounds(253, 138, 158, 22);
			contentPane.add(TipoUsuario);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setColumns(10);
			txtUsuario.setBounds(253, 187, 158, 20);
			contentPane.add(txtUsuario);
		}
		{
			btnNewButton = new JButton("INGRESAR");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(116, 276, 276, 23);
			contentPane.add(btnNewButton);
		}
		{
			btneresNuevoUsuario = new JButton("¿Eres nuevo Lector?");
			btneresNuevoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btneresNuevoUsuario.addActionListener(this);
			btneresNuevoUsuario.setBounds(116, 321, 277, 23);
			contentPane.add(btneresNuevoUsuario);
		}
		{
			txtContrasñea = new JPasswordField();
			txtContrasñea.setBounds(253, 215, 158, 20);
			contentPane.add(txtContrasñea);
		}
		{
			lblNewLabel = new JLabel("INICIAR SESIÓN");
			lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 30));
			lblNewLabel.setBounds(124, 45, 257, 43);
			contentPane.add(lblNewLabel);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == TipoUsuario) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
		int index = TipoUsuario.getSelectedIndex();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btneresNuevoUsuario) {
			do_btneresNuevoUsuario_actionPerformed(e);
		}
	}
	
	void IniciarSesionAdministrador() {
		
	}
	protected void do_btneresNuevoUsuario_actionPerformed(ActionEvent e) {
		
		Registro r = new Registro();
		
		r.setVisible(true);
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		int index = TipoUsuario.getSelectedIndex();
		
		String Usuario = txtUsuario.getText();
		String Contraseña = String.valueOf(txtContrasñea.getPassword());
		
		if(index == 0) {
			
			Cliente cli = new Cliente();
			cli.setUsuario_Cliente(Usuario);
            cli.setContraseña_Cliente(Contraseña);
            
            if(cli.ObtenerCliente(cli) != null) {
            	
            	InterfazCliente ic = new InterfazCliente();
            	ic.setVisible(true);
            	
            }else {
            	JOptionPane.showMessageDialog(this, "Cliente no existe");
            }
		}else {
			
			Administrador admin = new Administrador();
			admin.setUsuario_Administrador(Usuario);
			admin.setContraseña_Administrador(Contraseña);
			
			if(admin.ObtenerAdministrador(admin) != null) {
				
				InterfazAdministrador ia = new InterfazAdministrador();
				ia.setVisible(true);
				
			}else {
				
				JOptionPane.showMessageDialog(this, "Usuario no existe");
			}
			
		}
	}
}
