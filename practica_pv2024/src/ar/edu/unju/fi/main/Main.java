package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// NOS PIDEN QUE EL ALUMNO ARIEL VEGA SE REGISTRE LAS NOTAS FINALES DE 4 MATERIAS
	
	Alumno alumno = new Alumno();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("ingrese el legajo:");
	Integer legajo = scanner.nextInt();
	System.out.println("ingrese el apellido:");
	String apellido = scanner.next();
	System.out.println("ingrese el nombre:");
	String nombre = scanner.next();
	
	alumno.setLegajo(legajo);
	alumno.setApellido(apellido);
	alumno.setNombre(nombre);
	
	System.out.println(alumno.toString());
	
	int numMaterias = 1;
	
	while(numMaterias <= 4) {
		// cargar materias
		System.out.println("ingrese el nombre de la materia: ");
		String nombreMateria = scanner.next();
		System.out.println("ingrese el codigo de la materia: ");
		String codigoMateria = scanner.next();
		
		Materia materia = new Materia(codigoMateria, nombreMateria);
		
		System.out.println("ingrese el codigo del registro de nota: ");
		String codigoNota = scanner.next();
		System.out.println("ingrese la nota final: ");
		Float nota = scanner.nextFloat();
		
		RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
		
		System.out.println(registroNota.toString());
		numMaterias++;
		
		}
	
	
	}
}
