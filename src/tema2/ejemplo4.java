package tema2;

public class ejemplo4 {
    public static void main(String[] args) {
        int humedad = 0, temperatura = 0;
        int estaLloviendoInt = 0;
        boolean estaLloviendo = true;

        humedad = (int) (Math.random() * 100) + 1;
        temperatura = (int) (Math.random() * 100) + 1;
        estaLloviendoInt = (int) (Math.random() * 2) + 1;

        if (estaLloviendoInt == 1) {
            estaLloviendo = true;
            IO.println("esta lloviendo");
        } else {
            estaLloviendo = false;
            IO.println("no esta lloviendo");
        }

        temperatura -= 50;

        IO.println("humedad es = " + humedad);
        IO.println("temperatura es = " + temperatura);

        if (estaLloviendo) {
            IO.println("no regar");
        } else {
            if (humedad < 30) {
                if (temperatura > 30) {
                    IO.println("riego intensivo");
                } else {
                    IO.println("riego normal");
                }
            } else if (humedad < 60) {
                if (temperatura > 35) {
                    IO.println("riego normal");
                } else {
                    IO.println("riego ligero");
                }
            } else {
                IO.println("no regar");
            }
        }

    }

}
