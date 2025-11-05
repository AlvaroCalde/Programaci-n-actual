/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.sauces.appbanco;

import java.util.Scanner;

/**
 *
 * @author alvaro.calper
 */
public class AppBanco {

    public static void main(String[] args) {
        int opcion;
        float saldo, cantidad;
        String codigo, titular;
        Scanner teclado = new Scanner(System.in);
        Cuenta cuenta = null;

        opcion = getOpcion();
        while (opcion != 0) {
            if (opcion == 1) {
                if (cuenta == null) {
                    System.out.println("Introduzca código de la cuenta");
                    codigo = teclado.nextLine();
                    System.out.println("Introduzca titular de la cuenta");
                    titular = teclado.nextLine();
                    System.out.println("Introduzca saldo de la cuenta");
                    saldo = teclado.nextFloat();
                    cuenta = new Cuenta(codigo, titular, saldo);
                    System.out.println("Cuenta creada con éxito");
                    System.out.println(cuenta);
                } else {
                    System.out.println("No se puede crear la cuenta");
                }
            } else {
                System.out.println("Introduzca código de cuenta: ");
                codigo = teclado.nextLine();
                if (cuenta != null && codigo.equals(cuenta.getCodigo())) {
                    switch (opcion) {

                        case 2 -> {
                            System.out.print("Introduzca cantidad a ingresar: ");
                            cantidad = teclado.nextFloat();
                            teclado.nextLine();
                            cuenta.ingresar(cantidad);
                            System.out.println("Ingreso realizado con éxito");
                            System.out.printf("saldo= %f\n", cuenta.getSaldo());
                        }
                        case 3 -> {
                            System.out.print("Introduzca cantidad a reintegrar: ");
                            cantidad = teclado.nextFloat();
                            teclado.nextLine();
                            if (cantidad <= cuenta.getSaldo()) {
                                cuenta.reintegrar(cantidad);
                                System.out.println("Reintegro realizado con éxito");
                                System.out.printf("saldo= %f\n", cuenta.getSaldo());
                            } else {
                                System.out.println("No se dispone de saldo suficiente");
                            }
                        }
                        case 4 -> {
                            System.out.printf("Saldo: %f\n", cuenta.getSaldo());
                        }
                        case 5 -> {
                            cuenta = null;
                            System.out.println("Se ha cancelado la cuenta");
                        }
                    }
                } else {
                    System.out.println("No existe una cuenta con ese código");
                }
            }
            opcion=getOpcion();
        }
    }

    private static int getOpcion() {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.-Abrir cuenta");
        System.out.println("2.-Ingresar dinero");
        System.out.println("3.-Retirar dinero");
        System.out.println("4.-Consultar saldo");
        System.out.println("5.-Cancelar cuenta");
        System.out.println("0.-Salir");
        System.out.print("Introduzca opción: ");
        opcion = teclado.nextInt();
        while (opcion <= 0 || opcion > 5) {
            System.out.println("Opcion incorrecta");
            System.out.print("Introduzca opción: ");
            opcion = teclado.nextInt();
        }
        return opcion;
    }
}
