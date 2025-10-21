import java.util.Scanner;
public class UD03A025{
	public static void main(String[] args){
		int n1,n2,n3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n3=teclado.nextInt();
        if (Math.abs(n3-n1)<Math.abs(n2-n3))
        {
            System.out.println(n3+" está más cerca de "+ n1);
        }else{
            System.out.println(n3+" está más cerca de "+ n2);
        }
	}
}