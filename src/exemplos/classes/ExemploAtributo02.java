package exemplos.classes;

import java.util.Scanner;

public class ExemploAtributo02 {
	String primeiroNome = "";
	String ultimoNome = "";
	int idade = 0;
	
	public static void main(String[] args) {
		ExemploAtributo02 objetoPrincipal = new ExemploAtributo02();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro nome da pessoa: ");
		objetoPrincipal.primeiroNome = scanner.next();
		
		System.out.print("Digite o último nome da pessoa: ");
		objetoPrincipal.ultimoNome = scanner.next();
		
		System.out.print("Digite a idade da pessoa: ");
		objetoPrincipal.idade = scanner.nextInt();
		
		System.out.printf("%nNome Completo: %s %s%nIdade: %d", objetoPrincipal.primeiroNome, objetoPrincipal.ultimoNome, objetoPrincipal.idade);
		
		scanner.close();
	}
}
