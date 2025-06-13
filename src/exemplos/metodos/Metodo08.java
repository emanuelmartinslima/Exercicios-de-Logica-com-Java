package exemplos.metodos;

public class Metodo08 {
	static int calcularSomaInteira(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static float calcularSomaDecimal(float numero1, float numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		int somaInteira = calcularSomaInteira(10, 5);
		float somaDecimal = calcularSomaDecimal(10.5f, 6.8f);
		
		System.out.println(somaInteira);
		System.out.println(somaDecimal);
	}
}
