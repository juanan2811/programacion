package temaUno;

public class EjemploOperadoresRelaciones {
    public static void main(String[] args) {

        int precio = 125;
        String password = "12345678";
        boolean res;
        boolean igual = (password == "12345678");

        res = (precio > 100);
        IO.println(res);

        res = (precio >= 130);
        IO.println(res);

        res = (precio < 100);
        IO.println(res);

        res = (precio <= 125);
        IO.println(res);

        IO.println("la contraseña es igual " + igual);
    }

}
