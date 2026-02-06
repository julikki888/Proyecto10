package ejercicio6;

import java.util.Comparator;

public class Test{

	public static void main(String[] args) {
	
		// Prueba de creación de un alumnos con fecha no v�lida
		Alumno alumno1 = new Alumno((byte)1,"María","García","García","28/02/1987","C/ Alameda, 23", "11111111");
	
		System.out.println(alumno1.toString());
		System.out.println(alumno1.toStringCompleto());
	
		Alumno alumno2 = new Alumno((byte)6,"Luis","González","Pozo","50/3/2000","C/ Nueva, 1", "12345678");
		System.out.println(alumno2.toStringCompleto());
		System.out.println(alumno2.toStringFechaNombre());
		System.out.println(alumno2.toString());
		
		// Creación de varios objetos tipo Alumno
		Alumno a1 = new Alumno((byte)1,"María","García","García","27/02/1987","C/ Alameda, 23", "11111111");
		Alumno a2 = new Alumno((byte)2,"Ana","García","García","12/05/2003","C/ Alameda, 23", "22222222");
		Alumno a3 = new Alumno((byte)3,"Juan","García","Blanco","21/09/1996","C/ La silla, 10", "343434334");
		Alumno a4 = new Alumno((byte)4,"José","García","Blanco","15/10/2003","Avda. Andalucia, s/n", "343423112");
		Alumno a5 = new Alumno((byte)5,"María Isabel","López","Jiménez","01/03/2002","C/ El Plato, 12", "676754534");
		Alumno a6 = new Alumno((byte)6,"Luis","González","Pozo","01/03/2000","C/ Nueva, 1", "12345678");
		Alumno a7 = new Alumno((byte)7,"Francisco","Ruiz","Romero","29/02/2000","Carretera Los Prados, km 4","98765433");
		Alumno a8 = new Alumno((byte)8,"Carmen","Romero","Sierras","27/08/1987","C/ El duende, 10", "11223344");
		Alumno a9 = new Alumno((byte)9,"Manuel","Romero","Blanco","18/01/1999","C/ Santa Clara, 18", "654332657");
		Alumno a10= new Alumno((byte)10,"Manuel","Romero","Blanco","12/09/2003","Avda. La Constitución,2","99999999");

		// -------------- PRUEBA DE LA PRIMERA VERSION DE LA CLASE GRUPO --------
		// Crear un objeto de la clase Grupo, y añadirle todos los 
		// objetos alumno anteriores
		// ----------------------------------------------------------------------
		Grupo grupoDAW = new Grupo();
		grupoDAW.añadeAlumno(a1);
		grupoDAW.añadeAlumno(a2);
		grupoDAW.añadeAlumno(a3);
		grupoDAW.añadeAlumno(a4);
		grupoDAW.añadeAlumno(a5);
		grupoDAW.añadeAlumno(a6);
		grupoDAW.añadeAlumno(a7);
		grupoDAW.añadeAlumno(a8);
		grupoDAW.añadeAlumno(a9);
		grupoDAW.añadeAlumno(a10);
		//grupoDAW.getMiGrupo().add(a10);
			
		System.out.println("LISTA CON EL ORDEN EN QUE SE HAN AÑADIDO LOS ALUMNOS"+
							grupoDAW.toString());
	
		// -------------- PRUEBA DE LA SEGUNDA VERSI�N DE LA CLASE GRUPO --------
		// Crear un objeto de la clase Grupo, y a�adirle todos los 
		// objetos alumno anteriores
		// ----------------------------------------------------------------------
		GrupoV2 grupoDAW2 = new GrupoV2();
		grupoDAW2.add(a1);
		grupoDAW2.add(a2);
		grupoDAW2.add(a3);
		grupoDAW2.add(a4);
		grupoDAW2.add(a5);
		grupoDAW2.add(a6);
		grupoDAW2.add(a7);
		grupoDAW2.add(a8);
		grupoDAW2.add(a9);
		grupoDAW2.add(a10);
			
		System.out.println("LISTA CON EL ORDEN EN QUE SE HAN A�ADIDO LOS ALUMNOS"+
		                    grupoDAW2.toString());
		/*• Además queremos poder ordenar la colección por los siguientes criterios:
			o Por apellido1 y DNI.
			o Por edad.
			o Por edad y nombre.
			o Por nombre.
			*/
		
		grupoDAW2.sort((o1,o2)->o1.getApellido1().compareTo(o2.getApellido1())!=0?
						(o1.getApellido1().compareTo(o2.getApellido1())):(o1.getDni().compareTo(o2.getDni())));
	}

}
