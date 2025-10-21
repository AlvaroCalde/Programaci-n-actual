import java.util.Scanner;
public class UD01A027{
	public static void main(String[] args){
		int peso;
		float altura;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca peso: ");
		peso=teclado.nextInt();
		System.out.print("Introduzca altura: ");
		altura=teclado.nextFloat();
		System.out.print("IMC: "+peso/(altura*altura));
		
	}
}