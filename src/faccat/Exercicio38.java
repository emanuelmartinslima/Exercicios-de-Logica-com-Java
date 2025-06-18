package faccat;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Validar Acesso do Usuário");
		
		String codigoArmazenado = "1234", senhaArmazenada = "9999", codigoUsuario, senhaUsuario;
		
		System.out.print("Digite o código do usuário: ");
		codigoUsuario = scanner.next();
		
		if(codigoUsuario.equals(codigoArmazenado)) {
			System.out.print("Digite a senha do usuário: ");
			senhaUsuario = scanner.next();
			
			if(senhaUsuario.equals(senhaArmazenada)) {
				System.out.println("Acesso Permitido!");
			} else {
				System.out.println("Senha Incorreta!");
			}
		} else {
			System.out.println("Usuário Inválido!");
		}
		
		scanner.close();
	}
}
