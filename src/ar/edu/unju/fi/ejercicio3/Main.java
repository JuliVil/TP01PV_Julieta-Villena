package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println ("Ingrese un numero entero: ");
		n = scanner.nextInt();
		
		scanner.close();
		
		if(n % 2 != 0) {
			int doble = n * 2;
			System.out.println (doble);
		} 
		else {
			int triple = n * 3;
			System.out.println (triple);
		}
	}
}
