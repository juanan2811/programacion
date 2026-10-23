package temaUno.ejerciciosClase;

public class ejricio11 {
    public static void main(String[] args) {

        int numero = 0;
        int decenas = 0, unidades = 0;
        int numeroNuevo = 0;

        numero = Integer.parseInt(IO.readln("dame tu numero de 2 cifras "));

        decenas = numero / 10;
        unidades = numero % 10;
        numeroNuevo = (unidades * 10) + decenas;

        IO.println("el numeo es : " + numero + " las decenas son : " + decenas + " las unidades son : " + unidades
                + " el nuevo numero es : " + numeroNuevo);

    }

}
