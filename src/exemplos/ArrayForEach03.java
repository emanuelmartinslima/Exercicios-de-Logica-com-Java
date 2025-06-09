package exemplos;

public class ArrayForEach03 {
	public static void main(String[] args) {
		int[] idades = {40, 89, 35, 50, 27, 42, 5, 10};
		
		int menorIdade = idades[0];
		
		for(int idade : idades) {
			if(menorIdade > idade) {
				menorIdade = idade;
			}
		}
		
		System.out.printf("Menor Idade: %d", menorIdade);
	}
}
