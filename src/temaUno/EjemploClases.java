package temaUno;

public record EjemploClases() {
    public static final double IVA_GENERAL = 0.21;
    public static final int NUM_INTENTOS = 5;

    public static void main(String[] args) {
        double precio = 125.99;
        double precioConIva = 0.0;

        precioConIva = precio + (precio * IVA_GENERAL);

        IO.println("");

    }
}
