package temaUno.ejerciciosClase;

public class Ejercicio5 {
    public static void main(String[] args) {
        double av, ve, m0, mf, cuartentaporcieno, kmh;
        boolean llegaOrbita;

        ve = 11000.0;
        m0 = 5000000.0;
        mf = 1500000.0;

        cuartentaporcieno = (m0 * 0.4);
        av = ve * Math.log(m0 / mf);

        IO.println("el av es = " + av);
        IO.println("el cuarente porciento es = " + cuartentaporcieno);

        llegaOrbita = (av >= 9000.0) && (mf <= cuartentaporcieno);
        IO.println("llega a orbita = " + llegaOrbita);

        kmh = ve * 3.6;

        IO.println("los kmh son = " + kmh);

    }

}
