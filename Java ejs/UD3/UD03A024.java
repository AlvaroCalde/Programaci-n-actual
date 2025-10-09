import java.util.Scanner;
public class UD03A024{
	public static void main(String[] args){
		int n1,n2,n3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n3=teclado.nextInt();
        if (n1-n2==n2-n3)
        {
            System.out.println("Es una progresión arimética");
        }else{
            System.out.println("No es una progresión arimética");
        }
	}
}