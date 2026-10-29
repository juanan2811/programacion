package tema2;

public class ejemploclase {
    static void main() {

        int numeroTeclado = 0;
        double suma = 0.0 ;
        double media = 0.0;
        int contador = 0;


        do{
            contador += 1;
            numeroTeclado = Integer.parseInt(IO.readln("dime el numero "));
            IO.println(numeroTeclado);
            suma = numeroTeclado + suma;

        }while(numeroTeclado != 0 );
        IO.println("la  suma es " + suma);
        media = suma / (contador-1);
        IO.println("la media es " + media);

        IO.println("contador es " + (contador - 1));
    }
}
