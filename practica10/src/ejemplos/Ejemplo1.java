package ejemplos;

import java.util.*;

public class Ejemplo1 {

	public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<>();
        
        listaNumeros.add(9);
        listaNumeros.add(12);
        
        System.out.println(listaNumeros);

        List<Object> listaObjetos = new ArrayList<>();
        listaObjetos.add(19);
        listaObjetos.add("Hola que tal");
        listaObjetos.add(12.98);
        listaObjetos.add('A');
        listaObjetos.add(new Cuenta("12315", "Pedro Sánchez", 0, 0));
        
        System.out.println(listaObjetos);
        
        for (Object objeto : listaObjetos) {
            
            if(objeto instanceof Cuenta) {
                
                System.out.println(((Cuenta) objeto).getNumCuenta());
            }
            
            System.out.println(objeto);
        }
        
        
        //Recorrer la coleccion con Iterator y bucle while
        Iterator<Object> it = listaObjetos.iterator();
        while(it.hasNext()) {
            
            System.out.println(it.next());
        }
        
        //Recorrer la coleccion con Iterator y bucle for
        for (Iterator<Object> it3 = listaObjetos.iterator(); it3.hasNext();) {
            
            System.out.println(it3.next());
        }
        
        for (Iterator<Object> it5 = listaObjetos.iterator(); it5.hasNext();) {
			if(it5.next() instanceof Integer) {
				it5.remove();
			}
			
		}
        
        
        
        
    }

}
