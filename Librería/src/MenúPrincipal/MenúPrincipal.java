package MenúPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class MenúPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtNuevoNombre;
	private JTextField txtNuevoCodigo;
	private JTextField txtAutor;
	private JTextField txtEditorial;
	private JTextField txtStock;
	private JButton btnAgregar;
	private JButton btnBuscar;
	private JLabel lblNewLabel_6;
	private JTextField txtCliente;
	private JButton btnSancionar;
	private JButton btnEliminar;
	private JButton btnListarCliente;
	private JButton btnStock;
	private JComboBox combo1;
	private JLabel lblNewLabel_7;
	private JScrollPane scrollPane;
	private JLabel lblInterfazCliente;
	private JLabel lblNewLabel_8;
	private JTextField txtCodigoClienteExistente;
	private JLabel lblNewLabel_9;
	private JTextField txtCodigoLibro;
	private JButton btnRentarLibro;
	private JButton btnDevolverLibro;
	private JScrollPane scrollPane_1;
	private JButton btnVerLibrosEn;
	private JTextArea textArea;
	private JTextArea txtS2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenúPrincipal frame = new MenúPrincipal();
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
	public MenúPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1228, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBounds(20, 11, 1322, 753);
			contentPane.add(contentPane_1);
			{
				lblNewLabel = new JLabel("INTERFAZ ADMINISTRADOR");
				lblNewLabel.setBounds(261, 11, 184, 14);
				contentPane_1.add(lblNewLabel);
			}
			{
				lblNewLabel_1 = new JLabel("Nombre del nuevo Libro:");
				lblNewLabel_1.setBounds(20, 47, 148, 14);
				contentPane_1.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("Código del nuevo Libro:");
				lblNewLabel_2.setBounds(20, 72, 136, 14);
				contentPane_1.add(lblNewLabel_2);
			}
			{
				lblNewLabel_3 = new JLabel("Autor:");
				lblNewLabel_3.setBounds(20, 103, 148, 14);
				contentPane_1.add(lblNewLabel_3);
			}
			{
				lblNewLabel_4 = new JLabel("Editorial:");
				lblNewLabel_4.setBounds(20, 137, 148, 14);
				contentPane_1.add(lblNewLabel_4);
			}
			{
				lblNewLabel_5 = new JLabel("Stock:");
				lblNewLabel_5.setBounds(20, 180, 148, 14);
				contentPane_1.add(lblNewLabel_5);
			}
			{
				txtNuevoNombre = new JTextField();
				txtNuevoNombre.setColumns(10);
				txtNuevoNombre.setBounds(167, 44, 155, 20);
				contentPane_1.add(txtNuevoNombre);
			}
			{
				txtNuevoCodigo = new JTextField();
				txtNuevoCodigo.setColumns(10);
				txtNuevoCodigo.setBounds(166, 72, 155, 20);
				contentPane_1.add(txtNuevoCodigo);
			}
			{
				txtAutor = new JTextField();
				txtAutor.setColumns(10);
				txtAutor.setBounds(167, 100, 155, 20);
				contentPane_1.add(txtAutor);
			}
			{
				txtEditorial = new JTextField();
				txtEditorial.setColumns(10);
				txtEditorial.setBounds(167, 134, 155, 20);
				contentPane_1.add(txtEditorial);
			}
			{
				txtStock = new JTextField();
				txtStock.setColumns(10);
				txtStock.setBounds(167, 177, 155, 20);
				contentPane_1.add(txtStock);
			}
			{
				btnAgregar = new JButton("Agregar nuevo Libro");
				btnAgregar.setBounds(375, 85, 192, 23);
				contentPane_1.add(btnAgregar);
			}
			{
				btnBuscar = new JButton("Buscar Cliente Registrado");
				btnBuscar.setEnabled(false);
				btnBuscar.setBounds(375, 115, 192, 23);
				contentPane_1.add(btnBuscar);
			}
			{
				lblNewLabel_6 = new JLabel("Código Cliente:");
				lblNewLabel_6.setBounds(20, 221, 148, 14);
				contentPane_1.add(lblNewLabel_6);
			}
			{
				txtCliente = new JTextField();
				txtCliente.setEditable(false);
				txtCliente.setColumns(10);
				txtCliente.setBounds(167, 218, 155, 20);
				contentPane_1.add(txtCliente);
			}
			{
				btnSancionar = new JButton("Sancionar Cliente");
				btnSancionar.setEnabled(false);
				btnSancionar.setBounds(375, 149, 193, 23);
				contentPane_1.add(btnSancionar);
			}
			{
				btnEliminar = new JButton("Eliminar Cliente");
				btnEliminar.setEnabled(false);
				btnEliminar.setBounds(374, 183, 193, 23);
				contentPane_1.add(btnEliminar);
			}
			{
				btnListarCliente = new JButton("Listar Clientes");
				btnListarCliente.setEnabled(false);
				btnListarCliente.setBounds(375, 217, 193, 23);
				contentPane_1.add(btnListarCliente);
			}
			{
				btnStock = new JButton("Listar Libros");
				btnStock.setEnabled(false);
				btnStock.setBounds(375, 247, 193, 23);
				contentPane_1.add(btnStock);
			}
			{
				combo1 = new JComboBox();
				combo1.setModel(new DefaultComboBoxModel(new String[] {"Agregar nuevo Libro", "Buscar Cliente Registrado", "Sancionar Cliente ", "Eliminar Cliente", "Listar Clientes", "Listar Libros"}));
				combo1.setBounds(375, 47, 192, 22);
				contentPane_1.add(combo1);
			}
			{
				lblNewLabel_7 = new JLabel("¿Qúe deseas hacer?");
				lblNewLabel_7.setBounds(411, 31, 148, 14);
				contentPane_1.add(lblNewLabel_7);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(580, 11, 422, 264);
				contentPane_1.add(scrollPane);
				{
					txtS2 = new JTextArea();
					scrollPane.setViewportView(txtS2);
				}
			}
			{
				lblInterfazCliente = new JLabel("INTERFAZ CLIENTE");
				lblInterfazCliente.setBounds(279, 309, 184, 14);
				contentPane_1.add(lblInterfazCliente);
			}
			{
				lblNewLabel_8 = new JLabel("Código Cliente:");
				lblNewLabel_8.setBounds(20, 365, 148, 14);
				contentPane_1.add(lblNewLabel_8);
			}
			{
				txtCodigoClienteExistente = new JTextField();
				txtCodigoClienteExistente.setColumns(10);
				txtCodigoClienteExistente.setBounds(117, 362, 155, 20);
				contentPane_1.add(txtCodigoClienteExistente);
			}
			{
				lblNewLabel_9 = new JLabel("Código Libro:");
				lblNewLabel_9.setBounds(20, 402, 148, 14);
				contentPane_1.add(lblNewLabel_9);
			}
			{
				txtCodigoLibro = new JTextField();
				txtCodigoLibro.setColumns(10);
				txtCodigoLibro.setBounds(117, 399, 155, 20);
				contentPane_1.add(txtCodigoLibro);
			}
			{
				btnRentarLibro = new JButton("Rentar Libro");
				btnRentarLibro.setBounds(47, 457, 192, 23);
				contentPane_1.add(btnRentarLibro);
			}
			{
				btnDevolverLibro = new JButton("Devolver Libro");
				btnDevolverLibro.setBounds(47, 502, 192, 23);
				contentPane_1.add(btnDevolverLibro);
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(341, 350, 583, 327);
				contentPane_1.add(scrollPane_1);
				{
					textArea = new JTextArea();
					scrollPane_1.setViewportView(textArea);
				}
			}
			{
				btnVerLibrosEn = new JButton("Ver Libros en STOCK");
				btnVerLibrosEn.setBounds(47, 545, 192, 23);
				contentPane_1.add(btnVerLibrosEn);
			}
		}
	}
}
