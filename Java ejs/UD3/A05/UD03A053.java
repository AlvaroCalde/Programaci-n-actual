import java.util.Scanner;
public class UD03A053{
	public static void main(String[] args){
		int n,i;
        float acumulador;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca un entero: ");
        n=teclado.nextInt();  
         
        
        while(n<1 || n>10){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca un entero: ");
            n=teclado.nextInt(); 
        }

        acumulador=1;

        System.out.print(n+"!= ");
                
        for(i=n;i>1;i--){
            acumulador*=i;
            System.out.print(i+"*");
        }
        System.out.print("1* = "+acumulador);
            
    }
}