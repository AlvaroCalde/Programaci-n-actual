import java.util.Scanner;
public class UD01A029{
	public static void main(String[] args){
		int bytes;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca bytes: ");
		bytes=teclado.nextInt();

		System.out.println("Bits: "+ bytes*8);
		System.out.println("Kilobytes: "+(float)bytes/1024);

		
	}
}

