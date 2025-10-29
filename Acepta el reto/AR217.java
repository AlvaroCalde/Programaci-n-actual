import java.util.Scanner;
public class AR217{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
        
        while(n!=0){
            if(n%2==0){
                System.out.println("DERECHA");
            }else{
                System.out.println("IZQUIERDA");
            }
            n=teclado.nextInt();
        }
    }
}