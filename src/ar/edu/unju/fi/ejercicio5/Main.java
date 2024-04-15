package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println ("Ingrese un numero entre el 0 y el 9: ");
		n = scanner.nextInt();
		
		scanner.close();
		
		for(int i = 0; i <= 10; i++) {
			int j = n;
			System.out.println (n + "x" + i + "=" + j * i);
		}
	}
}
