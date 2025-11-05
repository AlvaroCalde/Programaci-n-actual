/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.sauces.appagenda;
import java.util.Scanner;
/**
 *
 * @author alvaro.calper
 */
public class AppAgenda {

    public static void main(String[] args) {
        Contacto contacto=null;
        Scanner teclado=new Scanner(System.in);
        String nombre,telefono,email;
        int opcion;
        do{
            System.out.println("1.- Crear contacto");
            System.out.println("2.- Consultar contacto");
            System.out.println("3.- Modificar contacto");
            System.out.println("4.- Eliminar contacto");
            System.out.println("0.- Salir contacto");
            System.out.print("Introduzca opcion: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1 ->{
                    if(contacto==null){
                        System.out.println("Introduzca nombre del contacto");
                        nombre=teclado.nextLine();
                        System.out.println("Introduzca telefono del contacto");
                        telefono=teclado.nextLine();
                        System.out.println("Introduzca email del contacto");
                        email=teclado.nextLine();
                        contacto=new Contacto(nombre,telefono,email);
                        System.out.println("Contacto creado");
                        System.out.println(contacto);
                    }else{
                        System.out.println("No se puede crear el contacto");
                    }
                }
                case 2 ->{
                    System.out.println("Introduzca el nombre del contacto: ");
                    nombre=teclado.nextLine();
                    if(contacto!=null && nombre.equals(contacto.getNombre())){
                        System.out.println(contacto);
                    }else{
                        System.out.println("No existe un contacto con ese nombre");
                    }
                }
                case 3 ->{
                    System.out.println("Introduzca el nombre del contacto: ");
                    nombre=teclado.nextLine();
                    if(contacto!=null && nombre.equals(contacto.getNombre())){
                        System.out.println("Introduzca nuevo teléfono");
                        telefono=teclado.nextLine();
                        System.out.println("Introduzca nuevo email");
                        email=teclado.nextLine();
                        
                        contacto.setTelefono(telefono);
                        contacto.setEmail(email);
                        
                        System.out.println("Contacto modificado");
                        System.out.println(contacto);
                    }else{
                        System.out.println("No existe un contacto con ese nombre");
                    }
                }
                case 4 ->{
                    System.out.println("Introduzca el nombre del contacto: ");
                    nombre=teclado.nextLine();
                    if(contacto!=null && nombre.equals(contacto.getNombre())){
                        contacto=null;
                        System.out.println("Contacto eliminado");
                    }else{
                        System.out.println("No existe un contacto con ese nombre");
                    }
                }
                case 0 ->{
                    System.out.println("BYE");
                }
                default ->{
                    System.out.println("Error en la entrada");
                }
            }
        }while(opcion!=0);
    }
}
