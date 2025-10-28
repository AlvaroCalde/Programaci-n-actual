import java.util.Scanner;
public class UD03A066{
    public static void main(String[] args){
        int i,j,filas;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca filas: (2-10)");
        filas=teclado.nextInt();

        for(i=0;i<=filas-1;i++){
            for(j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}