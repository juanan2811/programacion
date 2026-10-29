package tema2.bucles;

public class ejerciciobucles {
    static void main() {

        int contador = 0;
        int numeroTeclado = 0;

        numeroTeclado = Integer.parseInt(IO.readln("dime un numero "));

        while (numeroTeclado != 0){
            numeroTeclado = numeroTeclado /10;
            contador++;
        }
        IO.println("tiene estos digitos " + contador);
    }
}
