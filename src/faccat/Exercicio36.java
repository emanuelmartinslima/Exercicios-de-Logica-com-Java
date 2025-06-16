package faccat;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular com Idade de Pessoas");
		
		System.out.print("Digite a idade do primeiro homem: ");
		int idadeHomem1 = scanner.nextInt();
		
		System.out.print("Digite a idade do segundo homem: ");
		int idadeHomem2 = scanner.nextInt();
		
		System.out.println("Digite a idade da primeira mulher: ");
		int idadeMulher1 = scanner.nextInt();
		
		System.out.print("Digite a idade da segunda mulher: ");
		int idadeMulher2 = scanner.nextInt();
		
		int homemMaisNovo = 0, homemMaisVelho = 0, mulherMaisNova = 0,  mulherMaisVelha = 0, soma, produto;

		if(idadeHomem1 > idadeHomem2) {
			homemMaisNovo = idadeHomem2;
			homemMaisVelho = idadeHomem1;
		} else {
			homemMaisNovo = idadeHomem1;
			homemMaisVelho = idadeHomem2;
		}
		
		if(idadeMulher1 > idadeMulher2) {
			mulherMaisNova = idadeMulher2;
			mulherMaisVelha = idadeMulher1;
		} else {
			mulherMaisNova = idadeMulher1;
			mulherMaisVelha = idadeMulher2;
		}
		
		soma = homemMaisVelho + mulherMaisNova;
		produto = homemMaisNovo * mulherMaisVelha;
		
		System.out.printf("%nIdade do Homem Mais Novo: %d%nIdade do Homem Mais Velho: %d%nIdade da Mulher Mais Nova: %d%nIdade da Mulher Mais Velha: %d%n%nSoma: %d%nProduto: %d", homemMaisNovo, homemMaisVelho, mulherMaisNova, mulherMaisVelha, soma, produto);
		
		scanner.close();
	}
}
