import java.util.Scanner;
public class UD03A033{
	public static void main(String[] args){
		int a,b;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un coeficiente: ");
        a=teclado.nextInt();
        System.out.println("Introduzca un coeficiente: ");
        b=teclado.nextInt();
        if (a==0 && b==0)
        {
            System.out.println("LA ECUACIÓN TIENE INFINITAS SOLUCIONES");
        }else{
            if (a==0)
            {
                System.out.println("LA ECUACIÓN NO TIENE SOLUCIÓN");
            }else{
                System.out.println("LA ECUACIÓN TIENE UNA SOLUCIÓN Y ES "+ (-b/a));
            }
        }
	}
}