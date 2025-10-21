import java.util.Scanner;
public class UD01A025{
	public static void main(String[] args){
		int radio;
		float volumen;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca radio: ");
		radio=teclado.nextInt();
		volumen=(float)(4*Math.PI*Math.pow(radio,3)/2);
		System.out.print("Volumen: "+volumen);
		
	}
}