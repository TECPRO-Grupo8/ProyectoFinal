package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import ConexionMySQL.ConexionMySQL;

public class Cliente {
private String Codigo_Cliente;
private String Nombres_Cliente;
private String Apellidos_Cliente;
private String Usuario_Cliente;
private String Contraseña_Cliente;
public Cliente(String codigo_Cliente, String nombres_Cliente, String apellidos_Cliente, String usuario_Cliente,
		String contraseña_Cliente) {
	Codigo_Cliente = codigo_Cliente;
	Nombres_Cliente = nombres_Cliente;
	Apellidos_Cliente = apellidos_Cliente;
	Usuario_Cliente = usuario_Cliente;
	Contraseña_Cliente = contraseña_Cliente;
}


public Cliente() {
}


public String getCodigo_Cliente() {
	return Codigo_Cliente;
}
public void setCodigo_Cliente(String codigo_Cliente) {
	Codigo_Cliente = codigo_Cliente;
}
public String getNombres_Cliente() {
	return Nombres_Cliente;
}
public void setNombres_Cliente(String nombres_Cliente) {
	Nombres_Cliente = nombres_Cliente;
}
public String getApellidos_Cliente() {
	return Apellidos_Cliente;
}
public void setApellidos_Cliente(String apellidos_Cliente) {
	Apellidos_Cliente = apellidos_Cliente;
}
public String getUsuario_Cliente() {
	return Usuario_Cliente;
}
public void setUsuario_Cliente(String usuario_Cliente) {
	Usuario_Cliente = usuario_Cliente;
}
public String getContraseña_Cliente() {
	return Contraseña_Cliente;
}
public void setContraseña_Cliente(String contraseña_Cliente) {
	Contraseña_Cliente = contraseña_Cliente;
}

public void RegistrarCliente(Cliente cli) {
	
	Connection con = null;
	PreparedStatement pst = null;
	
	try {
		con = ConexionMySQL.getConexion();
		String sql = "INSERT INTO CLIENTE (Codigo_Cliente, Nombres_Cliente, Apellidos_Cliente, Usuario_Cliente, Contraseña_Cliente) VALUES (?, ?, ?, ?, ?)";
		
		pst = con.prepareStatement(sql);
		pst.setString(1, cli.getCodigo_Cliente());
        pst.setString(2, cli.getNombres_Cliente());
        pst.setString(3, cli.getApellidos_Cliente());
        pst.setString(4, cli.getUsuario_Cliente());
        pst.setString(5, cli.getContraseña_Cliente());
        
        int filas = pst.executeUpdate();

        if (filas > 0) {
            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar cliente");
        }
		
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null, "Error: El usuario ya existe o los datos son inválidos");
	}
}

public Cliente ObtenerCliente(Cliente cli) {
	
	Cliente cliente = null;
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	try {
		
		con = ConexionMySQL.getConexion();
		String sql = "SELECT * FROM CLIENTE WHERE Usuario_Cliente= ? AND Contraseña_Cliente = ?";
		
	   pst = con.prepareStatement(sql);
	   pst.setString(1, cli.getUsuario_Cliente());
	   pst.setString(2, cli.getContraseña_Cliente());
	   
	   rs = pst.executeQuery();
	   
	   while(rs.next()) {
		   cliente = new Cliente(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
	   }
	} catch (Exception e) {
		System.out.println("Error en Obtener Cliente");
	}
	return cliente;
	
}
}
