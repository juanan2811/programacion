package tema2;

public class ejejrcicioclase1 {
    public static void main(String[] args) {
        String usuario = "usuario";
        String usuarioTeclado;

        String contraseña = "12345678";
        String contraseñaTeclado;

        usuarioTeclado = IO.readln("dime tu usuario : ");
        contraseñaTeclado = IO.readln("dime tu contraseña : ");

        if (usuario.equals(usuarioTeclado) && contraseña.equals(contraseñaTeclado)) {

            IO.println("Has entrado");

        } else {

            IO.println("No has entrado");

        }
    }
}
