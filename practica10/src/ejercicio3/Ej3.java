package ejercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ej3 {

	public static void main(String[] args) {
/*3.-Crea una colección de libros que esté ordenada por autor, y en caso de estar repetido el autor,por título
del libro. Añade varios libros a la colección, y finalmente muestra la colección por pantalla. Realiza dos
versiones diferentes del ejercicio, una en la que almacenes los libros en un conjunto ordenado, y otra en
una lista.
Aquí tienes algunos libros que puedes añadir para hacer las pruebas:*/

		SortedSet<Libro> misLibros = new TreeSet<>((o1,o2)->//inicio del metodo
											o1.getAutor().compareToIgnoreCase(o2.getAutor()));//fin del metodo
		
		misLibros.add(new Libro("María Dueñas","Entre costuras",false));
		misLibros.add(new Libro("Sarah Lark","En el país de la nube blanca",true));
		misLibros.add(new Libro("Eduardo Punset","Viaje al optimismo",false));
		misLibros.add(new Libro("María Dueñas","Misión olvido",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Señor de los Anillos",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Hobbit",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Silmarillion",true));
		misLibros.add(new Libro("Kate Morton","El jardín olvidado",true));
		misLibros.add(new Libro("Sarah Lark","La canción de los maoríes",true));
	
		List<Libro> misLibrosList = new LinkedList<Libro>(misLibros);
		
		misLibrosList.sort((o1,o2)->//inicio del metodo
								o1.getAutor().compareToIgnoreCase(o2.getAutor()));
		
	}

}
