package exercicios;

import java.util.Scanner;

public class AreaLosango {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo da Área do Losango");
		
		System.out.println("Digite o valor da diagonal maior do losango (em cm): ");
		float diagonalMaior = scanner.nextFloat();
		
		System.out.println("Digite o valor da diagonal menor do losango (em cm): ");
		float diagonalMenor = scanner.nextFloat();
		
		float area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.printf("Diagonal Maior: %.2f cm\nDiagonal Menor: %.2f cm\nÁrea: %.2f cm²", diagonalMaior, diagonalMenor, area);
		
		scanner.close();
	}
}
