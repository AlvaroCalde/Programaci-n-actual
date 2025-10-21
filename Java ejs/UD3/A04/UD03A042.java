import java.util.Scanner;

public class UD03A042{
	public static void main(String[] args){
		int h, min ,seg;
        Scanner teclado=new Scanner(System.in); 
         


        do{
            System.out.println("Introduzca horas: ");
            h=teclado.nextInt();
            System.out.println("Introduzca minutos: ");
            min=teclado.nextInt();  
            System.out.println("Introduzca segundos: ");
            seg=teclado.nextInt(); 
        }while(esHoraCorrecta(h,min,seg));

       
    
    }  

    public static boolean esHoraCorrecta(int h,int min, int seg){
        boolean horaCorrecta; 
        horaCorrecta= h>=0 && h<=23 && min>=0 && min<=59 && seg>=0 && seg<=59;
        return horaCorrecta;
    }   
}
    