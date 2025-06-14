package exemplos.metodos;

public class MetodoRecursivo02 {
	static int somaIntervalo(int numeroInicial, int numeroFinal) {
		if(numeroFinal > numeroInicial) {
			return numeroFinal + somaIntervalo(numeroInicial, numeroFinal - 1);
		}
		
		return numeroFinal;
	}
	
	public static void main(String[] args) {
		System.out.println(somaIntervalo(5, 10));
	}
}
