package faccat;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String situacao = "";
		
		System.out.println("Verificação de Aprovação de Aluno");
		
		System.out.print("Digite o valor da primeira nota: ");
		float nota1 = scanner.nextFloat();
		
		System.out.print("Digite o valor da segunda nota: ");
		float nota2 = scanner.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		
		System.out.printf("Média do Aluno: %.2f\nSituação do Aluno: %s", media, situacao);
		
		scanner.close();
	}
}
