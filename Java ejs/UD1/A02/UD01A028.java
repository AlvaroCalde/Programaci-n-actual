import java.util.Scanner;
public class UD01A028{
	public static void main(String[] args){
		int seg;
		float horas;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca segundos: ");
		seg=teclado.nextInt();
		horas=seg/3600;
		System.out.println("Horas: "+ (int) horas);
		System.out.println("Minutos: "+ (int) (seg-horas*3600)/60);
		System.out.println("Horas: "+ seg%60);
		
	}
}