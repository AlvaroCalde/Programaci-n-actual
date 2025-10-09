import java.util.Scanner;
public class UD01A023{
	public static void main(String[] args){
		int n1,n2;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca entero: ");
		n1=teclado.nextInt();
		System.out.print("Introduzca otro entero: ");
		n2=teclado.nextInt();
		System.out.println("Cociente: "+ n1/n2);
		System.out.println("Resto: "+ n1%n2);
		
	}
}