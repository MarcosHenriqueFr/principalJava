package principalJava;

public class IfStatements {

	public static void main(String[] args) {
	//a mesma coisa de outras linguagens
		
		int idade = 62;
		
		if(idade >= 60) {
			System.out.println("Terceira idade.");
		} else if(idade >= 18) {
			System.out.println("Você é um adulto");
		} else if(idade >= 13) {
			System.out.println("Você é um adolescente!");
		} else {
			System.out.println("Você é uma criança!");
		}
	}

}
