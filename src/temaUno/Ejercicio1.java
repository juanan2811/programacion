package temaUno;

public record Ejercicio1() {
    public static final double IVA = 0.21;

    public static void main(String[] args) {
        double precioSinIVA;
        double precioConIVA;
        double descuentoPlanAuto;
        double descuentoExtra;
        double resultado;

        precioSinIVA = 40000;
        descuentoPlanAuto = 3500.0;
        descuentoExtra = 1500.0;

        precioConIVA = precioSinIVA + (precioSinIVA * IVA);

        IO.println("el precio con iva es:" + precioConIVA);

        descuentoPlanAuto = 3500.0;
        descuentoExtra = 1500.0;
        resultado = precioConIVA - (descuentoPlanAuto + descuentoExtra);

        IO.println("lo que tienes que pagar es :" + resultado);

    }

}
