package temaUno.ejerciciosClase;

public class Ejercicio2 {
    public static void main(String[] args) {
        double precio = 0.0;
        double IVA = 0.21;
        double precioNuevo = 0.0;

        precio = Double.parseDouble(IO.readln("dime el precio sin iva del producto y sin el simbolo de euro : "));
        IO.println("el precio sin iva es : " + precio);

        precioNuevo = precio + (precio * IVA);
        IO.println("precio con iva es : " + precioNuevo);
    }

}
