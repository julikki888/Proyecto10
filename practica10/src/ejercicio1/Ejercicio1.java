package ejercicio1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Definir una colección de tipo Collection parametrizada a Object
		Collection<Object> miColeccion = new ArrayList<Object>();
		
		// Añadir varios elementos
		miColeccion.add("Hola");
		miColeccion.add(12);
		miColeccion.add(76.23);
		miColeccion.add("Hasta luego");
		miColeccion.add(new Random());
		
		Libro libro1 = new Libro("El tiempo entre costuras","María Dueñas");
		Libro libro2 = new Libro("Una columna de fuego","Ken Follett");
		
		miColeccion.add(libro1);
		miColeccion.add(libro2);
		miColeccion.add(new Libro("El Señor de los Anillos", "J.R. Tolkien"));
		miColeccion.add(Integer.valueOf(99));
		
		System.out.println("Mi coleccion: "+miColeccion);
		
		// -------------------------------------------------------------------
		// Recorrer la colección con Iterator y bucle while
		// Forma 1
		Iterator<Object> it = miColeccion.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Forma 2 (con bucle while, pero lectura adelantada)
		Iterator<Object> it2 = miColeccion.iterator();
		
		Object elemento = it2.next();  // Primer elemento
		
		while (it2.hasNext()) {
			System.out.println(elemento);
			
			elemento = it2.next();  // Avanzo y "recojo" el siguiente elemento
		}
		System.out.println(elemento);  // Mostrar el elemento

		
		// -------------------------------------------------------------------
		// Recorrer la colección con Iterator y bucle for
		for (Iterator<Object> it3=miColeccion.iterator(); it3.hasNext();) {
			System.out.println(it3.next());
		}

		
		// -------------------------------------------------------------------
		// Elimina con la ayuda de Iterator, todos los números enteros.
/*		Iterator<Object> it4 = miColeccion.iterator();
		Object elem;
		while (it4.hasNext()) {
			elem = it4.next();
			if (elem instanceof Integer) { // Es un número entero
				it4.remove();  // Borra el último elemento obtenido con next
			}
		}
	*/	
		for (Iterator<Object> it5 = miColeccion.iterator(); it5.hasNext();) {
			if (it5.next() instanceof Integer) { // Es un número entero
				it5.remove();  // Borra el último elemento obtenido con next
			}
		}

		// Recorrer la colección con bucle foreach
		System.out.println("\n\n* * Colección tras el borrado de los enteros");
		for (Object obj: miColeccion) {
			System.out.println(obj);
		}		
		
		// -------------------------------------------------------------------
		// Busca uno de los libros que has añadido, y modifícale su título para 
		// que aparezca todo en mayúscula.
		boolean encontrado=false;
		Object elem;
		Libro libroBuscado;
		
		Iterator<Object> it6 = miColeccion.iterator();
		while (it6.hasNext() && !encontrado) {
			elem = it6.next();
			
			if (elem instanceof Libro) {
				libroBuscado = (Libro)elem;
				System.out.println(libroBuscado);
				if (libroBuscado.getTitulo().equals("Una columna de fuego")) {
					libroBuscado.setTitulo(libroBuscado.getTitulo().toUpperCase());
					encontrado=true;
				}
			}
		}
		
		// Recorrer la colección con bucle foreach
		System.out.println("\n\n* * Colección tras modificación de un libro");
		for (Object obj: miColeccion) {
			System.out.println(obj);
		}	
		
	}

}








