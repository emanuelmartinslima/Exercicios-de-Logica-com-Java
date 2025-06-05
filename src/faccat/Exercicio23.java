package faccat;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float altura = 0f, pesoIdeal = 0f;
		String nome = "", sexo = "";
		
		System.out.println("Cálculo de Peso Ideal");
		
		System.out.print("Digite o nome da pessoa: ");
		nome = scanner.next();

		
		do {
			System.out.printf("Digite o sexo da pessoa: %nM - masculino%nF - feminino");
			sexo = scanner.next().toLowerCase();
			
			if(!(sexo.equals("m") || sexo.equals("f"))) {
				System.out.println("Sexo inválido! Digite novamente.");
			}
		} while (!(sexo.equals("m") || sexo.equals("f")));
		
		do {
			System.out.print("Digite o valor da altura da pessoa (em metros): ");
			altura = scanner.nextFloat();
			
			if(altura <= 0f) {
				System.out.println("Altura inválida! Insira um valor maior que 0.");
			}
		} while (altura <= 0f);
		
		if(sexo.equals("m")) {
			pesoIdeal = (72.7f * altura) - 58f;
			sexo = "masculino";
		} else {
			pesoIdeal = (62.1f * altura) - 44.7f;
			sexo = "feminino";
		}
		
		System.out.printf("Nome: %s%nSexo: %s%nAltura: %.2f m%nPeso Ideal: %.2f Kg", nome, sexo, altura, pesoIdeal);
		scanner.close();
	}
}
