package faccat;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String numeroConta, situacaoConta = "";
		float saldo, debito, credito, saldoAtual;
		
		System.out.println("Verificação da Situação de Saldo da Conta");
		
		System.out.print("Digite o número da conta: ");
		numeroConta = scanner.next();
		
		System.out.print("Digite o valor do saldo da conta: R$ ");
		saldo = scanner.nextFloat();
		
		System.out.print("Digite o valor do dinheiro debitado da conta: R$ ");
		debito = scanner.nextFloat();
		
		System.out.print("Digite o valor do dinheiro creditado da conta: R$ ");
		credito = scanner.nextFloat();
		
		saldoAtual = saldo - debito + credito;
		
		if(saldoAtual >= 0f) {
			situacaoConta = "Saldo Positivo";
		} else {
			situacaoConta = "Saldo Negativo";
		}
		
		System.out.printf("Número da Conta: %s%nSaldo Anterior: R$ %.2f%nDébito: R$ %.2f%nCrédito: R$ %.2f%nSaldo Atual: R$ %.2f%nSituação da Conta: %s", numeroConta, saldo, debito, credito, saldoAtual, situacaoConta);
		
		scanner.close();
	}
}
