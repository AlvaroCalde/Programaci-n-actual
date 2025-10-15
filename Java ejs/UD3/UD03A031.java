import java.util.Scanner;
public class UD03A031{
	public static void main(String[] args){
		int n1,n2,n3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextInt();
        System.out.println("Introduzca un número: ");
        n2=teclado.nextInt();
        System.out.println("Introduzca un número: ");
        n3=teclado.nextInt();
        if (n1==n2 && n2==n3)
        {
            System.out.println("Los tres son iguales");
        }else{
            if (n1!=n2 && n1!=n3 && n2!=n3)
            {
                System.out.println("Los tres son distintos");
            }else{
                if ( n1==n2 || n1==n3 || n2==n3)
                {
                    System.out.println("Dos números son iguales");
                }
            }
        }
	}
}