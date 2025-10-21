import java.util.Scanner;
public class UD03A015{
	public static void main(String[] args){
		float n1,n2,aux;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextFloat();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextFloat();
        if (n1>n2)
        {
            aux=n1;
	        n1=n2;
	        n2=aux;
            System.out.println(n1+"   "+n2);
        }
	}
}