package faccat;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificar Vencedor de Partida");
		
		System.out.print("Digite o nome do primeiro time: ");
		String nomeTime1 = scanner.nextLine();
		
		System.out.printf("Digite número de gols marcados pelo %s: ", nomeTime1);
		int numeroGolsTime1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Digite o nome do segundo time: ");
		String nomeTime2 = scanner.nextLine();
		
		System.out.printf("Digite o número de gols marcados pelo %s: ", nomeTime2);
		int numeroGolsTime2 = scanner.nextInt();
		
		String resultado = "";
		
		if(numeroGolsTime1 > numeroGolsTime2) {
			resultado = "Vencedor: " + nomeTime1;
		} else if(numeroGolsTime2 > numeroGolsTime1){
			resultado = "Vencedor: " + nomeTime2;
		} else {
			resultado = "EMPATE";
		}
		
		System.out.printf("Time 1: %s%nNúmero de Gols: %d%nTime2: %s%nNúmero de Gols: %d%n%nResultado: %s", nomeTime1, numeroGolsTime1, nomeTime2, numeroGolsTime2, resultado);
		
		scanner.close();
	}
}
