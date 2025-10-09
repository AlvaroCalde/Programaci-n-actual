
/**
 * Write a description of class app here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class App
{
    public static void main(String[] args){
        Cuenta cuenta1, cuenta2;
        
        cuenta1=new Cuenta("a","a",100);
        
        cuenta2=cuenta1;
        
        cuenta1.ingresar(10);
        cuenta2.reintegrar(20);
        
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
    }
}
