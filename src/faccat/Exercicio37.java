package faccat;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular Custo Total de Compra");
		
		System.out.print("Digite a quantidade comprada de maçãs (em Kg): ");
		float quantidadeMaca = scanner.nextFloat();
		
		System.out.print("Digite a quantidade comprada de morangos (em Kg): ");
		float quantidadeMorango = scanner.nextFloat();
		
		float quantidadeTotal = quantidadeMaca + quantidadeMorango, precoMaca = 0f, precoMorango = 0f, precoTotal, desconto = 0f;
		
		if(quantidadeMaca <= 5) {
			precoMaca = 1.80f;
		} else {
			precoMaca = 1.50f;
		}
		
		if(quantidadeMorango <= 5) {
			precoMorango = 2.50f;
		} else {
			precoMorango = 2.20f;
		}
		
		precoTotal = precoMaca * quantidadeMaca + precoMorango * quantidadeMorango;
		
		if((quantidadeTotal> 8) || (precoTotal > 25)) {
			desconto = 0.10f;
			precoTotal = precoTotal * (1 - desconto);
		}
		
		System.out.printf("Quantidade de Maçãs: %.2f Kg%nPreço: R$ %.2f%n%nQuantidade de Morangos: %.2f Kg%nPreço: R$ %.2f%n%nQuantidade Total Comprada: %.2f%nPreço Total: R$ %.2f%nDesconto Aplicado: %.2f%%", quantidadeMaca, precoMaca, quantidadeMorango, precoMorango, quantidadeTotal, precoTotal, (desconto * 100));
		
		scanner.close();
	}
}
