package exemplos.metodos;

public class Metodo04 {
	static void checarIdade(int idade) {
		if(idade < 18) {
			System.out.println("Acesso negado!");
		} else {
			System.out.println("Acesso permitido!");
		}
	}
	
	public static void main(String[] args) {
		checarIdade(10);
		checarIdade(18);
	}
}
