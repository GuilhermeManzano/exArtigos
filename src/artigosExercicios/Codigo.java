package artigosExercicios;

import java.util.Scanner;

public class Codigo {
	public static void main(String[] args) {
		int codigo, senha;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o c�digo de acesso: ");
		codigo = entrada.nextInt();
		
		if (codigo == 1234) {
			System.out.print("Insira a senha de acesso: ");
			senha = entrada.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Senha incorreta");
			}
		} else {
			System.out.println("C�digo incorreto");
		}
		
		entrada.close();
	}
}