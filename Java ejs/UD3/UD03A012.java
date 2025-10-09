import java.util.Scanner;
public class UD03A012{
	public static void main(String[] args){
		float n;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n=teclado.nextFloat();
        System.out.println(n);
        if (n>=0)
        {
            System.out.println(n*(-1));
        }
        
	}
}