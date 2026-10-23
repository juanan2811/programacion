package tema2;

public class ejercicioclase2 {
    public static void main(String[] args) {
        /*
         * 
         * La clase de Programación se va el lunes de viaje a la Estación Experimental
         * Queremos saber cuánto cuesta el viaje
         * - Si van más de 30 alumnos el viaje cuesta 5€ por alumno
         * - Si van entre 15 y 30 alumnos el viaje cuesta 8€ por alumno
         * - Si van menos de 15 alumnos el viaje cuesta 1000€
         * 
         * Pide por teclado cuántos alumnos van y calcula cuánto cuesta el bus
         * 
         */
        int numAlum = Integer.parseInt(IO.readln("dame el numero de mes :"));
        int costeViaje;

        if (numAlum > 30) {
            IO.println("van " + numAlum);
            costeViaje = 5;
            costeViaje = costeViaje * numAlum;
            IO.println("vale 5 por cabeza y " + costeViaje + " en total");
        } else if (numAlum >= 15) {
            IO.println("van " + numAlum);
            costeViaje = 8;
            costeViaje = costeViaje * numAlum;
            IO.println("vale 8 por cabeza y " + costeViaje + " en total");
        } else if (numAlum >= 1) {
            IO.println("van " + numAlum);
            costeViaje = 1000;
            IO.println("cuesta en total " + costeViaje);
            costeViaje = costeViaje / numAlum;
            IO.println("a cada uno le custa " + costeViaje);
        } else {
            IO.println("no seas tan listo no pngas que hay menos alumno");
        }
    }
}
