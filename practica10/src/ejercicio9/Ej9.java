package ejercicio9;

import java.util.*;

public class Ej9 {

	public static void main(String[] args) {

/**
* 9.- Crea un diccionario de términos informáticos y su definición, con la ayuda de las colecciones.
El diccionario deberá estar ordenado por clave de forma alfabética.
Para probarlo, pide al usuario un término y muéstrale su definición.
*/
		
		SortedMap<String, String> miDic = new TreeMap<>((o1,o2)->o1.compareToIgnoreCase(o2));
		
		miDic.put("Ordenador","Loca makina de escritura loka" );
		miDic.put("Ratoncillo","La cosa que mueves y tocas" );
		
		System.out.println(miDic.values());

		for (String key : miDic.keySet()) {
			if (key.equalsIgnoreCase("Ratoncillo"))
				System.out.println(miDic.get(key));
		}
		
	}

}
