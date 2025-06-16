package exemplos.classes;

public class ExemploAtributo01 {
	String primeiroNome = "Emanuel";
	String ultimoNome = "Lima";
	int idade = 20;
	
	public static void main(String[] args) {
		ExemploAtributo01 objetoPrincipal = new ExemploAtributo01();
		
		System.out.println("Nome Completo: " + objetoPrincipal.primeiroNome + " " + objetoPrincipal.ultimoNome);
		System.out.println("Idade: " + objetoPrincipal.idade);
	}
}
