import java.util.Scanner;
public class UD03A019{
	public static void main(String[] args){
		int ang1,ang2,ang3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un ángulo: ");
        ang1=teclado.nextInt();
        System.out.println("Introduzca otro ángulo: ");
        ang2=teclado.nextInt();
        System.out.println("Introduzca otro ángulo: ");
        ang3=teclado.nextInt();

        if (ang1+ang2+ang3!=180)
        {
            System.out.println("Error en la entrada");
        }
	}
}