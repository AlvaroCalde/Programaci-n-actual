import java.util.Scanner;
public class UD01A024{
	public static void main(String[] args){
		int nota1,nota2,nota3;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca una nota: ");
		nota1=teclado.nextInt();
		System.out.print("Introduzca una segunda entero: ");
		nota2=teclado.nextInt();
		System.out.print("Introduzca una tercera entero: ");
		nota3=teclado.nextInt();
		System.out.println("Media: "+ (nota1+nota2+nota3)/3);
		
		
	}
}