import java.util.Scanner;
public class UD03A037{
	public static void main(String[] args){
		float nota;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca nota: ");
        nota=teclado.nextFloat();

        if (nota>=0 && nota<=4)
        {
            System.out.println("Suspenso");
        }else{
            if (nota>=5 && nota <=6)
            {
                System.out.println("Aprobado");
            }else{
                if (nota>=7 && nota <=8)
                {
                    System.out.println("Notable");
                }else{
                    System.out.println("Sobresaliente");
                }
            }
        }
	}
}