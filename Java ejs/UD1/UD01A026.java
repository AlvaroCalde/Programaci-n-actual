import java.util.Scanner;
public class UD01A026{
	public static void main(String[] args){
		int gradosC;
		float gradosF;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca Celsius: ");
		gradosC=teclado.nextInt();
		gradosF= (float) 1.8*gradosC+32f;
		System.out.print("Grados Fahrenheit: "+gradosF);
		
	}
}