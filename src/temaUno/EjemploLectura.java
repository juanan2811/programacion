package temaUno;

import java.util.Scanner;

public class EjemploLectura {
    public static void main(String[] args) {

        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        Scanner sc = new Scanner(System.in);

        IO.println("dime tu nombre: ");
        nombre = sc.nextLine();

        IO.println("dime tus apellidos : ");
        apellidos = sc.nextLine();

        IO.println("dime tu edad: ");

        // edad = sc.nextInt();
        // sc.nextLine();

        IO.println("dime tu telefono: ");
        numTelefono = sc.nextLine();

        IO.println("dime tu codigo postal: ");
        codigoPostal = sc.nextLine();

    }

}
