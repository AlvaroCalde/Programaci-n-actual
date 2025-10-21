import java.util.Scanner;
public class UD03A032{
	public static void main(String[] args){
		int ang1,ang2,ang3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un ángulo: ");
        ang1=teclado.nextInt();
        System.out.println("Introduzca un ángulo: ");
        ang2=teclado.nextInt();
        System.out.println("Introduzca un ángulo: ");
        ang3=teclado.nextInt();
        if (ang1+ang2+ang3==180)
        {
            if (ang1==90 || ang2==90 || ang3==90)
            {
                System.out.println("Es un triángulo rectángulo");
            }else{
                if (ang1>90 || ang2>90 || ang3>90)
                {
                    System.out.println("Es un triángulo obtusángulo");
                }else{
                    System.out.println("Es un triángulo acutángulo");
                }
            }
        }
	}
}