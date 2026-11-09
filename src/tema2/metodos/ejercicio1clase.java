package tema2.metodos;

public class ejercicio1clase {
    /**
     * devuelve si es multiplo
     * @param numA
     * @param numB
     * @return
     */
    public static boolean multiplo (int numA, int numB){
        if (numA % numB == 0){
            return true;
        } else if (numB % numA == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    static void main() {

        boolean esMultiplo = multiplo(Integer.parseInt(IO.readln("dime el primer numero ")), Integer.parseInt(IO.readln("dime el segundo numero ")));

        IO.println("multiplo? = " + esMultiplo);
    }
}
