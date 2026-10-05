package temaUno;

public record EjemploEnumerados() {
    public static void main(String[] args) {

        enum Asignaturas {
            PROGRAMACION, SI, BDD, LDM, EDD
        }

        Asignaturas miPreferida = Asignaturas.BDD;

        IO.println(Asignaturas.PROGRAMACION);
        IO.println("MI asignatura prefe es " + miPreferida);
    }

}
