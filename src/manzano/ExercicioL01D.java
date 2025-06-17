package manzano;

import java.util.Scanner;

public class ExercicioL01D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular Combustível Gasto");
		
		System.out.print("Digite a quantidade de tempo gasto na viagem (em horas): ");
		double horas = scanner.nextDouble();
		
		System.out.print("Digite a velocidade média capturada durante a viagem (em Km/h): ");
		double velocidadeMedia = scanner.nextDouble();
		
		double distancia = horas * velocidadeMedia, litrosUsados = distancia / 12;
		
		System.out.printf("Tempo Gasto: %.2fh%nVelocidade Média: %.2f Km/h%nDistância Percorrida: %.2f Km%nQuantidade de Litros Usados: %.2f L", horas, velocidadeMedia, distancia, litrosUsados);
		
		scanner.close();
	}
}
