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
		Construtor01 carro02 = new Construtor01(2000, "Kwid");
		Construtor01 carro03 = new Construtor01(2010, "Ferrari");
		
		System.out.printf("Nome do Modelo do Carro: %s%nAno do Carro: %d", carro.nomeModelo, carro.anoModelo);
		System.out.printf("%n%nNome do Modelo do Carro: %s%nAno do Carro: %d", carro02.nomeModelo, carro02.anoModelo);
		System.out.printf("%n%nNome do Modelo do Carro: %s%nAno do Carro: %d", carro03.nomeModelo, carro03.anoModelo);
	}
}
