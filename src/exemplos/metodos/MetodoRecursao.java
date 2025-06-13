package exemplos.metodos;

public class MetodoRecursao {
	static int soma(int numero) {
		if(numero > 0) {
			return numero + soma(numero - 1);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(soma(10));
	}
}
