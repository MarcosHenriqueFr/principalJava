package principalJava;
import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o lado x: ");
		double x = scanner.nextDouble();
		x = Math.pow(x,2);
		
		System.out.print("Coloque o lado y: ");
		double y = scanner.nextDouble();
		y = Math.pow(y,2);
		
		double hipotenusa = Math.sqrt(x + y);
		
		scanner.close();
		
		//String.format("Formatação %.numberf e a variavel");
		
		System.out.println("Essa é a hipotenusa: "+String.format("%.4f", hipotenusa));
	}

}
