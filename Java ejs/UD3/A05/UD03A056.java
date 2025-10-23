import java.util.Scanner;
public class UD03A056{
    public static void main(String[] args){
        int n,i;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        n=teclado.nextInt();

        while (n<=0){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca entero: ");
            n=teclado.nextInt();
        }

        System.out.printf("Números impares entre 1 y %d : ",n);
        
        for(i=1;i<n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        
    }
}