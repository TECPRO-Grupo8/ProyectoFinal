package Clase;
import java.time.LocalDate;

public class Libro {
	private int codigoLibro;
	private String nombreLibro;
	private String autor;
	private String editorial;
	private int stock = 0;
	private LocalDate fecha;

	public Libro(int codigoLibro, String nombreLibro, String autor, String editorial, int stock, LocalDate fecha) {
		this.codigoLibro = codigoLibro;
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.editorial = editorial;
		this.stock = stock;
		this.fecha = fecha;
	}

	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void AumentarStock() {
		stock++;
	}
	public boolean DisminuirStock() {
		if (stock > 0) {
			stock--;
			return true;
		}else {
			return false;
		}
	}
}
