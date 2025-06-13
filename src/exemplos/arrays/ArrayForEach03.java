package exemplos.arrays;

public class ArrayForEach03 {
	public static void main(String[] args) {
		int[] idades = {40, 89, 1, 50, 27, 42, 5, 10};
		
		int menorIdade = idades[0];
		
		for(int idade : idades) {
			menorIdade = (idade < menorIdade) ? idade : menorIdade;
		}
		
		System.out.printf("Menor Idade: %d", menorIdade);
	}
}
