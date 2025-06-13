package exemplos.metodos;

public class Metodo03 {
	static void MostrarDadosProfessor(String nome, int idade) {
		System.out.printf("Nome: %s%nIdade: %d%n%n", nome, idade);	}
	
	public static void main(String[] args) {
		MostrarDadosProfessor("Jailson", 40);
		MostrarDadosProfessor("Aurora", 50);
		MostrarDadosProfessor("Júlio", 50);
	}
}
