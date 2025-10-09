import java.util.Scanner;
public class UD01A021{
	public static void main(String[] args){
		String nombre;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Hola: "+nombre);
	}
}