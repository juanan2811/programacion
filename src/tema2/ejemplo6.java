package tema2;

public class ejemplo6 {
    public static void main(String[] args) {
        int opcion = 0;

        opcion = Integer.parseInt(IO.readln("dame una opcion del uno al 5: "));

        IO.println();

        switch (opcion) {
            case 1 -> {
                IO.println("has selecionado la opcion " + opcion);
                IO.println("mostrar todos los usuarios");
            }
            case 2 -> {
                IO.println("has selecionado la opcion " + opcion);
                IO.println("mostrar un usuario");
            }
            case 3 -> {
                IO.println("has selecionado la opcion " + opcion);
                IO.println("modificar un usuario");
            }
            case 4 -> {
                IO.println("has selecionado la opcion " + opcion);
                IO.println("eliminar un usuario");
            }
            case 5 -> {
                IO.println("has selecionado la opcion " + opcion);
                IO.println("SALIR");
            }
            default -> IO.println("opcion incorrecta");
        }
    }
}
