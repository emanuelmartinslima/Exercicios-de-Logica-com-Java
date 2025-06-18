package exemplos.palavraThis;

public class Exemplo01 {
	int x;
	
	public Exemplo01(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		Exemplo01 objeto = new Exemplo01(10);
		
		System.out.printf("Atributo X: %d", objeto.x);
	}
}
