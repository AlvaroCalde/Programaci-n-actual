import java.util.Scanner;
public class UD03A034{
	public static void main(String[] args){
		int mes;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un mes (1-12): ");
        mes=teclado.nextInt();
        if (mes>=1 && mes<=12)
        {
            switch(mes){
                case 1,3,5,7,8,10,12 -> System.out.println("Tiene 31 días");
                case 2 -> System.out.println("Tiene 28 días");
                case 4,6,9,11 -> System.out.println("Tiene 30 días");           
            }
	    }
    }
}