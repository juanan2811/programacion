package temaUno;

public record EjercicioPaCasa1() {
    public static void main(String[] args) {
        double cateto1 = 0.0;
        double cateto2 = 0.0;
        double hipotenusa = 0.0;
        double hipotenusa2 = 0.0;
        cateto1 = 3.5;
        cateto2 = 2.3;

        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        hipotenusa2 = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        IO.println("el cateto 1 es " + cateto1);
        IO.println("el cateto 2 es " + cateto2);
        IO.println("la hipotenusa es : " + hipotenusa);
        IO.println("la hipotenusa 2 es :" + hipotenusa2);

    }

}
