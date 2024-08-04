package principalJava;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
	//gerar valores aleatórios
	//importar uma random class
	//Quando importamos algo tem uma ordem a ser seguida, que é a ordem de utilização de uma classe importada
		
	//NomedaClass Instancia = new NomedaClass();//que é o método nesse caso
	//Isso cria pseudo-random numbers
	//São os valores que ficam dentro da área de capacidade dos data types, sua capacidade de armazenamento
		
		Random randomNumber = new Random();
		
		int x = randomNumber.nextInt(6) + 1;//agora só pode ir de 1 a 6
		//por padrão de -2bi até 2 bi
		
		double y = randomNumber.nextDouble();
		//por padrão um valor de 0 a 1
		
		boolean z = randomNumber.nextBoolean();
		//valores true e false
		
		if(x > 3) {
			System.out.println("Your number is greater than 3: "+x);
		} else {
			System.out.println("Your number is less than 4: "+x);
		}
		System.out.println(y+" "+z);
	}

}
