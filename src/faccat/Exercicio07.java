package faccat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conversor de Idade para Dias");
		
		System.out.println("Digite os anos de idade que tem: ");
		int anos = scanner.nextInt();
		
		System.out.println("Digite a quantidade de meses passados desde o início do ano: ");
		int meses = scanner.nextInt();
		
		System.out.println("Digite a quantidade de dias passados desde o início do mês: ");
		int dias = scanner.nextInt();
		
		System.out.printf("Anos: %d%nMeses: %d%nDias: %d", anos, meses, dias);
		
		dias = anos * 365 + meses * 30 + dias;
		
		System.out.printf("\nDias Totais de Idade: %d", dias);
		
		scanner.close();
	}
}
