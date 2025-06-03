package faccat;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float percentualDistribuidor = 28, percentualImpostos = 45;
		
		System.out.println("Cálculo de Custo Final de Carro");
		
		System.out.print("Digite o valor do custo de fábrica do carro: R$ ");
		float custoFabrica = scanner.nextFloat();
		
		float custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor / 100) + (custoFabrica * percentualImpostos / 100);		
		
		System.out.printf("Custo de Fábrica: R$ %.2f\nPercentual de Distribuidor: %.2f %%\nPercentual de Impostos: %.2f %%\nCusto Final: R$ %.2f", custoFabrica, percentualDistribuidor, percentualImpostos, custoFinal);
		
		scanner.close();
	}
}
