import java.util.Scanner;
public class UD03A046{
    public static void main(String[] args){
        int n;
        Scanner teclado=new Scanner(System.in);
        //boolean hyperpar;
        System.out.println("Introduzca positivo entero: ");
        n=teclado.nextInt();
        
        /*if(n>0){
            while(n>0 && hyperpar){
                int digito=n%10;
                if(digito%2!=0){
                    hyperpar=false;
                }
                n/=10;   
            }   
        }else{
            System.out.println("Error en la entrada");
        }
        */
        if(esHyperpar(n)){//si lo hago por flag se quita el (n)
            if(n>0){
                System.out.println("Es hyperpar");    
            }
            
        }else{
            if(n>0){
                System.out.println("No es hyperpar");   
            }
            
        }
        
    }
    public static boolean esHyperpar(int n){
        boolean hyperpar=true;
        if (n % 2 != 0) {
            hyperpar=false; 
        }
         while (n > 0) {
            int digito = n % 10;
            if (digito % 2 != 0) {
                hyperpar= false; 
            }
            n /= 10;
        }
        return hyperpar;
    }
}