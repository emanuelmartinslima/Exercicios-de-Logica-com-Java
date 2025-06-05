package faccat;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int horasTrabalhadas, horasExtras = 0;
		float salarioHora, salarioTotal, salarioExtra;
		
		System.out.println("Cálculo de Salário com Horas Extras");
		
		System.out.print("Digite a quantidade de horas trabalhadas no mês pelo funcionário: ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Digite o valor do salário por hora trabalhada: R$ ");
		salarioHora = scanner.nextFloat();
		
		if(horasTrabalhadas > 160) {
			horasExtras = horasTrabalhadas - 160;
		}
		
		salarioExtra = horasExtras * salarioHora * 1.5f;
		
		salarioTotal = salarioHora * 160f + salarioExtra;
		
		System.out.printf("Horas Trabalhadas: %dh%nHoras Extras Trabalhadas: %dh%nSalário Hora: R$ %.2f%nSalário Total: R$ %.2f", horasTrabalhadas, horasExtras, salarioHora, salarioTotal);
		
		scanner.close();
	}
}
