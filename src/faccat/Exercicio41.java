package faccat;

import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
		char conceito = 'A';
		
		System.out.println("Atribuir Conceito a Aluno");
		
		System.out.print("Digite a primeira nota do aluno (N1): ");
		nota1 = scanner.nextFloat();
		
		System.out.print("Digite a segunda nota do aluno (N2): ");
		nota2 = scanner.nextFloat();
		
		System.out.print("Digite a terceira nota do aluno (N3): ");
		nota3 = scanner.nextFloat();
		
		System.out.print("Digite a média dos exercícios obtida pelo aluno: ");
		mediaExercicios = scanner.nextFloat();
		
		mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7f;
		
		if(mediaAproveitamento >= 9) {
			conceito = 'A';
		} else if((mediaAproveitamento >= 7.5) && (mediaAproveitamento < 9)) {
			conceito = 'B';
		} else if((mediaAproveitamento >= 6) && (mediaAproveitamento < 7.5)) {
			conceito = 'C';
		} else {
			conceito = 'D';
		}
		
		System.out.printf("Nota 1: %.2f%nNota 2: %.2f%nNota 3: %.2f%nMédia de Exercícios: %.2f%n%nMédia de Aproveitamento: %.2f%nConceito: %s", nota1, nota2, nota3, mediaExercicios, mediaAproveitamento, conceito);
		
		scanner.close();
	}
}
