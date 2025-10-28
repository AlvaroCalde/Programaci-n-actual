import java.util.Scanner;
public class UD03A063{
    public static void main(String[] args){
        int n,acumulador,i,digito=0,peso;
        Scanner teclado=new Scanner(System.in);
        
        for(i=1;i<=4;i++){
            peso=1;
            acumulador=0;
            System.out.println("Introduzca binario de 3 cifras: ");
            n=teclado.nextInt();
            while(n!=0){
                digito%=10;
                acumulador+=(digito*peso);
                peso*=2;
                n/=10;
            }
        }
    }
}