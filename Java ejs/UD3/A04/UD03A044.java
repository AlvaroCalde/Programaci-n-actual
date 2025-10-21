import java.util.Scanner;
public class UD03A044{
	public static void main(String[] args){
		int n,contador=0,acumulador=0;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca un entero: ");
        n=teclado.nextInt();  
         
        while (n>=1 && n<=10){
            contador++;
            acumulador+=n;
            System.out.println("Introduzca un entero: ");
            n=teclado.nextInt(); 
        }

        if(contador>0){
            System.out.println("Media: " + (acumulador/contador));
        }
            
    }
}