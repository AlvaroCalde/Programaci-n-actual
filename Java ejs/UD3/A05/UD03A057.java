import java.util.Scanner;
public class UD03A057{
    public static void main(String[] args){
        int n,acumulador,i;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        n=teclado.nextInt();

        while(n<=0){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca entero: ");
            n=teclado.nextInt();  
        }

        acumulador=0;
        for(i=1;i<n/2;i++){
            if(n%i==0){
                acumulador+=i;
            }
        }

        if(acumulador==n){
            System.out.printf("%d es un numero perfecto",n);
        }else{
            System.out.printf("%d no es un numero perfecto",n);
        }
    }
}