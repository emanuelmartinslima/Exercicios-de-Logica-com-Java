package exemplos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sequência de Fibonacci");
		System.out.println("Digite a quantidade de números da sequência: ");
		int quantidadeNumeroSequencia = scanner.nextInt();
		
		int numeroAnterior = 0;
		int numeroAtual = 1;
		int numeroSucessor = 0;
		
		for(int contador = 0; contador < quantidadeNumeroSequencia; contador++) {
			System.out.print(numeroAnterior);
			
			if(contador != quantidadeNumeroSequencia - 1) {
				System.out.print(" - ");
			}
			
			numeroSucessor = numeroAnterior + numeroAtual;
			numeroAnterior = numeroAtual;
			numeroAtual = numeroSucessor;
		}
		
		scanner.close();
	}

}
