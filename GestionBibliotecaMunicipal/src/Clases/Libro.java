package Clases;

public class Libro {
private String Codigo_Libro;
private String Nombre_Libro;
private String Autor_Libro;
private String Editorial_Libro;
private int Stock_Libro;

public Libro(String codigo_Libro, String nombre_Libro, String autor_Libro, String editorial_Libro, int stock_Libro) {
	Codigo_Libro = codigo_Libro;
	Nombre_Libro = nombre_Libro;
	Autor_Libro = autor_Libro;
	Editorial_Libro = editorial_Libro;
	Stock_Libro = stock_Libro;
}

public String getCodigo_Libro() {
	return Codigo_Libro;
}
public void setCodigo_Libro(String codigo_Libro) {
	Codigo_Libro = codigo_Libro;
}
public String getNombre_Libro() {
	return Nombre_Libro;
}
public void setNombre_Libro(String nombre_Libro) {
	Nombre_Libro = nombre_Libro;
}
public String getAutor_Libro() {
	return Autor_Libro;
}
public void setAutor_Libro(String autor_Libro) {
	Autor_Libro = autor_Libro;
}
public String getEditorial_Libro() {
	return Editorial_Libro;
}
public void setEditorial_Libro(String editorial_Libro) {
	Editorial_Libro = editorial_Libro;
}
public int getStock_Libro() {
	return Stock_Libro;
}
public void setStock_Libro(int stock_Libro) {
	Stock_Libro = stock_Libro;
}


}
