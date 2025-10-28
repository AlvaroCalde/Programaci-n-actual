import java.util.Scanner;
public class UD03A064{
    public static void main(String[] args){
        int n,i,j,contadorPrimos=0;
        boolean primo=true;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        n=teclado.nextInt();

        while (n<=0){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca entero: ");
            n=teclado.nextInt();
        }

        for(j=2;j<=n;j++){
           for(i=2;i<n/2 && primo;i++){
                if(j%i==0){
                    primo=false;
                    i=j;
                }
            }

            if(primo){//n>1 porque el 1 es una excepción(no es primo)
                System.out.println(j);
                contadorPrimos+=1;
            }
        }
        System.out.println("Número de primos: "+contadorPrimos);
        
        
    }
}