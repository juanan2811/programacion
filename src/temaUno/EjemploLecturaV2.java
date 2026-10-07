package temaUno;

public class EjemploLecturaV2 {

    public static void main(String[] args) {

        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        nombre = IO.readln("dime tu nombre: ");

        apellidos = IO.readln("dime tus apelldos: ");

        direccion = IO.readln("dime tu direccion: ");

        edad = Integer.parseInt(IO.readln("dime tu edad: "));
        // edad = sc.nextInt();
        // sc.nextLine();

        numTelefono = IO.readln("dime tu numero: ");

        codigoPostal = IO.readln("dime tu codigo postal: ");

        IO.println("-------------------------------------------");

        IO.println("Nombre " + nombre);

        IO.println("Apellidos " + apellidos);

        IO.println("direccion " + direccion);

        IO.println("edad " + edad);

        IO.println("numero " + numTelefono);

        IO.println("codigo postal " + codigoPostal);

    }

}
