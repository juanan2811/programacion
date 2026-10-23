package tema2;

public class ejemplo8 {
    public static void main(String[] args) {
        enum DiasSemana {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }
        DiasSemana diasSemana;

        IO.println("Dime el dia de la semana ");

        String dias = IO.readln();

        diasSemana = DiasSemana.valueOf(dias.toUpperCase());

        switch (diasSemana) { // .toUpperCase() convierte un String a mayúsculas
            case LUNES, MARTES, MIERCOLES, JUEVES -> IO.println("hoy tengo programacion con javi!!!!");
            case VIERNES -> IO.println("hoy no tengo programacion con javi");
            case SABADO, DOMINGO -> IO.println("no hay claseeee yujuuu");
            default -> IO.println("No se que dia es ese listo no pongass tildes ni inventes dias");
        }

    }
}
