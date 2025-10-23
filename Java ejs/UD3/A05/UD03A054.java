import java.util.Scanner;
public class UD03A054{
	public static void main(String[] args){
		int n,mayor,i;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca un entero: ");
        n=teclado.nextInt();  
         
        



                
        for(i=n;i<9;i--){
            System.out.println("Introduzca otro entero: ");
            mayor=teclado.nextInt();  
            if(n>mayor){
                mayor=n;
            }else{
                n=mayor;
            }
            System.out.print(mayor);    
        }
        
            
    }
}