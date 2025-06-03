package faccat;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo de Salário Reajustado");
		
		System.out.println("Digite o valor do salário mensal atual do funcionário: ");
		float salario = scanner.nextFloat();
		
		System.out.println("Digite o valor do percentual de reajuste do salário (em %): ");
		float percentualReajuste = scanner.nextFloat();
		
		System.out.printf("Salário Antigo: R$ %.2f%nPercentual de Reajuste: %.2f %%", salario, percentualReajuste);
		
		salario = salario * (1 + (percentualReajuste / 100));
		
		System.out.printf("%nSalário Reajustado: %.2f", salario);
		
		scanner.close();
	}
}
