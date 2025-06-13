package exemplos.arrays;

public class Array03 {
	public static void main(String[] args) {
		String[] nomes = {"Letícia", "Marcos", "Marcus", "Rafael", "Vinicius", "Vitor"};
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println(nomes[indice]);
		}
		
		System.out.println("");
		
		for(int indice = 0; indice < nomes.length - 1; indice++) {
			System.out.println(nomes[indice]);
		}
	}
}
