import java.util.Scanner;
public class UD03A045{
	public static void main(String[] args){
		int n,contador=0, contadorP=0,contadorNeg=0,contadorNul=0;
        float acumulador=0;
        Scanner teclado=new Scanner(System.in); 

        do{
            System.out.println("Introduzca un entero: ");
            n=teclado.nextInt(); 
            contador++;
            acumulador+=n;
            if(n>0){
                contadorP+=1;
            }else{
                if(n<1){
                    contadorNeg+=1;
                }else{
                    contadorNul+=1;
                }
            }
        }while(acumulador>100);

        System.out.println("Números positivos: "+ contadorP);
        System.out.println("Números negativos: "+ contadorNeg);
        System.out.println("Números nulos: "+ contadorNul);
        System.out.println("Suma: "+ acumulador);
        System.out.println("Media: "+ (acumulador/contador));
    }
}