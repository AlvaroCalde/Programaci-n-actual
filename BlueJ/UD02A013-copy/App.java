import java.util.Scanner;
public class App
{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Hora hora1,hora2;
        int horas,minutos,segundos,segundosExtra;
        System.out.println("Introduzca horas hora 1");
        horas=teclado.nextInt();
        System.out.println("Introduzca minutos hora 1");
        minutos=teclado.nextInt();
        System.out.println("Introduzca segundos hora 1");
        segundos=teclado.nextInt();
        hora1=new Hora(horas,minutos,segundos);
        
        System.out.println("Introduzca horas hora 2");
        horas=teclado.nextInt();
        System.out.println("Introduzca minutos hora 2");
        minutos=teclado.nextInt();
        System.out.println("Introduzca segundos hora 2");
        segundos=teclado.nextInt();
        hora2=new Hora(horas,minutos,segundos);
        
        System.out.println("Hora1: "+ hora1.toString());
        System.out.println("Hora2: "+ hora2.toString());
        
        System.out.println("Segundos de hora1: "+ hora1.convertirASegundos());
        System.out.println("Segundos de hora2: "+ hora2.convertirASegundos());
        
        System.out.println("Comparación de hora1 con hora2: "+ hora1.compareTo(hora2));
        System.out.println("Comparación de hora2 con hora1: "+ hora2.compareTo(hora1));
        
        System.out.println("Introduzca segundos a añadir");
        segundosExtra=teclado.nextInt();
        
        System.out.println("Hora1 con segundos añadidos: "+ hora1.sumarSegundos(segundosExtra).toString());
        System.out.println("Hora2 con segundos añadidos: "+ hora2.sumarSegundos(segundosExtra).toString());
    }
}
