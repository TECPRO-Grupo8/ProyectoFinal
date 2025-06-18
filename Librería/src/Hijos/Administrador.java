package Hijos;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import Clase.Libro;
import Padre.Usuario;
public class Administrador extends Usuario {
	private int codigoAdministrador;
	private static List<Libro>librosglobales = new ArrayList<>();
	private static List<Cliente>usuariosregistrados = new ArrayList<>();

	public Administrador(String nombre, int codigoAdministrador) {
		super(nombre);
		this.codigoAdministrador = codigoAdministrador;
	}
	public void AgregarLibroGlobales (Libro libro) {
	     librosglobales.add(libro);
	}
	public Libro ObtenerLibroGlobal (int x) {
		return librosglobales.get(x);
	}
	public int TamañoLibroGlobales () {
		return librosglobales.size();
	}
	public Libro BuscarLibroGlobal (int codigolibro) {
		for(int i = 0; i < TamañoLibroGlobales(); i++) {
			if(ObtenerLibroGlobal(i).getCodigoLibro() == codigolibro) {
				return ObtenerLibroGlobal(i);
			}
		}
		return null;
	}
	public void AgregarUsuarioRegistrado(Cliente x) {
		usuariosregistrados.add(x);
	}
	public Cliente ObtenerUsuarioRegistrado(int x) {
		return usuariosregistrados.get(x);
	}
	public int TamañoUsuarioRegistrado() {
		return usuariosregistrados.size();
	}
	public Cliente BuscarUsuarioRegistrado(int codigocliente) {
		for(int i = 0; i < TamañoUsuarioRegistrado(); i++) {
			if(ObtenerUsuarioRegistrado(i).getCodigoCliente() == codigocliente) {
				return ObtenerUsuarioRegistrado(i);
			}
		}
		
		return null;
	}

	static {
		Cliente c1 = new Cliente("Roberto", 1234, "Ninguna sanción aplicada", 0, new ArrayList<>());
		Cliente c2 = new Cliente("Raul", 2222, "Ninguna sanción aplicada", 0, new ArrayList<>());
		Cliente c3 = new Cliente("Nicole", 3333, "Ninguna sanción aplicada", 0, new ArrayList<>());
		Cliente c4 = new Cliente("Edgar", 4444, "Ninguna sanción aplicada", 0, new ArrayList<>());
		Cliente c5 = new Cliente("Pedro", 5555, "Ninguna sanción aplicada", 0, new ArrayList<>());
		
		usuariosregistrados.add(c1);
		usuariosregistrados.add(c2);
		usuariosregistrados.add(c3);
		usuariosregistrados.add(c4);
		usuariosregistrados.add(c5);
	}

	public void SancionarCliente(Cliente cliente) {
		cliente.setSancion("Tiene sanciones aplicadas");
	    cliente.setContadorSanciones(cliente.getContadorSanciones() + 1);
	}
	public void EliminarUsuarioRegistrado(Cliente cliente) {
		usuariosregistrados.remove(cliente);
	}
	public static List<Libro> ObtenerListaGlobal() {
	    return librosglobales;
	}
	public static List<Cliente>ObtenerListaClientesGlobal(){
		return usuariosregistrados;
	}

}
