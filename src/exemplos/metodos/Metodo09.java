package exemplos.metodos;

public class Metodo09 {
	static int calcularSoma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static float calcularSoma(float numero1, float numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		int somaInteira = calcularSoma(10, 5);
		float somaDecimal = calcularSoma(10.5f, 8.8f);
		
		System.out.println(somaInteira);
		System.out.println(somaDecimal);
	}
}
