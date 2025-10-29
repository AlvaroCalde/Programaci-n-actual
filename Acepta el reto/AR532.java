import java.util.Scanner;
public class AR532{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
        
        for(int i=1;i<=n;i++){
            int a=teclado.nextInt();
            int b=teclado.nextInt();
            System.out.println(b-a);
        }
    }
}