package faccat;

import java.util.Scanner;

public class Exercicio43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float ladoA, ladoB, ladoC;
		String mensagem = "";
		
		System.out.println("Validar Existência e Tipo do Triângulo");
		
		System.out.print("Digite o tamanho do lado A do triâgulo (em cm): ");
		ladoA = scanner.nextFloat();
		
		System.out.print("Digite o tamanho do lado B do triângulo (em cm): ");
		ladoB = scanner.nextFloat();
		
		System.out.print("Digite o tamanho do lado C do triângulo (em cm): ");
		ladoC = scanner.nextFloat();
		
		if((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
			
			if((ladoA == ladoB) && (ladoB == ladoC)) {
				mensagem = "Tipo de Figura: Triângulo Equilátero";
			} else if((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
				mensagem = "Tipo de Figura: Triângulo Isóceles";
			} else {
				mensagem = "Tipo de Figura: Triângulo Escaleno";
			}
			
		} else {
			mensagem = "Não é possível formar um triângulo!";
		}
		
		System.out.printf("Lado A: %.2f cm%nLado B: %.2f cm%nLado C: %.2f cm%n%n%s", ladoA, ladoB, ladoC, mensagem);
		
		scanner.close();
	}
}
