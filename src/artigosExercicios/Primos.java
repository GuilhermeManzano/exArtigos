package artigosExercicios;

import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		int inicio, fim, primo=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("N�mero inicial: ");
		inicio = entrada.nextInt();
		System.out.print("N�mero final: ");
		fim = entrada.nextInt();
		
		for (int i=inicio; i<=fim; i++) {
			for (int j=1; j<=i; j++) {
				if (i % j == 0) {
					primo++;
				}
			}
			if (primo == 2) {
				System.out.println("O n�mero " + i + " � PRIMO!");
			}
			primo = 0;
		}
		
		entrada.close();
	}
}
