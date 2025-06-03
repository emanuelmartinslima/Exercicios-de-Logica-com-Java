package faccat;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoJogo = 0;
		
		System.out.println("Cálculo da Duração da Partida de Xadrez");
		
		System.out.print("Digite a hora inicial da partida: ");
		horaInicial = scanner.nextInt();
		
		System.out.print("Digite a hora final da partida: ");
		horaFinal = scanner.nextInt();
		
		if(horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
		} else {
			duracaoJogo = horaFinal - horaInicial + 24;
		}
		
		System.out.printf("%nHora Inicial: %dh%nHora Final: %dh%nDuração do Jogo: %dh", horaInicial, horaFinal, duracaoJogo);
		
		scanner.close();
	}
}
