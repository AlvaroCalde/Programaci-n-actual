import java.util.Scanner;
public class UD03A016{
	public static void main(String[] args){
		float nota;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca nota: ");
        nota=teclado.nextFloat();
        if (nota>=0 && nota<=10)
        {
            System.out.println("Calificación correcta");
        }
	}
}