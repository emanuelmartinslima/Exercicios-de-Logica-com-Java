package faccat;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificar Possibilidade de Formar Triângulo");
		
		System.out.print("Digite o valor do lado A do triângulo (em cm): ");
		float ladoA = scanner.nextInt();
		
		System.out.print("Digite o valor do lado B do triângulo (em cm): ");
		float ladoB = scanner.nextInt();
		
		System.out.print("Digite o valor do lado C do triângulo (em cm): ");
		float ladoC = scanner.nextInt();
		
		float somaAB = ladoA + ladoB, somaBC = ladoB + ladoC, somaAC = ladoA + ladoC;
		String mensagem = "";
		
		if((ladoA > somaBC) || (ladoB > somaAC) || (ladoC > somaAB)) {
			mensagem = "não é possível formar um triângulo";
		} else {
			mensagem = "é possível formar um triângulo";
		}
		
		System.out.printf("Lado A: %.2f cm%nLado B: %.2f cm%nLado C: %.2f cm%n%nSoma Lado AB: %.2f cm%nSoma Lado BC: %.2f cm%nSoma Lado AC: %.2f cm%n%nSituação: %s", ladoA, ladoB, ladoC, somaAB, somaBC, somaAC, mensagem);
		
		scanner.close();
	}
}
