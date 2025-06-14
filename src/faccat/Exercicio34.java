package faccat;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Validar Teste de Mesa");
		
		System.out.print("Digite um valor inteiro para X: ");
		int x = scanner.nextInt();
		
		System.out.print("Digite um valor inteiro para Y: ");
		int y = scanner.nextInt();
		
		int z = (x * y) + 5;
		
		char resposta;
		
		if(z <= 0) {
			resposta = 'A';
		} else if(z <= 100) {
			resposta = 'B';
		} else {
			resposta = 'C';
		}
		
		System.out.printf("X: %d%nY: %d%nZ: %d%nResposta: %c", x, y, z, resposta);
		
		scanner.close();
	}
}
