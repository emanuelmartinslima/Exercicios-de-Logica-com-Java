package faccat;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mostrar a Soma dos Dois Maiores Números");
		
		System.out.print("Digite um primeiro valor inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite um segundo maior valor inteiro: ");
		int numero2 = scanner.nextInt();
		
		System.out.print("Digite um terceiro maior valor inteiro: ");
		int numero3 = scanner.nextInt();
		
		int primeiroMaiorNumero = 0, segundoMaiorNumero = 0;
		
		if((numero1 > numero2) && (numero2 > numero3)) {
			primeiroMaiorNumero = numero1;
			segundoMaiorNumero = numero2;
		} else if((numero1 > numero3) && (numero3 > numero2)) {
			primeiroMaiorNumero = numero1;
			segundoMaiorNumero = numero3;
		} else if((numero2 > numero1) && (numero1 > numero3)) {
			primeiroMaiorNumero = numero2;
			segundoMaiorNumero = numero1;
		} else if((numero2 > numero3) && (numero3 > numero1)) {
			primeiroMaiorNumero = numero2;
			segundoMaiorNumero = numero3;
		} else if((numero3 > numero1) && (numero1 > numero2)) {
			primeiroMaiorNumero = numero3;
			segundoMaiorNumero = numero1;
		} else if((numero3 > numero2) && (numero2 > numero1)) {
			primeiroMaiorNumero = numero3;
			segundoMaiorNumero = numero2;
		}
		
		int soma = primeiroMaiorNumero + segundoMaiorNumero;
		
		System.out.printf("1° Maior Número: %d%n2° Maior Número: %d%nSoma: %d", primeiroMaiorNumero, segundoMaiorNumero, soma);
		
		scanner.close();
	}
}
