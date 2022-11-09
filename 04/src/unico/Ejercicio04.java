package unico;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;
		int i = 1;


		System.out.print("Introduce un número: ");
		num = Integer.parseInt(teclado.nextLine());
		
		i=1;
		while(i <= num) {
		System.out.println(i);
		i++;
		}
		
		i=1;
		do {
			System.out.println(i);
			i++;
		} while (i <= num);
		
		for (i=1; i<=num; i++) {
			System.out.println(i);
		}
	
}
}