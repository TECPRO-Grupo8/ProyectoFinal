package Hijos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Clase.Libro;
import Padre.Usuario;
public class Cliente extends Usuario{
	private int codigoCliente;
	private String sancion;
	private int contadorSanciones = 0;
	private List<Libro>librosRentados;

	public Cliente(String nombre, int codigoCliente, String sancion, int contadorSanciones, List<Libro> librosRentados) {
		super(nombre);
		this.codigoCliente = codigoCliente;
		this.sancion = sancion;
		this.contadorSanciones = contadorSanciones;
		this.librosRentados = new ArrayList<>();
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getSancion() {
		return sancion;
	}

	public void setSancion(String sancion) {
		this.sancion = sancion;
	}

	public int getContadorSanciones() {
		return contadorSanciones;
	}

	public void setContadorSanciones(int contadorSanciones) {
		this.contadorSanciones = contadorSanciones;
	}

	public List<Libro> getLibrosRentados() {
		return librosRentados;
	}

	public void setLibrosRentados(List<Libro> librosRentados) {
		this.librosRentados = librosRentados;
	}


	public void AgregarLibroRentado(Libro x) {
		librosRentados.add(x);
	}

	public Libro ObtenerLibroRentado(int x) {
		return librosRentados.get(x);
	}
	public int TamañoLibrosRentados() {
		return librosRentados.size();
	}
	public Libro BuscarLibro(int codigolibro) {
		for(int i = 0; i < TamañoLibrosRentados(); i++) {
			if(ObtenerLibroRentado(i).getCodigoLibro() == codigolibro) {
				return ObtenerLibroRentado(i);
			}
		}
		return null;
	}
	public boolean RentarLibro(Libro x) {
		if (x.DisminuirStock()) {
			librosRentados.add(x);
			x.setFecha(LocalDate.now());
			return true;
		}
		return false;
	}
	public void DevolverLibro(Libro x) {
		x.AumentarStock();
		librosRentados.remove(x);
	}
}
