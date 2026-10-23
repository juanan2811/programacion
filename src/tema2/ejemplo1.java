package tema2;

public class ejemplo1 {
    public static void main(String[] args) {
        int nota = 0;

        nota = Integer.parseInt(IO.readln("dame la nota"));

        if (nota >= 5) {

            IO.println("es aprobado");

        } else {
            IO.println("es negativo");
        }
    }

}
