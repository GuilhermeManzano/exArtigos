package artigosExercicios;

import java.util.Scanner;

public class CarroNovo {
	public static void main(String[] args) {
		double precoCarro, precoFinal;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de fábrica do veículo: R$ ");
		precoCarro = entrada.nextDouble();
		
		precoFinal = precoCarro + precoCarro*0.28 + precoCarro*0.45;
		
		System.out.println("O preço que o consumidor deve pagar pelo veículo é de: R$ " + precoFinal);
		entrada.close();
	}
}
