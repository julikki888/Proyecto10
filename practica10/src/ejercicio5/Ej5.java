package ejercicio5;

import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		
		//-------------------------------------
		//Crear un mapa apartir de HashMap

		Map<String, String> dic = new HashMap<>();
		
		dic.put("Clave", "Valor");
		dic.put("Español", "Ingles");
		dic.put("coche", "car");
		dic.put("ordenador", "computer");
		dic.put("lapiz", "pen");
		dic.put("casa", "home");
		dic.put("LIBRO", "BOOK");
		dic.put("copa", "cup");

		System.out.println("------HashMap----------\n"+dic);
		
		System.out.println(dic.get("LIBRO"));//diferencia masyus y minusculas
		
		
		//--------------------------------------
		//Crear un mapa apartir de LinkedHashMap
		Map<String, String> dic2 = new LinkedHashMap<>(dic);
		
		System.out.println("\n------LinkedHashMap----------\n"+dic2);

		
		//--------------------------------------
		//Crear un mapa ordenado con TreeMap
		SortedMap<String, String> dic3 = new TreeMap<>(dic);
		
		System.out.println("\n------TreeMap----------\n"+dic3);

		
		
		SortedMap<String, String> dic4 = new TreeMap<>();
		dic4.putAll(dic);
		
		System.out.println("\n------TreeMap----------\n"+dic4);
		
		//Si añadimos un elemento repetido, nos devuelve el value anterios, 
		//y modifica el value con el nuevo valor
		
		if(dic4.put("ordenador","compu").equals("computer")) {
			System.out.println("Elemento repetido, y sobreescribido");
		}
		
	
		
		//--------------------------------------
		//Crear un mapa ordenado con TreeMap agregando los parametros del comparator con lambda
		//--------------------------------------------------------------------------
		SortedMap<String, String> dicLambda = new TreeMap<>(//lo hacemos sin distingir mayus y minus
											(o1,o2)-> o2.toLowerCase().compareTo(o1.toLowerCase())); 
		dicLambda.putAll(dic);
		
		System.out.println("\n------dicLambda----------\n"+dicLambda);
		
		System.out.println("\n-----Recorer el TreeMap con un iterador y for---------");
		Set<String> dicClaves = dic.keySet();
		for (Iterator<String> i = dicClaves.iterator(); i.hasNext();) {
			String clave = (String) i.next();
			System.out.println(clave+" - "+dic.get(clave));
		}
		
		
		SortedSet<String> clavesLambda = new TreeSet<>(//lo hacemos sin distingir mayus y minus
				(o1,o2)-> o2.toLowerCase().compareTo(o1.toLowerCase())); 
		clavesLambda.addAll(dic.keySet());
		
		

		
	}

}
