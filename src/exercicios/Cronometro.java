package exercicios;

public class Cronometro {
	public static void main(String[] args) {
		for(int horas = 24; horas >= 0; horas--) {
			for(int minutos = 59; minutos >= 0; minutos--) {
				for(int segundos = 59; segundos >= 0; segundos--) {
					System.out.printf("%d : %d : %d%n", horas, minutos, segundos);
				}
			}
		}
	}
}
