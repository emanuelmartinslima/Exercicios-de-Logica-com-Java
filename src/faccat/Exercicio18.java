package faccat;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anoNascimento, anoAtual = 2025, idade;
		
		System.out.println("Digite o ano de nascimento, iremos calcular a idade e retornar se pode votar ou não: ");
		anoNascimento = scanner.nextInt();
		
		idade = anoAtual - anoNascimento;
	
		System.out.printf("Ano Atual: %d\nAno Nascimento: %d\nIdade: %d\n", anoAtual, anoNascimento, idade);
		
		if(idade >= 18) {
			System.out.println("Situação: Pode Votar");
		} else {
			System.out.println("Situação: Não Pode Votar");
		}
		
		scanner.close();
	}
}
