package ejercicio7;

import java.util.*;

public class Ej7 {

	public static void main(String[] args) {

/**
 * 7.- Crea una interfaz InterfazPila, con los métodos pop, push, isVacia y cima. Implementa esta interfaz en la
		clase Pila, en la cual los elementos de la pila se guardarán en una colección tipo List o Deque, os aconsejo
		que lo hagáis con ambas. Utilizando alguna de estas clases, hacer un programa para evaluar una expresión
		aritmética escrita en notación postfija e introducida desde teclado. También podéis hacer un algoritmo
		que compruebe si una cadena está correctamente balanceada en paréntesis.
 */
		/*
		 * switch (valor) {
					case 0,1,2,3,4,5,6 ->{yield (valor+1)+" de ";}
					case 7-> {yield "sota de ";}
					case 8-> {yield "caballo de ";}
					case 9-> {yield "rey de ";}
					default ->{yield "";}}
		 */
		
		Deque<Integer> pila = new ArrayDeque<>();
		
		String cadena = "5322*+*76-21*+-";
		
		int aux1, aux2, syso1;
		int cont=0;
		do {
			System.out.println("CONTADOR---"+cont);
			if(cadena.charAt(cont)=='-' || cadena.charAt(cont)=='+'|| //Si el caracter es un simbolo se sacan
					cadena.charAt(cont)=='*'||cadena.charAt(cont)=='/') {//2 numeros y se hace el calculo
				System.out.println("ola: "+cadena.charAt(cont));
				aux1 = pila.pop();//sacar primer valor
				aux2 = pila.pop();//sacar segundo valor
				System.out.println("POP1: "+aux1+"  -POP2: "+aux2);//mostrar lo que sale de la pila
				syso1=((switch (cadena.charAt(cont)) {//Hacer un calculo en base al simbolo obtnido
										case '+' -> {yield aux1+aux2;}
										case '-' -> {yield aux2-aux1;}
										case '*' -> {yield aux1*aux2;}
										case '/' -> {yield aux2/aux1;}				
										default ->{yield '1';}
										}//fin del switch
								)//fin del parentesis
						);//fin del push
				System.out.println(syso1);//mostrar el resultado para control de errores
				pila.push(syso1);//introducir resultado en la pila
				cont++;
				}//fin del if
			else {
				pila.push(Character.valueOf(cadena.charAt(cont))-48);//introduce un numero a la pila
				cont++;
				}
		}while(pila.size()>0&&cont<cadena.length());
		
		System.out.println(pila.pop());
		
	}

}
