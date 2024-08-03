package principalJava;

public class SwapVariables {

	public static void main(String[] args) {
		/*
		int x = 21;
		int y = 87;
		int temp;
		*/
		String x = "Água";
		String y = "Suco";
		String temp = null;//ou não declare nada
		
		System.out.println("Esse é o x(antes): "+x);
		System.out.println("Esse é o y(antes): "+y);
		
		temp = x;//processo, pense como se tivéssemos que colocar em outro lugar antes de mexer com a variável diretamente.
		x = y;
		y = temp;
		
		System.out.println("Esse é o x: "+x);
		System.out.println("Esse é o y: "+y);

	}

}
