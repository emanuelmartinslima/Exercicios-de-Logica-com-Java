package exemplos.construtores;

public class Construtor01 {
	String nomeModelo;
	int anoModelo;
	
	public Construtor01(int anoModelo, String nomeModelo) {
		this.anoModelo = anoModelo;
		this.nomeModelo = nomeModelo;
	}
	
	public static void main(String[] args) {
		Construtor01 carro = new Construtor01(1969, "Mustang");
		
		System.out.printf("Nome do Modelo do Carro: %s%nAno do Carro: %d", carro.nomeModelo, carro.anoModelo);
	}
}
