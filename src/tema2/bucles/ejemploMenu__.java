package tema2.bucles;

public class ejemploMenu__ {
    public static void main(String[] args) {
        double saldo = 5500.0;
        double deposito = 0.0;

        //inicializo  a un valor que no enra en el menu
        int opcion = -1;
        do {
            IO.println("1. consultar  saldo ");
            IO.println("2. depositar dinero");
            IO.println("3. saludar al director");
            IO.println("4. salir");

            opcion = Integer.parseInt(IO.readln("elige una opcion entre 1 y 4 : "));

            //dependiendo de la opcion hacemos una cosa u otra
            switch (opcion) {
                case 1 -> {
                    IO.println("tu saldo es " + saldo);
                }
                case 2 -> {
                    deposito = Double.parseDouble(IO.readln("elige un deposito "));
                    if (deposito >0) {
                        saldo = saldo + deposito;
                    }else  {
                        IO.println("El deposito no puede ser negativo");
                    }

                }
                case 3 -> {
                    IO.println("hola como va mi dinero?? ");
                }
                case 4 -> {
                    IO.println("hasta otro dia ");
                }
                default -> {
                    IO.println("Opcion no permitida");
                }
            }
        }while(opcion != 4); // se repite hasta que la opcion salida
    }
}
