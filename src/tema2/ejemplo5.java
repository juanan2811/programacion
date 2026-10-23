package tema2;

public class ejemplo5 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20) + 1;
        IO.println("tirada" + n);

        switch (n) {
            case 1 -> IO.println("pifia");
            case 2, 3, 4, 5 -> IO.println("huyes");
            case 6, 7, 8, 9, 10 -> IO.println("te cubres con el escudo");
            case 11, 12, 13, 14, 15 -> IO.println("ataque normal");
            case 16, 17, 18, 19 -> IO.println("critico");
            case 20 -> IO.println("lo matas");
            default -> IO.println("dado al suelo");
        }

    }

}
