package tema2.EJERCICIOSPRACTICA;

public class ejercicio1 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(IO.readln("dame el numero 1 "));
        num2 = Integer.parseInt(IO.readln("dame el numero 2 "));

        if (num1 > num2) {
            IO.println("el numero 1 es mayor");
        } else if (num1 == num2) {
            IO.println("son iguales");
        } else {
            IO.println("el numero 2 es mayor");
        }
    }
}
