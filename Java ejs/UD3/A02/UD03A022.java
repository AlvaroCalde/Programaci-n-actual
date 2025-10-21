import java.util.Scanner;
public class UD03A022{
	public static void main(String[] args){
		int n1,n2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextInt();
        if (n2%n1==0)
        {
            System.out.println(n2+" es divisor de "+n1);
        }else{
            System.out.println(n2+" no es divisor de "+n1);
        }
	}
}