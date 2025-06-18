package faccat;

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificar Requerimento de Aposentadoria");
		
		System.out.print("Digite o código do empregado: ");
		String codigoEmpregado = scanner.next();
		
		System.out.print("Digite o ano de nascimento do empregado: ");
		int anoNascimento = scanner.nextInt();
		
		System.out.print("Digite o ano de ingresso do empregado na empresa: ");
		int anoIngresso = scanner.nextInt();
		
		int anoAtual = LocalDate.now().getYear(), idadeEmpregado, anosTrabalhados;
		String situacaoRequerimento = "Não Requerer";
		
		idadeEmpregado = anoAtual - anoNascimento;
		
		anosTrabalhados = anoAtual - anoIngresso;
		
		if((idadeEmpregado >= 65) || (anosTrabalhados >= 30) || ((idadeEmpregado >= 60) && (anosTrabalhados >= 25))) {
			situacaoRequerimento = "Requerer Aposentadoria";
		}
		
		System.out.printf("%nCódigo do Empregado: %s%nAno de Nascimento: %d%nAno de Ingresso na Empresa: %d%n%nIdade: %d%nAnos Trabalhados: %d%nAno Atual: %d%n%nSituação do Requerimento: %s", codigoEmpregado, anoNascimento, anoIngresso, idadeEmpregado, anosTrabalhados, anoAtual, situacaoRequerimento);

		scanner.close();
	}
}
