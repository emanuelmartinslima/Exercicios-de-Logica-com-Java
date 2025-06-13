package faccat;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificação de Maior Número");
		
		System.out.print("Digite um primeiro valor inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite um segundo valor inteiro: ");
		int numero2 = scanner.nextInt();
		
		System.out.print("Digite um terceiro valor inteiro: ");
		int numero3 = scanner.nextInt();
		
		int maiorNumero = 0;
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			maiorNumero = numero1;
		} else if((numero2 > numero1) && (numero2 > numero3)) {
			maiorNumero = numero2;
		} else if((numero3 > numero1) && (numero3 > numero2)){
			maiorNumero = numero3;
		}
		
		System.out.printf("Maior Número: %d", maiorNumero);
		
		scanner.close();
	}
}
