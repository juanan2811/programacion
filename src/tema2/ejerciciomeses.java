package tema2;

public class ejerciciomeses {
    public static void main(String[] args) {
        int mes = Integer.parseInt(IO.readln("dame el numero de mes :"));
        int dia = Integer.parseInt(IO.readln("dame el dia :"));

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    IO.println("fecha correcta!!");
                } else {
                    IO.println("fecha incorrecta!!");
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    IO.println("fecha correcta!!");
                } else {
                    IO.println("fecha incorrecta!!");
                }
            }
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    IO.println("fecha correcta!!");
                } else {
                    IO.println("fecha incorrecta!!");
                }
            }
            default -> IO.println("no te inventes meses chaval");

        }
    }
}
