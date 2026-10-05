package temaUno;

public class EjercicioPaCasa3 {
    public static void main(String[] args) {

        int edad = 11;
        double altura = 160;

        boolean dragon = false;
        boolean miniMini = false;

        dragon = edad >= 12 && altura >= 140;

        if (dragon == true) {
            IO.println("Si puede entrar al dragon");
        } else {
            IO.println("No puede entrar al dragon");
        }

        miniMini = edad < 12 || altura < 140;

        if (miniMini == true) {
            IO.println("Si puede entrar al mini mini");
        } else {
            IO.println("No puede entrar al mini mini");
        }
    }

}
