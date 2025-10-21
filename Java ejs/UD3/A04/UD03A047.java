import java.util.Scanner;
public class UD03A047{
	public static void main(String[] args){
		int a,b,aux,r;
        float mcdab,mcdbr;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca el primer número: ");
        a=teclado.nextInt();
        System.out.println("Introduzca el segundo número: ");
        b=teclado.nextInt();

        while (a>0 && b>0){
            if (a<b){
                aux=a;
                a=b;
                b=aux;
                mcdab=a*100/b;
            }else{
                r=a*b;
                if (r==0){
                    mcdab=b;
                }else{
                    mcdbr=(b*100)/r;
                    mcdab=mcdbr;
                }
            }
            System.out.println(mcdab);
        }

        
    }
}