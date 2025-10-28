import java.util.Scanner;
public class UD03A065{
    public static void main(String[] args){
        int i,j,filas,columnas;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca filas: ");
        filas=teclado.nextInt();
        System.out.print("Introduzca columnas: ");
        columnas=teclado.nextInt();

        while(filas<2 && filas>10 && columnas<2 && columnas>10){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca filas: ");
            filas=teclado.nextInt();
            System.out.println("Introduzca columnas: ");
            columnas=teclado.nextInt();
        }
        
        for(i=1;i<=filas;i++){
            for(j=1;j<=columnas;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}