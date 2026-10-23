package tema2;

public class ejemplo3 {
    public static void main(String[] args) {
        int vida = 100;
        boolean escudo = true;

        int n = (int) (Math.random() * 20) + 1;

        IO.println("tirada es : " + n);
        IO.println("-------------------------");

        if (n == 20) {
            IO.println("golpe critico y matas ");
        } else if (n >= 16) {

            if (escudo) {
                IO.println("golpe brutal con escudo");
            } else {
                IO.println("golpe brutal con espada");
            }
        } else if (n >= 11) {
            IO.println("Ataque normal con la espada");
        } else if (n >= 6) {
            IO.println("usas el escudo para cubrirte");
            if (escudo) {
                IO.println("paras golpe");
            } else {
                vida = vida - 70;
                IO.println("no tienes escudo recibes daño");
            }
        } else if (n >= 2) {
            IO.println("Huyes despavorido");
            vida = vida - 50;
        } else if (n == 1) {
            IO.println("te resvalas y mueres");
            vida = 0;
        } else {
            IO.println("no ha salido nada ");
        }
        IO.println("---------------------------------------------");
        IO.println("vida es : " + vida);

    }

}
