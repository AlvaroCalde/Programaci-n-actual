import java.util.Scanner;
public class UD01A022{
	public static void main(String[] args){
		int n,suma;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca entero: ");
		n=teclado.nextInt();
		suma=n*(n+1)/2;
		System.out.println("Suma: "+suma);
		
	}
}