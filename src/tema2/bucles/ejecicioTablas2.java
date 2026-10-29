package tema2.bucles;

public class ejecicioTablas2 {
    static void main() {

        for (int i = 1 ; i <= 10 ; i++){
            IO.println("tabla del " + i);
            for (int b =1 ; b <= 10 ; b++) {

                IO.println(i + " x " + b + " = " + (b * i));
            }
        }
    }
}
