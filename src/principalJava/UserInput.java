package principalJava;
import java.util.Scanner; //parecido com o #include, importa a classe scanner

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//chama a classe scanner e declara, basicamente cria um novo scanner que consegue ler o que entrou no sistema.
		
		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();//coloca a variável como o resultado do que for escaneado na próxima linha.
		
		System.out.println("Quantos anos você tem?");
		int idade = scanner.nextInt();//pega somente um inteiro da prox linha
		scanner.nextLine();
		
		//se pedirmos outra coisa aqui vai dar erro
		System.out.println("Qual sua comida favorita?");
		String comida = scanner.nextLine();
		
		scanner.close();//fechamos o scanner, uma boa prática para evitar vazar memória
		
		System.out.println("OLÁ "+nome);
		System.out.println("Você tem "+idade+" anos de idade!!!");
		System.out.println("Sua comida preferida é: "+comida);
	}

}
