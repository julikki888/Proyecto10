package ejercicio2;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		//Definir una coleccion de tipo List, y añadirle varops elementos
		
		List<String> miLista = new ArrayList<>();
		
		miLista.add("Hola");
		miLista.add("Hola buenos dias");
		miLista.add("Hoy me siento bien");
		miLista.add("Yo me vengo arriba");
		miLista.add("Y me pego contra la pared");
		
		System.out.println(miLista);
		 
		
		//Poner cada cadena a mayusculas
		for (ListIterator<String> li = miLista.listIterator(); li.hasNext();) {
			String a = li.next();
			li = a.toUpperCase();
		}
		
		System.out.println(miLista);
		
		
		
		
	}

}
