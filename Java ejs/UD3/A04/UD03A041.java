import java.util.Scanner;
public class UD03A041{
	public static void main(String[] args){
		int n;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca un entero: ");
        n=teclado.nextInt();  
         
        while (n>0){
          
            if (n%2==0)
            {
                System.out.println("PAR");
            }else{
                System.out.println("IMPAR");
            }
          
        }
            
    }
}