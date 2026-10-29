package tema2.bucles;

public class ejercicioNumeroAmstrong {
    static void main() {
        int numero;
        int digito;
        int acomulador = 0;
        int contador = 0;
        int guardado = 0;
        boolean amstrong = false;

        numero = Integer.parseInt(IO.readln("Dime un número: "));
        guardado = numero;
        while (numero != 0) {
            contador++;
            digito = numero % 10;
            IO.println(digito);
            numero = numero / 10;
        }
        numero = guardado;
        int i = contador;
        while (i > 0){
            i --;
            digito = numero % 10;
            numero = numero / 10;
            acomulador = acomulador + ( (int) Math.pow( digito, contador));
        }
        IO.println("el acomulador es " + acomulador);
        if (guardado == acomulador ){
            amstrong = true;
            IO.println("el numero es de amstrong? " + amstrong);
        }else {
            amstrong = false;

            IO.println("el numero es de amstrong? " + amstrong);
        }
    }
}
