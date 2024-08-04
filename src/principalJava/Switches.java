package principalJava;

public class Switches {

	public static void main(String[] args) {
		//testa igualdade com uma lista de valores
		//funciona com byte, short, char, int e string, além dos enum
		//mesma coisa com outras linguagens
		
		String dia = "Domingo";
		
		switch(dia) {
			case "Sábado": System.out.println("Hoje é um dia de descanso! :)");
				break;
			case "Domingo": System.out.println("Hoje é um dia de descanso! :)");
				break;
			default: System.out.println("Hoje não é um dia de descanso :(");
				break;
		}
	}

}
