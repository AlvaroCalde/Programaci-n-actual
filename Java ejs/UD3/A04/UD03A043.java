import java.util.Scanner;
public class UD03A043{
	public static void main(String[] args){
		String usuario,contrasena;
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Introduzca usuario: ");
        usuario=teclado.nextLine();  
        System.out.println("Introduzca contraseña: ");
        contrasena=teclado.nextLine(); 
        
        while(!esUsuarioCorrecto(usuario, contrasena)){
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Introduzca usuario: ");
            usuario=teclado.nextLine();  
            System.out.println("Introduzca contraseña: ");
            contrasena=teclado.nextLine(); 
        }
           System.out.println("Bienvenido "+usuario); 
    }

    public static boolean esUsuarioCorrecto(String usuario, String contrasena){
        boolean usuarioCorrecto;
        usuarioCorrecto=usuario.equals("admin") && contrasena.equals("paso");
        return usuarioCorrecto;
    }
}