import java.util.Scanner;
public class AR369{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
        
        while(n!=0){
            for(int i=1;i<=n;i++){
                System.out.print("1");
            }
            System.out.println("");
            n=teclado.nextInt();
        }
    }
}