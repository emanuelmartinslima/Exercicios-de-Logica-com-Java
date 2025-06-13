package exemplos.arrays;

public class ArrayForEach02 {
	public static void main(String[] args) {
		int[] idades = {40, 89, 35, 50, 27, 42, 5, 10};
		
		int tamanho = idades.length, soma = 0;
		float media;
		
		for(int idade : idades) {
			soma += idade;
		}
		
		media = soma / tamanho;
		
		System.out.printf("Soma das idades: %d%nMédia das Idades: %.2f", soma, media);
	}
}
