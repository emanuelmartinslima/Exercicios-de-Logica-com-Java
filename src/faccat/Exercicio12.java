package faccat;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conversor de Fahrenheit para Celsius");
		
		System.out.print("Digite o valor da temperatura (em °F): ");
		float fahrenheit = scanner.nextFloat();
		
		float celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.printf("\nFahrenheit: %.2f °F\nCelsius: %.2f °C", fahrenheit, celsius);
		
		scanner.close();
	}
}
