package principalJava;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		//Operadores Lógicos - usados para conectar duas ou mais expressões 
		//next(); armazena a próxima tecla
		//! - reverte o valor booleano
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você está jogando um jogo, pressione q ou Q para sair!");
		String resposta = scanner.next();
		
		//string.equals(value) para analisar se uma strings se iguala com um valor
		if(resposta.equals("q") || resposta.equals("Q")) {
			System.out.println("Você saiu do jogo!");
		} else {
			System.out.println("Você ainda está jogando o jogo");
		}
		
		scanner.close();
	}

}
