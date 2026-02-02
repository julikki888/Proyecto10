package ejercicio1;

import java.util.Objects;

/**
 * Definición de la clase Libro, guarda la información de un libro
 * que estará en una biblioteca
 */
public class Libro {
	
	/**
	 * Variables de instancia
	 */
	private String titulo;  // Título del libro
	private String autor;   // Autor del libro
	private boolean estado; // Indicará true (el libro está en la biblioteca)
							// o false (el libro se encuentra prestado)
	
	/**
	 * Constructores
	 */
	public Libro(String t, String a, boolean e) {
		this.autor = a;
		this.titulo = t;
		this.estado = e;
	}
	
	public Libro(String t, String a) {
		this(t, a, true);
	}
	
	
	/**
	 * Métodos get y set
	 */
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public boolean isEstado() {return estado;}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {this.autor = autor;}
	public void setEstado(boolean estado) {this.estado = estado;}
	
	
	/**
	 * Redefinir el método toString
	 */
	@Override
	public String toString() {
		return this.titulo + " de " + this.autor +
				(this.estado ? " está en la biblioteca":" está prestado");
	}

	/**
	 * Redefinición de hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	/**
	 * Redefinición de equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Libro other = (Libro) obj;
		return this.autor.equalsIgnoreCase(other.getAutor()) && 
			   this.titulo.equalsIgnoreCase(other.getTitulo());
	}
	
		

}












