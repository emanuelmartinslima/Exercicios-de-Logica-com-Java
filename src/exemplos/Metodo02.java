package exemplos;

public class Metodo02 {
	public static void meuMetodo(String nome) {
		System.out.printf("Marcha, %s!!!%n", nome);
	}
	
	public static void main(String[] args) {
		meuMetodo("Emanuel");
		meuMetodo("Manu");
		meuMetodo("Manolo");
	}
}
