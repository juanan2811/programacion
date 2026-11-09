package tema2.metodos;

public class ejerciciocalse2 {
    static void pintarOpciones() {
        IO.println("1. Es par");
        IO.println("2. Maximo de tres numeros");
        IO.println("3. Es primo");
        IO.println("4. Mostrar tabla multiplicar");
        IO.println("5. Salir");
    }

    static void main() {
        int opcion = 0;
        do {
            pintarOpciones();
            opcion = Integer.parseInt(IO.readln("Dime una opción: "));

            switch (opcion) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }



                default -> IO.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}
