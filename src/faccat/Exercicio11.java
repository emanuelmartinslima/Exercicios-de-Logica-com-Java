package faccat;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float salarioFixo, valorTotalVendas, comissaoPorCarro, salarioFinal, percentualVendasEfetuadas = 5;
		int numeroCarrosVendidos;
		
		System.out.println("Cálculo de Salário de Vendedor de Carros");
		
		System.out.print("Digite o valor do salário fixo do funcionário: R$ ");
		salarioFixo = scanner.nextFloat();
		
		System.out.print("Digite o valor total das vendas efetuadas pelo funcionário: R$ ");
		valorTotalVendas = scanner.nextFloat();
		
		System.out.print("Digite o valor da comissão recebida por carro vedido: R$ ");
		comissaoPorCarro = scanner.nextFloat();
		
		System.out.print("Digite a quantidade de carros vendidos pelo funcionário: ");
		numeroCarrosVendidos = scanner.nextInt();
		
		salarioFinal = salarioFixo + (valorTotalVendas * percentualVendasEfetuadas / 100) + (numeroCarrosVendidos * comissaoPorCarro);
		
		System.out.printf("Salário Fixo: R$ %.2f%nValor Total de Vendas Efetuadas: R$ %.2f%nComissão Por Carro: R$ %.2f%nNúmero de Carros Vendidos: %d%nSalário Final: R$ %.2f", salarioFixo, valorTotalVendas, comissaoPorCarro, numeroCarrosVendidos, salarioFinal);
		
		scanner.close();
	}
}
