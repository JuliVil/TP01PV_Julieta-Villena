package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, j;
		System.out.println ("Ingrese un numero entre el 0 y el 10: ");
		n = scanner.nextInt();
		
		scanner.close();
		
		j = n - 1;
		while(j > 0) {
			n = n * j;
			j--;
		}
		System.out.println ("El factorial del numero es: " + n);
	}
}
