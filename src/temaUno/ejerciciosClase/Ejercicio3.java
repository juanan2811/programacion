package temaUno.ejerciciosClase;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 55;
        int cambio = 0;

        cambio = numero1;

        numero1 = numero2;

        numero2 = cambio;

        IO.println("numero1" + numero1);
        IO.println("numero2" + numero2);

    }

}
