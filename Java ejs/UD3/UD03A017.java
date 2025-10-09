import java.util.Scanner;
public class UD03A017{
	public static void main(String[] args){
		float n;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n=teclado.nextFloat();
        if (n<1 || n>12)
        {
            System.out.println("Error en la entrada");
        }
	}
}