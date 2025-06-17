package manzano;

import java.util.Scanner;

public class ExercicioL01B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Converter Fahrenheit para Celsius");
		
		System.out.print("Digite a temperatura (em °F): ");
		float fahrenheit = scanner.nextFloat();
		
		float celsius = (fahrenheit - 32f) * (5f / 9f);
		
		System.out.printf("Fahrenheit: %.2f °F%nCelsius: %.2f °C", fahrenheit, celsius);
		
		scanner.close();
	}
}
