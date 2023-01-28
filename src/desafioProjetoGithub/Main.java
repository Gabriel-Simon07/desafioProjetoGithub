package desafioProjetoGithub;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = scanner.next();

		System.out.println("Informe quantos anos você tem:");
		int anos = scanner.nextInt();

		
		
		System.out.println("Meu nome é " + nome + " e tenho " + anos + " anos de idade " + maiorOuMenorDeIdade(anos) + ".");
		scanner.close();
	}
	
	public static String maiorOuMenorDeIdade(int anos) {
		if(anos >= 18) {
			return "e sou maior de idade";
		}
		return "e não sou maior de idade";
	}
}
