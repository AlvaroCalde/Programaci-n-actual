import java.util.Scanner;
public class UD03A027{
	public static void main(String[] args){
		int anyo;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca año: ");
        anyo=teclado.nextInt();
        if (anyo%400==0 || anyo%4==0 && anyo%100!=0)
        {
            System.out.println("Es año bisiesto");
        }else{
            System.out.println("No es año bisiesto");
        }
	}
}