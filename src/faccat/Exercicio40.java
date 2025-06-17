package faccat;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular Total a Pagar");
		
		System.out.print("Digite o nome do produto (descrição): ");
		String nomeProduto = scanner.nextLine();
		System.out.print("");
		
		System.out.print("Digite a quantidade adquirida: ");
		int quantidadeProduto = scanner.nextInt();
		
		System.out.print("Digite o preço unitário do produto: R$ ");
		float precoUnitario = scanner.nextFloat();
		
		float custoTotal = 0f, desconto = 0f, totalPagar = 0f;
		
		if(quantidadeProduto <= 5) {
			desconto = 0.02f;
		} else if((quantidadeProduto > 5) && (quantidadeProduto <= 10)) {
			desconto = 0.03f;
		} else {
			desconto = 0.05f;
		}
		
		custoTotal = quantidadeProduto * precoUnitario;
		
		totalPagar = custoTotal * (1 - desconto);
		
		System.out.printf("%nNome do Produto: %s%nQuantidade Comprada: %d%nPreço Unitário: R$ %.2f%nCusto Total: R$ %.2f%nDesconto Aplicado: %.2f%%%nTotal a Pagar: %.2f", nomeProduto, quantidadeProduto, precoUnitario, custoTotal, (desconto * 100), totalPagar);
		
		scanner.close();
	}
}
