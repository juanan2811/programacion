package tema2.metodos;

public class ejerciciocalse2 {
    /**
     * Haz un ejercicio que muestre un menú con estas opciones:
     * 1. Es par
     * 2. Máximo de tres números
     * 3. Es primo
     * 4. Mostrar tabla multiplicar
     * 5. Salir
     */

    /**
     * Pinta las opciones del menú
     */
    static void pintarOpciones() {
        IO.println("1. Es par");
        IO.println("2. Máximo de tres números");
        IO.println("3. Es primo");
        IO.println("4. Tabla de multiplicar");
        IO.println("5. Salir");

    }
    //par
    static boolean numeroPar(int numPar){
        if (numPar % 2 == 0){
            return true;
        }
        else {
            return false;
        }

    }
    //maximo

    static int numeroMaximo (int a, int b){
        if (a>b){
            return a;
        }
        else if (b>a){
            return b;
        }
        else {
            return b;
        }
    }
    static boolean numeroPrimo (int numPrimo){

        for(int i=2; i < numPrimo; i++) {
            if (numPrimo % i == 0) {
                return false;
                //break;
            }
        }
        return true;
    }
    //tabla de multiplicar

    static void tablaMultiplicar(int numTabla ){
        for(int i=1; i <= 10; i++) {
            IO.println(numTabla + " x " + i + " = " + (numTabla * i));
        }
    }

    static void main() {

        int opcion = Integer.MIN_VALUE;
        int numero;
        int n1, n2, n3;

        do {
            pintarOpciones();
            opcion = Integer.parseInt(IO.readln("Dime una opción: "));

            switch (opcion) {
                case 1 -> {
                    IO.println("--- ES PAR ---");
                    numero = Integer.parseInt(IO.readln("Dime un número"));
                    if (numeroPar(numero)){
                        IO.println("es par");
                    }else{
                        IO.println("no es par");
                    }
                }
                case 2 -> {
                    IO.println("--- MÁXIMO ---");

                    n1 = Integer.parseInt(IO.readln("Dame el primer numero"));
                    n2 = Integer.parseInt(IO.readln("Dame el segundo numero"));
                    n3 = Integer.parseInt(IO.readln("Dame el tercer numero"));

                    numero = numeroMaximo(n1,n2);
                    numero = numeroMaximo(numero,n3);

                    IO.println("El mas grande es " + numero);
                }
                case 3 -> {
                    IO.println("--- PRIMO ---");
                    numero = Integer.parseInt(IO.readln("Dime un número"));
                    if (numeroPrimo(numero)){
                        IO.println(numero + "es primo");
                    }else{
                        IO.println(numero + "no es primo");
                    }
                }
                case 4 -> {
                    IO.println("--- TABLA ---");
                    numero = Integer.parseInt(IO.readln("Dime un número"));
                    tablaMultiplicar(numero);
                }
                case 5 -> {
                    IO.println("--- FACTORIAL ---");
                    numero = Integer.parseInt(IO.readln("Dime un número"));

                }
                case 6 -> {

                }
                case 7 -> {
                    IO.println("Hasta pronto");
                }
                default -> IO.println("Opción incorrecta");
            }

        } while (opcion != 7);
    }
}
