package ejercicio8;

import java.util.*;

public class Ej8 {

	public static void main(String[] args) {

		SortedSet<Integer> aleatorios = new TreeSet<>();
		
		while(aleatorios.size()!=1000) {
			aleatorios.add((int)((Math.random()*1000)+1));
		}
		
		System.out.println(aleatorios);
		
	}

}
 