package artigosExercicios;

import java.util.Scanner;

public class CarroNovo {
	public static void main(String[] args) {
		double precoCarro, precoFinal;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de f�brica do ve�culo: R$ ");
		precoCarro = entrada.nextDouble();
		
		precoFinal = precoCarro + precoCarro*0.28 + precoCarro*0.45;
		
		System.out.println("O pre�o que o consumidor deve pagar pelo ve�culo � de: R$ " + precoFinal);
		entrada.close();
	}
}
