import java.util.Scanner;
public class UD03A051{
	public static void main(String[] args){
		int n,i;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca un entero: ");
        n=teclado.nextInt();  
         
        if(n<1 || n>5){
            do{
                System.out.println("Error en la entrada");
                System.out.println("Introduzca un entero: ");
                n=teclado.nextInt(); 
            }while(n>=1 && n<=5);
        }

        for(i=0;i<n;i++){
            System.out.println("HOLA MUNDO");
        }
            
    }
}