package exemplos;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");		
		int opcao = scanner.nextInt();
		
		System.out.println("Você escolheu: ");
		
		switch(opcao) {
			case 1:
				System.out.print("Domingo");
				break;
			case 2:
				System.out.print("Segunda-feira");
				break;
			case 3:
				System.out.print("Terça-feira");
				break;
			case 4:
				System.out.print("Quarta-feira");
				break;
			case 5:
				System.out.print("Quinta-feira");
				break;
			case 6:
				System.out.print("Sexta-feira");
				break;
			case 7:
				System.out.print("Sábado");
				break;
			default:
				System.out.print("Opção inválida!");
				break;
		}
		
		scanner.close();
	}
}
