
import java.util.Scanner;
public class App
{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Fecha fecha1,fecha2;
        int anyo,mes,dia;
        
        System.out.println("Introduzca año fecha 1");
        anyo=teclado.nextInt();
        System.out.println("Introduzca mes fecha 1");
        mes=teclado.nextInt();
        System.out.println("Introduzca dia fecha 1");
        dia=teclado.nextInt();
        fecha1=new Fecha(anyo,mes,dia);
        
        System.out.println("Introduzca año fecha 2");
        anyo=teclado.nextInt();
        System.out.println("Introduzca mes fecha 2");
        mes=teclado.nextInt();
        System.out.println("Introduzca dia fecha 2");
        dia=teclado.nextInt();
        fecha2=new Fecha(anyo,mes,dia);
        
        System.out.println("Fecha1: "+ fecha1.toString());
        System.out.println("Fecha2: "+ fecha2.toString());
    }
}
