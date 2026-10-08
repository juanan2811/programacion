package temaUno.ejerciciosClase;

public class Ejercicio1 {
    public static void main(String[] args) {
        double notaExamenMitad, notaExamenFinal, practicas, evFormativa;
        double resultado;

        notaExamenMitad = Double.parseDouble(IO.readln("dime tu nota del examen de mitad de la evaluacion : "));
        notaExamenFinal = Double.parseDouble(IO.readln("dime tu nota del examen final : "));
        practicas = Double.parseDouble(IO.readln("dime tu nota de las practicas : "));
        evFormativa = Double.parseDouble(IO.readln("dime tu nota de la evaluacion formativa : "));

        notaExamenMitad = notaExamenMitad * 0.30;
        IO.println("tu nota de la mitad es " + notaExamenMitad);
        notaExamenFinal = notaExamenFinal * 0.30;
        IO.println("tu nota del examen final es " + notaExamenFinal);
        practicas = practicas * 0.25;
        IO.println("tu nota de la practica es " + practicas);
        evFormativa = evFormativa * 0.15;
        IO.println("tu nota de la ev formativa es " + evFormativa);

        resultado = notaExamenFinal + notaExamenMitad + practicas + evFormativa;
        IO.println("ti nota es:" + resultado);

    }

}
