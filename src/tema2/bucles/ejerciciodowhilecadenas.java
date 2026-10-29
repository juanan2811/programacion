package tema2.bucles;

import java.util.Locale;
import java.util.Scanner;

public class ejerciciodowhilecadenas {
    public static  void main(String[] args) {
        int intentos =0 ;

        String usuarioBD = "javgui709";
        String usuarioTeclado;

        String contrasenaBD = "69696969";
        String contrasenaTeclado;

        boolean accesoConcedido = false;
        do{
            IO.println("intento numero " + intentos);

            intentos = intentos + 1;

            usuarioTeclado = IO.readln("dime tu usuario : ").toLowerCase();
            contrasenaTeclado = IO.readln("dime tu contraseña : ");

            if(usuarioTeclado.equals(usuarioBD) && contrasenaTeclado.equals(contrasenaBD)){

                accesoConcedido = true;

            }else {

                IO.println("te has equibocado o en la contraseña o en el usuario");

            }
        }while(intentos < 3 &&  accesoConcedido == false );
        if(accesoConcedido == true){
            IO.println("has entradao enhorabuena");
        }else {
            IO.println("has gastado los intentos");
        }
    }
}
