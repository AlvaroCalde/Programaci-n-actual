/*Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado el día, el mes y el año de una fecha y
 muestre por pantalla un mensaje indicando si la fecha es correcta o incorrecta.*/
import java.util.Scanner;
public class UD03A035 {
    public static void main(String[] args){
        Scanner teclado=new Scanner (System.in);
        int dia,mes,anyo;

        System.out.println("Introduzca el número del dia: ");
        dia=teclado.nextInt();
        System.out.println("Introduzca el número del mes: ");
        mes=teclado.nextInt();
        System.out.println("Introduzca el número del anyo: ");
        anyo=teclado.nextInt();

        if (esFechaCorrecta(dia,mes,anyo))
        {
            System.out.println("Fecha correcta");
        }else{
            System.out.println("Fecha incorrecta");
        }
        
    }

    private static int getDiasMes(int mes,int anyo){

        int diasMes;

        diasMes=switch(mes){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> esBisiesto(anyo)?29:28;
            case 4,6,9,11 -> 30;
            default -> 0;         
        };

        return diasMes;
    }

    private static boolean esBisiesto(int anyo){
        return (anyo%400==0 || (anyo%4==0 && anyo%100!=0));
    }

    private static boolean esFechaCorrecta(int dia,int mes, int anyo){
        return (anyo>0 && mes >=1 && mes <=12 && dia>=1 && dia<=getDiasMes(mes,anyo));
    }

}
