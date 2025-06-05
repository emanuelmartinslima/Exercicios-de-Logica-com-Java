package faccat;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float salarioFixo, vendasEfetuadas, comissao = 0f, salarioTotal;
		
		System.out.println("Cálculo de Salário com Comisssão");
		
		System.out.print("Digite o valor do salário fixo do funcionário: R$ ");
		salarioFixo = scanner.nextFloat();
		
		System.out.print("Digite o valor total das vendas efetuadas: R$ ");
		vendasEfetuadas = scanner.nextFloat();
		
		if(vendasEfetuadas > 1500f) {
			comissao = 5f;
		} else {
			comissao = 3f;
		}
		
		salarioTotal = salarioFixo + (vendasEfetuadas * (comissao / 100f));
		
		System.out.printf("Salário Fixo: R$ %.2f%nVendas Efetuadas: R$ %.2f%nComissão Aplicada: %.2f%%%nSalárioTotal: %.2f", salarioFixo, vendasEfetuadas, comissao, salarioTotal);
		
		scanner.close();
	}
}
