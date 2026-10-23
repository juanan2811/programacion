package tema2;

public class ejemplo2 {
    public static void main(String[] args) {
        int armadura, vida;

        vida = Integer.parseInt(IO.readln("dame la vida :"));
        armadura = Integer.parseInt(IO.readln("dame la armadura :"));

        if (vida > 0 && armadura > 0) {
            IO.println("esta vivo y tiene vida y armadura ");

        } else if (vida > 0) {
            IO.println("vivo por que tiene vida ");

        } else if (armadura > 0) {
            IO.println("esta vivo por qur tiene armadura");
        } else {
            IO.println("muerto");
        }

    }

}
