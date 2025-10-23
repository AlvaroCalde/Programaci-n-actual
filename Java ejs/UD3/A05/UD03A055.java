import java.util.Scanner;
public class UD03A055{
	public static void main(String[] args){
		int n,i;
        boolean hay5=false;
        Scanner teclado=new Scanner(System.in); 
                
        for(i=1;i<9;i++){
            System.out.println("Introduzca un entero: ");
            n=teclado.nextInt();  
            if(n==5){
                hay5=true;
            }   
        }

        
        if(hay5){
                System.out.println("Has introducido 5");
            }else{
                System.out.println("No has introducido 5");
            }
            
    }
}