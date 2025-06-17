package manzano;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioL01C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular Volume da Lata de Óleo");
		
		System.out.print("Digite o valor do tamanho do raio da lata (em cm): ");
		double raio = scanner.nextFloat();
		
		System.out.print("Digite o valor do tamanho da altura da lata (em cm): ");
		double altura = scanner.nextFloat();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.printf("Raio: %.2f cm%nAltura: %.2f cm%nVolume: %.2f cm³ ou %.2f L", raio, altura, volume, (volume / 1000));
		
		scanner.close();
	}
}
