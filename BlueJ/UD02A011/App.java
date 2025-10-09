import java.util.Scanner;

public class App
{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Rectangulo rectangulo1,rectangulo2;
        float alto,ancho;
        System.out.println("Introduzca alto rectángulo 1");
        alto=teclado.nextFloat();
        System.out.println("Introduzca ancho rectángulo 1");
        ancho=teclado.nextFloat();
        rectangulo1=new Rectangulo(ancho,alto);
        
        System.out.println("Introduzca alto rectángulo 2");
        alto=teclado.nextFloat();
        System.out.println("Introduzca ancho rectángulo 2");
        ancho=teclado.nextFloat();
        rectangulo2=new Rectangulo(ancho,alto);
        
        System.out.printf("Área 1=%f,%n",rectangulo1.calcularArea());
        System.out.printf("Perímetro 1=%f,%n",rectangulo1.calcularPerimetro());
        
        System.out.printf("Área 2=%f,%n",rectangulo2.calcularArea());
        System.out.printf("Perímetro 2=%f,%n",rectangulo2.calcularPerimetro());
    }
}
