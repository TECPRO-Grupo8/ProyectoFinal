package Interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Cliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNuevaContraseña;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtNuevoUsuario;
	private JButton btnNewButton;
	private JTextField txtCodigoLector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registro dialog = new Registro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registro() {
		setModal(true);
		setBounds(100, 100, 598, 313);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNuevaContraseña = new JTextField();
			txtNuevaContraseña.setColumns(10);
			txtNuevaContraseña.setBounds(259, 156, 158, 20);
			contentPanel.add(txtNuevaContraseña);
		}
		{
			JLabel lblRegistro = new JLabel("REGISTRO");
			lblRegistro.setBounds(242, 18, 98, 14);
			contentPanel.add(lblRegistro);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setColumns(10);
			txtNombre.setBounds(258, 74, 158, 20);
			contentPanel.add(txtNombre);
		}
		{
			txtApellidos = new JTextField();
			txtApellidos.setColumns(10);
			txtApellidos.setBounds(259, 103, 158, 20);
			contentPanel.add(txtApellidos);
		}
		{
			txtNuevoUsuario = new JTextField();
			txtNuevoUsuario.setColumns(10);
			txtNuevoUsuario.setBounds(259, 131, 158, 20);
			contentPanel.add(txtNuevoUsuario);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombres:");
			lblNewLabel.setBounds(140, 77, 98, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Apellidos:");
			lblNewLabel_1.setBounds(140, 106, 88, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Nuevo Usuario:");
			lblNewLabel_2.setBounds(140, 134, 109, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Nueva Contraseña:");
			lblNewLabel_3.setBounds(140, 159, 124, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			btnNewButton = new JButton("REGISTRARSE");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(140, 189, 276, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JLabel lblCdigoLector = new JLabel("Código Lector");
			lblCdigoLector.setBounds(140, 46, 98, 14);
			contentPanel.add(lblCdigoLector);
		}
		{
			txtCodigoLector = new JTextField();
			txtCodigoLector.setColumns(10);
			txtCodigoLector.setBounds(259, 43, 158, 20);
			contentPanel.add(txtCodigoLector);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		String cod = txtCodigoLector.getText();
		String nom = txtNombre.getText();
		String ape = txtApellidos.getText();
		String usu = txtNuevoUsuario.getText();
		String con = txtNuevaContraseña.getText();
		
	    Cliente cli = new Cliente(cod, nom, ape, usu, con);
		
		cli.RegistrarCliente(cli);
	}
}
