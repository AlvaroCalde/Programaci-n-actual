import java.util.Scanner;
public class UD03A023{
	public static void main(String[] args){
		int n1,n2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextInt();
        if (n1%n2==0)
        {
            System.out.println("Cociente: "+ (n1%n2));
        }else{
            System.out.println("Cociente: "+ (n1%n2));
            System.out.println("Resto: "+ (n1/n2));
        }
	}
}