import java.util.Scanner;
public class UD03A058{
    public static void main(String[] args){
        int n,i;
        boolean primo=true;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        n=teclado.nextInt();

        while (n<=0){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca entero: ");
            n=teclado.nextInt();
        }
        
        for(i=2;i<n/2 && primo;i++){
            if(n%i==0){
                primo=false;
                i=n;
            }
        }

        if(primo && n>1){//n>1 porque el 1 es una excepción(no es primo)
            System.out.printf("%d es primo",n);
        }else{
            System.out.printf("%d no es primo",n);
        }
        
    }
}