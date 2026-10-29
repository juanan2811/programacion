package tema2.bucles;

public class ejecicioTablaDeMultiplicar {
    static void main() {

        int numeroTeclado = 0;

        numeroTeclado = Integer.parseInt(IO.readln("dime el numero del que deaseas saber la tabla de multiplicar "));

        for (int i = 1 ; i <= 10 ; i++){
            IO.println(numeroTeclado + " x " + i + " = " + (numeroTeclado * i));
        }
    }
}
