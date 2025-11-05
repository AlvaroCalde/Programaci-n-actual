import java.util.Scanner;
public class UD03A067{
    public static void main(String[] args){
        int i,j,filas;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca filas: (2-10)");
        filas=teclado.nextInt();

        while(filas<2 && filas>10){
            System.out.println("Error en la entrada");
            System.out.print("Introduzca filas: (2-10)");
            filas=teclado.nextInt();
        }

        for(i=1;i<=filas;i++){
            for(j=filas;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}