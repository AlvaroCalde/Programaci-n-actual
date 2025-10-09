import java.util.Scanner;
public class UD03A018{
	public static void main(String[] args){
		float n1,n2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextFloat();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextFloat();
        if (n2!=0)
        {
            System.out.println(n1/n2);
        }
	}
}