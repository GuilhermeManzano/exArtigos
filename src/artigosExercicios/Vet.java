package artigosExercicios;

import java.util.Scanner;

public class Vet {
	public static void main(String[] args) {
		int VET[] = new int[50];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<50; i++) {
			System.out.print("Digite o valor da posi��o " + i + ": ");
			VET[i] = entrada.nextInt();
			for(int j=0; j<50; j++) {
				if(VET[i]==VET[j] && i!=j) {
					System.out.println("o n�mero " + VET[i] + " � repetido!");
					break;
				}
			}
		}

		entrada.close();
	}
}
