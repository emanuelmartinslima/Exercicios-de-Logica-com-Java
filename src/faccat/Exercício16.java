package faccat;

import java.util.Scanner;

public class Exercício16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float precoMaca = 1f;
		
		System.out.println("Cálculo de Custo Total da Compra");
		
		System.out.print("Digite a quantidade de maçãs compradas: ");
		int macasCompradas = scanner.nextInt();
		
		if(macasCompradas < 12) {
			precoMaca = 1.30f;
		}
		
		float custoTotal = macasCompradas * precoMaca;
		
		System.out.printf("Maçãs Compradas: %d\nPreço Unitário: %.2f\nCusto Total: %.2f", macasCompradas, precoMaca, custoTotal);
		
		scanner.close();
	}
}
