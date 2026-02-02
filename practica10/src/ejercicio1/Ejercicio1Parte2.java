package ejercicio1;

import java.util.*;
import java.util.Collection;
import java.util.Random;

public class Ejercicio1Parte2 {

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
		
		Libro miLibro = new Libro("Don Quijote","Miguel de Cervantes");
		miColeccion.add(miLibro);
		
		System.out.println("Mi coleccion: "+miColeccion);

		// --------------------------------------------------------------------
		// Prueba del método contains 
		if (miColeccion.contains("Hola"))
			System.out.println("SI contiene la cadena \"Hola\"");
		else
			System.out.println("NO contiene la cadena \"Hola\"");
		
		if (miColeccion.contains("Holita"))
			System.out.println("SI contiene la cadena \"Holita\"");
		else
			System.out.println("NO contiene la cadena \"Holita\"");

		
		if (miColeccion.contains(99))
			System.out.println("SI existe el 99");
		else
			System.out.println("NO existe el 99");
		
		if (miColeccion.contains(100))
			System.out.println("SI existe el 100");
		else
			System.out.println("NO existe el 100");
		
		// En este caso comparamos con dos objetos libro "diferentes", pero con el mismo contenido
		// Si anulo equals de la clase Libro, nos dirá que "No existe"
		if (miColeccion.contains(new Libro("Una columna de fuego","Ken Follett"))) 
			System.out.println("SI contiene el libro \"Una columna de fuego\"");
		else
			System.out.println("NO contiene el libro \"Una columna de fuego\"");
		
		// En este caso comparamos el objeto consigo mismo
		// Si anulo equals de la clase Libro, nos dirá que "Si existe", ya 
		// que utiliza equals de la clase Object, y compara sólo direcciones de memoria
		if (miColeccion.contains(miLibro))
			System.out.println("SI contiene El Quijote");
		else
			System.out.println("NO contiene El Quijote");
		
		if(miColeccion.remove("Hasta luego")){
			System.out.println("Hasta luego ha sido borrado");
			}
		else
			System.out.println("Hasta luego no se pudo borrar");
		
		if(miColeccion.remove(99)){
			System.out.println("99 ha sido borrado");
			}
		else
			System.out.println("99 luego no se pudo borrar");
		
		
		List<Integer> cienColecciones = new ArrayList<Integer>();
		
		cienColecciones.add(100);
		cienColecciones.add(17);
		cienColecciones.add(29);
		cienColecciones.add(49);
		cienColecciones.add(63);
		
		System.out.println(cienColecciones.toString());
		
		//borrar el elemento 17
		cienColecciones.remove(Integer.valueOf(17));
		
		System.out.println(cienColecciones.toString());
		
		cienColecciones.sort(new Comparador());
		
		System.out.println(cienColecciones.toString());

	}

}









