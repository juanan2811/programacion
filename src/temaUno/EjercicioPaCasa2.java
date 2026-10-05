package temaUno;

public record EjercicioPaCasa2() {
    public static void main(String[] args) {
        double radioBalonDeFutbol = 0.0;
        double radioBalonDeBaloncesto = 0.0;
        double volumenDeBalonDeFutbol = 0.0;
        double volumenDeBalonDeBaloncesto = 0.0;
        double volumenMaximo = 0.0;

        radioBalonDeFutbol = 11.0;
        radioBalonDeBaloncesto = 12.0;

        volumenDeBalonDeFutbol = (4.0 / 3.0) * Math.PI * Math.pow(radioBalonDeFutbol, 3);
        volumenDeBalonDeBaloncesto = (4.0 / 3.0) * Math.PI * Math.pow(radioBalonDeBaloncesto, 3);

        IO.println("el volumen del balon de futbol es :" + volumenDeBalonDeFutbol);
        IO.println("el volumen del balon de baloncesto es :" + volumenDeBalonDeBaloncesto);

        volumenMaximo = Math.max(volumenDeBalonDeFutbol, volumenDeBalonDeBaloncesto);

        IO.println("el volumen mayo de los dos es : " + volumenMaximo);

        if (volumenDeBalonDeBaloncesto > volumenDeBalonDeFutbol) {
            IO.println("el balon de baloncest es mas grande que el de futbol que es " + volumenMaximo);
        }

    }

}
