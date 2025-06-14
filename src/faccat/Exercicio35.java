package faccat;

import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calcular Custo Total de Combustível");

		System.out.printf("Digite o tipo de combustível: %nA - Álcool%nG - Gasolina");
		String tipoCombustivel = scanner.next().toLowerCase().trim();
		
		System.out.print("Digite a quantidade de combustível comprado (em litros): ");
		float litros = scanner.nextFloat();

		float precoLitro = 0f, desconto = 0f, custoTotal = 0f;

		if (!(tipoCombustivel.equals("a")) && !(tipoCombustivel.equals("g"))) {
			System.out.println("Tipo de Combustível Inválido!");
		} else {
			if (tipoCombustivel.equals("a")) {
				tipoCombustivel = "Álcool";
				precoLitro = 2.90f;

				if (litros <= 20) {
					desconto = 0.03f;
				} else {
					desconto = 0.05f;
				}
			} else {
				tipoCombustivel = "Gasolina";
				precoLitro = 3.30f;

				if (litros <= 20) {
					desconto = 0.04f;
				} else {
					desconto = 0.06f;
				}
			}
			
			custoTotal = litros * precoLitro * (1 - desconto);
			
			System.out.printf("%nTipo de Combustível: %s%nQuantidade de Litros Comprados: %.2f L%nPreço por Litro: R$ %.2f%nDesconto Aplicado: %.2f %%%nCusto Total: R$ %.2f", tipoCombustivel, litros, precoLitro, (desconto * 100), custoTotal);
		}

		scanner.close();
	}
}
