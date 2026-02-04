package ejemplos;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {


		/**	
		 * 1.- Crear una colección tipo Collection, en la colección vamos a guardar de todo un poco, así que la
					parametrizaremos a Object. A continuación, realiza las siguientes acciones sobre este objeto:
		*/	
		
		
		Collection<Object> miColeccion = new ArrayList<>();
			
			/**
			• Añade varios elementos a tu colección: varias cadenas, varios números (con y sin decimales), un
			objeto Random, varios objetos Libro.
			*/
		miColeccion.add("En un lugar de la mancha, de cullo nombre no quiero acordarme...");
		miColeccion.add(23);
		miColeccion.add(23.543);
		miColeccion.add(93);
		miColeccion.add(new Libro("El Quijote", "Antonio Machado"));
		miColeccion.add("me gustan los durianes y los mangos");
		miColeccion.add(new Random().nextInt(100));
		
		
			/**
			• Prueba a mostrar la colección de diferentes formas, es decir, directamente, recorriéndola con
					Iterator, utilizando el bucle foreach, ...
			*/
		//mostrado con un sisout y toString	
		System.out.println(miColeccion.toString());
		
		//recorrido con un for con iteracion
		System.out.println(" \n--ForIterator------------");
		for (Iterator<Object> i = miColeccion.iterator(); i.hasNext();) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
		
		//recorido con un while creando una iteracion fuera
		System.out.println(" \n--While------------");
		Iterator<Object>iterator1 = miColeccion.iterator();
		while(iterator1.hasNext()) {
		System.out.println(iterator1.next());	
		}		
		
		//recorrido con for each
		System.out.println(" \n--ForEach------------");
		for (Object obj : miColeccion) {
			System.out.println(obj);
		}
		
		
		
			/**
			• Elimina con la ayuda de Iterator, todos los números enteros.
			*/
		System.out.println("\n-----Eliminar todos los enteros");
		for (Iterator<Object> i = miColeccion.iterator(); i.hasNext();) {
			Object obj = (Object) i.next();
			if (obj instanceof Integer) {
				i.remove();
			}
		}
		System.out.println(miColeccion.toString());
			/**
			• Busca uno de los libros que has añadido, y modifícale su título para que aparezca todo en mayúscula.
			
			
			• Prueba los métodos contains y remove, tanto con cadenas y números como con libros.
			
			
			• Añade el número 100, y posteriormente prueba a eliminarlo con remove (para ello tendrás que crear
					una nueva colección tipo List). Prueba también a recorrer esta nueva colección como si fuese un array
					(posición a posición)

		 */
		
		
	}

}
