import java.util.Scanner;
public class UD03A026{
	public static void main(String[] args){
		int h,m,s;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca horas: ");
        h=teclado.nextInt();
        System.out.println("Introduzca minutos: ");
        m=teclado.nextInt();
        System.out.println("Introduzca segundos: ");
        s=teclado.nextInt();
        if (h>=0 && h>24 && m>=0 && m<=59 && s>=0 && s<=59)
        {
            System.out.println("Hora correcta");
        }else{
            System.out.println("Hora incorrecta");
        }
	}
}