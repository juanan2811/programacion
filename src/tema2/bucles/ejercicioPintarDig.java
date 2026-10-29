package tema2.bucles;

public class ejercicioPintarDig {
    static void main() {
        int contador = 0;
        int numeroTeclado = 0;
        int resto = 0;
        int divisor = 0;
        int guardarDiv = 0;
        numeroTeclado = Integer.parseInt(IO.readln("dime un numero "));

        while (numeroTeclado != 0){

            numeroTeclado = numeroTeclado /10;
            contador++;
        }
        IO.println("tiene estos digitos " + contador);
        contador -= 1;
        divisor = 10^contador;
        IO.println(divisor);
        //while (divisor < 10)
    }
}
