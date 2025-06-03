package faccat;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroVotosTotais, numeroVotosBrancos, numeroVotosNulos, numeroVotosValidos;
		float percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;
		
		System.out.println("Cálculo de Percentual de Eleitores do Município");
		
		System.out.println("Digite o número total de eleitores: ");
		numeroVotosTotais = scanner.nextInt();
		
		System.out.println("Digite o número de votos brancos: ");
		numeroVotosBrancos = scanner.nextInt();
		
		System.out.println("Digite o número de votos nulos: ");
		numeroVotosNulos = scanner.nextInt();
		
		numeroVotosValidos = numeroVotosTotais - (numeroVotosBrancos + numeroVotosNulos);
		
		percentualVotosBrancos = numeroVotosBrancos * 100 / numeroVotosTotais;
		
		percentualVotosNulos = numeroVotosNulos * 100 / numeroVotosTotais;
		
		percentualVotosValidos = numeroVotosValidos * 100 / numeroVotosTotais;
		
		System.out.printf("Número de Votos\n\nTotal de Eleitores: %d\nVotos Brancos: %d\nVotos Nulos: %d\nVotos Válidos: %d\n\nPercentual de Votos\n\nVotos Brancos: %.2f %%\nVotos Nulos: %.2f %%\nVotos Válidos: %.2f %%", numeroVotosTotais, numeroVotosBrancos, numeroVotosNulos, numeroVotosValidos, percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos);
		
		scanner.close();
	}
}
