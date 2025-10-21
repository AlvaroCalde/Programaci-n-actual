import java.util.Scanner;
public class UD01A0210{
	public static void main(String[] args){
		int n,digito1,digito2;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca entero de 2 dígitos: ");
		n=teclado.nextInt();
		digito1=n/10;
		digito2=n%10;
		n=digito2*10+digito1;
		System.out.println(n);	
	}
}
