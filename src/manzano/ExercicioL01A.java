package manzano;

import java.util.Scanner;

public class ExercicioL01A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Converter Celsius para Fahrenheit");
		
		System.out.print("Digite a temperatura (em °C): ");
		float celsius = scanner.nextFloat();
		
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("%nCelsius: %.2f °C%nFahrenheit: %.2f °F", celsius, fahrenheit);
		
		scanner.close();
	}
}
