package faccat;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidadeAtual, quantidadeMaxima, quantidadeMinima;
		float quantidadeMedia;
		String mensagem = "";
		
		System.out.println("Verificação da Possibilidade de Compra no Estoque");

		System.out.print("Digite a quantidade atual de produto no estoque: ");
		quantidadeAtual = scanner.nextInt();
		
		System.out.print("Digite a quantidade mínima de produto necessário no estoque: ");
		quantidadeMinima = scanner.nextInt();
		
		System.out.print("Digite a quantidade máxima de produto permitido no estoque: ");
		quantidadeMaxima = scanner.nextInt();
		
		quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if(quantidadeAtual >= quantidadeMedia) {
			mensagem = "Não efetuar compra";
		} else {
			mensagem = "Efetuar compra";
		}
		
		System.out.printf("Quantidade Atual: %d%nQuantidade Mínima: %d%nQuantidade Máxima: %d%nQuantidade Média: %.0f%nSituação: %s", quantidadeAtual, quantidadeMinima, quantidadeMaxima, quantidadeMedia, mensagem);
		
		scanner.close();
	}
}
