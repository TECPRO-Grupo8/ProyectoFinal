package MenúPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase.Libro;
import Hijos.Administrador;
import Hijos.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenúPrincipal extends JFrame implements ItemListener, ActionListener {

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
	private JTextArea txtS1;
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
				btnAgregar.addActionListener(this);
				btnAgregar.setBounds(375, 85, 192, 23);
				contentPane_1.add(btnAgregar);
			}
			{
				btnBuscar = new JButton("Buscar Cliente Registrado");
				btnBuscar.addActionListener(this);
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
				btnSancionar.addActionListener(this);
				btnSancionar.setEnabled(false);
				btnSancionar.setBounds(375, 149, 193, 23);
				contentPane_1.add(btnSancionar);
			}
			{
				btnEliminar = new JButton("Eliminar Cliente");
				btnEliminar.addActionListener(this);
				btnEliminar.setEnabled(false);
				btnEliminar.setBounds(374, 183, 193, 23);
				contentPane_1.add(btnEliminar);
			}
			{
				btnListarCliente = new JButton("Listar Clientes");
				btnListarCliente.addActionListener(this);
				btnListarCliente.setEnabled(false);
				btnListarCliente.setBounds(375, 217, 193, 23);
				contentPane_1.add(btnListarCliente);
			}
			{
				btnStock = new JButton("Listar Libros");
				btnStock.addActionListener(this);
				btnStock.setEnabled(false);
				btnStock.setBounds(375, 247, 193, 23);
				contentPane_1.add(btnStock);
			}
			{
				combo1 = new JComboBox();
				combo1.addItemListener(this);
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
				btnRentarLibro.addActionListener(this);
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
					txtS1 = new JTextArea();
					scrollPane_1.setViewportView(txtS1);
				}
			}
			{
				btnVerLibrosEn = new JButton("Ver Libros en STOCK");
				btnVerLibrosEn.setBounds(47, 545, 192, 23);
				contentPane_1.add(btnVerLibrosEn);
			}
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo1) {
			do_combo1_itemStateChanged(e);
		}
	}
	protected void do_combo1_itemStateChanged(ItemEvent e) {
		int indice = combo1.getSelectedIndex();
		switch(indice) {
		case 0:
			txtNuevoNombre.setEditable(true);
			txtNuevoCodigo.setEditable(true);
			txtAutor.setEditable(true);
			txtEditorial.setEditable(true);
			txtStock.setEditable(true);
			txtCliente.setEditable(false);
			
			
			btnAgregar.setEnabled(true);
			btnBuscar.setEnabled(false);
			btnSancionar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnListarCliente.setEnabled(false);
			btnStock.setEnabled(false);
			
			
			VaciarAdministrador();
			break;
		case 1:
			txtNuevoNombre.setEditable(false);
			txtNuevoCodigo.setEditable(false);
			txtAutor.setEditable(false);
			txtEditorial.setEditable(false);
			txtStock.setEditable(false);
			txtCliente.setEditable(true);
			
			
			btnAgregar.setEnabled(false);
			btnBuscar.setEnabled(true);
			btnSancionar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnListarCliente.setEnabled(false);
			btnStock.setEnabled(false);
			
			
			VaciarAdministrador();
			break;
		case 2:
			txtNuevoNombre.setEditable(false);
			txtNuevoCodigo.setEditable(false);
			txtAutor.setEditable(false);
			txtEditorial.setEditable(false);
			txtStock.setEditable(false);
			txtCliente.setEditable(true);
			
			
			btnAgregar.setEnabled(false);
			btnBuscar.setEnabled(false);
			btnSancionar.setEnabled(true);
			btnEliminar.setEnabled(false);
			btnListarCliente.setEnabled(false);
			btnStock.setEnabled(false);
			
			
			VaciarAdministrador();
			break;
		case 3:
			txtNuevoNombre.setEditable(false);
			txtNuevoCodigo.setEditable(false);
			txtAutor.setEditable(false);
			txtEditorial.setEditable(false);
			txtStock.setEditable(false);
			txtCliente.setEditable(true);
			
			
			btnAgregar.setEnabled(false);
			btnBuscar.setEnabled(false);
			btnSancionar.setEnabled(false);
			btnEliminar.setEnabled(true);
			btnListarCliente.setEnabled(false);
			btnStock.setEnabled(false);
			
			
			VaciarAdministrador();
			break;
		case 4:
			txtNuevoNombre.setEditable(false);
			txtNuevoCodigo.setEditable(false);
			txtAutor.setEditable(false);
			txtEditorial.setEditable(false);
			txtStock.setEditable(false);
			txtCliente.setEditable(false);
			
			
			btnAgregar.setEnabled(false);
			btnBuscar.setEnabled(false);
			btnSancionar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnListarCliente.setEnabled(true);
			btnStock.setEnabled(false);
			
			
			VaciarAdministrador();
			break;
		case 5:
			txtNuevoNombre.setEditable(false);
			txtNuevoCodigo.setEditable(false);
			txtAutor.setEditable(false);
			txtEditorial.setEditable(false);
			txtStock.setEditable(false);
			txtCliente.setEditable(false);
			
			
			btnAgregar.setEnabled(false);
			btnBuscar.setEnabled(false);
			btnSancionar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnListarCliente.setEnabled(false);
			btnStock.setEnabled(true);
			
			
			VaciarAdministrador();
			break;
			
		}
	}
	
	void VaciarAdministrador() {
		txtNuevoNombre.setText("");
		txtNuevoCodigo.setText("");
		txtAutor.setText("");
		txtEditorial.setText("");
		txtStock.setText("");
		txtCliente.setText("");
	}
	
	Administrador admin = new Administrador("RobertoAdmin",123);
	
	void ImprimirAdmin(String x) {
		txtS1.append(x + "\n");
	}
	void ImprimirClien(String x) {
		txtS2.append(x + "\n");
	}
	int LeerNuevoCodigo () {
		return Integer.parseInt(txtNuevoCodigo.getText());
	}
	int LeerNuevoStock () {
		return  Integer.parseInt(txtStock.getText());
	}
	int LeerCodigoCliente() {
		return Integer.parseInt(txtCliente.getText());
	}
	String LeerNuevoLibro() {
		return txtNuevoNombre.getText();
	}
	String LeerAutor() {
		return txtAutor.getText();
	}
	String LeerEditorial() {
		return txtEditorial.getText();
	}
	int LeerCodigoClienteExistente() {
		return Integer.parseInt(txtCodigoClienteExistente.getText());
	}
	int LeerCodigoLibroExistente() {
		return Integer.parseInt(txtCodigoLibro.getText()); 
	}
	
	void VaciarCliente() {
		txtCodigoClienteExistente.setText("");
		txtCodigoLibro.setText("");
	}
	void Listadolibrospararentar(List<Libro> libroglobal) {
		txtS2.setText("");
		ImprimirClien("Código Libro \tNombre Libro\tStock");
		 for (Libro l : libroglobal) {
			 ImprimirClien(l.getCodigoLibro() + "\t" + l.getNombreLibro()+ "\t" + l.getStock());
		 }
	}
	void ListadoLibrosAdmintrador(List<Libro> libroglobal) {
		txtS1.setText("");
		ImprimirAdmin("Código Libro \tNombre Libro\tAutor\tEditorial\tStock");
		 for (Libro l : libroglobal) {
			 ImprimirAdmin(l.getCodigoLibro() + "\t" + l.getNombreLibro()+ "\t" + l.getAutor()+ "\t" + l.getEditorial()+ "\t" + l.getStock());
		 }
	}
	void ListadoClientesGlobales(List<Cliente>clien) {
		txtS1.setText("");
		ImprimirAdmin("Codigo Cliente\tNombre del Cliente   Número de sanciones\tLibro 1\tLibro 2\tLibro 3");
		
		for(Cliente cl : clien) {
			String texto = cl.getCodigoCliente() + "\t" + cl.getNombre() + "\t\t" + cl.getContadorSanciones();
			
			for(int i = 0; i < 3;i++) {
				
				if( i < cl.TamañoLibrosRentados()) {
					texto += "\t" + cl.ObtenerLibroRentado(i).getNombreLibro();
				}else {
					texto += "\t-";
				}
			}
			
			ImprimirAdmin(texto);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRentarLibro) {
			do_btnRentarLibro_actionPerformed(e);
		}
		if (e.getSource() == btnStock) {
			do_btnStock_actionPerformed(e);
		}
		if (e.getSource() == btnListarCliente) {
			do_btnListarCliente_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnSancionar) {
			do_btnSancionar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		int codigolibro = -1;
		int stock = -1;
		
		try {
		    codigolibro = LeerNuevoCodigo();
		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(this, "El código del libro debe ser un número entero.");
		    return;
		}
		
		String nombrelibro = LeerNuevoLibro();
		String autor = LeerAutor();
		String editorial =LeerEditorial(); 
		
		try {
		    stock = LeerNuevoStock();
		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(this, "El stock debe ser un número entero.");
		    return;
		}
		if(stock <= 0) {
			JOptionPane.showMessageDialog(this, "No se admite una cantidad de stock menor igual a 0");
		}else {
			Libro li = admin.BuscarLibroGlobal(codigolibro);
			
			if(li == null) {
				Libro libro = new Libro(codigolibro,nombrelibro,autor,editorial,stock,null);
				admin.AgregarLibroGlobales(libro);
				VaciarAdministrador();
				JOptionPane.showMessageDialog(this, "Nuevo libro registrado correctamaente");
			}else {
				JOptionPane.showMessageDialog(this, "Ya existe un libro con el mismo código, pruebe con otro");
			}	
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
txtS1.setText("");
		
		int codigocliente = LeerCodigoCliente();
		
		Cliente c = admin.BuscarUsuarioRegistrado(codigocliente);
		
		if(c == null) {
			JOptionPane.showMessageDialog(this, "El usuario que busca no existe");
		}else {
			ImprimirAdmin("CLIENTE ENCONTRADO:");
			ImprimirAdmin("Nombre: " + c.getNombre());
			ImprimirAdmin("Estado de Sanción: "+ c.getSancion());
			ImprimirAdmin("Número ded sanciones: "+ c.getContadorSanciones());
			
			if(c.TamañoLibrosRentados() <= 0) {
				ImprimirAdmin("Este usuario aún no tiene libros rentados.");
			}else {
				for(int i = 0; i < c.TamañoLibrosRentados();i++) {
					Libro libro = c.ObtenerLibroRentado(i);
					ImprimirAdmin("Libro " + (i + 1) + ": " + libro.getNombreLibro() + "\tFecha de renta: " + libro.getFecha());
				}
				
				VaciarAdministrador();
			}
			
			
		}
	}
	protected void do_btnSancionar_actionPerformed(ActionEvent e) {
		
txtS1.setText("");
		
		int codigocliente = LeerCodigoCliente();
		
		Cliente c = admin.BuscarUsuarioRegistrado(codigocliente);
		
		if(c == null) {
			JOptionPane.showMessageDialog(this, "El usuario que busca no existe");
		}else {
			admin.SancionarCliente(c);
			JOptionPane.showMessageDialog(this, "Cliente sancionado: "+c.getNombre());
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
        txtS1.setText("");
		
		int codigocliente = LeerCodigoCliente();
		
		Cliente c = admin.BuscarUsuarioRegistrado(codigocliente);
		
		if(c == null) {
			JOptionPane.showMessageDialog(this, "El usuario que busca no existe");
		}else {
			JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente" + c.getNombre());
			admin.EliminarUsuarioRegistrado(c);
			
		}
	}
	protected void do_btnListarCliente_actionPerformed(ActionEvent e) {
		ListadoClientesGlobales(admin.ObtenerListaClientesGlobal());
	}
	protected void do_btnStock_actionPerformed(ActionEvent e) {
		
		if(admin.TamañoLibroGlobales() == 0) {
			JOptionPane.showMessageDialog(this, "No hay libros ingresados.");
		}else {
			
			ListadoLibrosAdmintrador(admin.ObtenerListaGlobal());
		}
	}
	protected void do_btnRentarLibro_actionPerformed(ActionEvent e) {
		int codigocliente = LeerCodigoClienteExistente();
		int codigolibro = LeerCodigoLibroExistente();
		
		Cliente c = admin.BuscarUsuarioRegistrado(codigocliente);
		Libro l = admin.BuscarLibroGlobal(codigolibro);
		
		if (c == null && l == null) {
		    JOptionPane.showMessageDialog(this, "El código del cliente y el código del libro no existen.");
		} else if (c == null) {
		    JOptionPane.showMessageDialog(this, "El código del cliente no existe.");
		} else if (l == null) {
		    JOptionPane.showMessageDialog(this, "El código del libro no existe.");
		} else {
		    if(c.BuscarLibro(codigolibro)!= null) { 
		    	JOptionPane.showMessageDialog(this, "El cliente ya tiene este libro rentado.");
		    }else if (l.getStock() <= 0) {
		    	JOptionPane.showMessageDialog(this, "No hay stock disponible, no puede rentar el libro");
		    }else if(c.TamañoLibrosRentados() >= 3){
		    	JOptionPane.showMessageDialog(this, "El cliente ya tiene 3 libros rentados. Debe devolver uno antes de rentar otro.");
		    }
		    else {
		    	
		    	l.DisminuirStock();
		    	l.setFecha(LocalDate.now());
		        c.AgregarLibroRentado(l);
		        JOptionPane.showMessageDialog(this, "Libro rentado correctamente por " + c.getNombre());
		        Listadolibrospararentar(admin.ObtenerListaGlobal());
		    }
		    
		    
		}
	}
}
