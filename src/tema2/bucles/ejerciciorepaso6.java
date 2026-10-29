package tema2.bucles;

import java.util.Locale;

public class ejerciciorepaso6 {
    static void main() {
        /*
        La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro
        es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
        los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
        décimo minuto, 50 céntimos.
        Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de
        mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe
        pagar por cada concepto una persona que realiza una llamada.
         */


        //declaro variables
        IO.println("Dime el dia de la semana ");

        String dias = IO.readln().toUpperCase();

        double tiempoLlamada = 0.0;
        double impuestos = 0.0;
        double dinero = 0.0;

        //pido el tiempo de llamada
        tiempoLlamada = Double.parseDouble(IO.readln("dime el tiempo"));

        //miro si es de lunes a sabado o un domingo
        if (dias.equals("DOMINGO")){

            //declaro los impuestos
            impuestos = 0.03;
            //compraro el tiempo de llamda
            if (tiempoLlamada<=5.0){

                //dinero sin impuestos
                dinero = tiempoLlamada;

                //dinero mas impestos
                dinero = dinero+(dinero * impuestos);

                IO.println("tienes que pagar en total: " + dinero);

            } else if (tiempoLlamada<=8.0) {

                //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                tiempoLlamada = tiempoLlamada - 5;
                dinero = tiempoLlamada * 0.80;
                dinero = dinero + 5;

                //dinero mas impestos
                dinero = dinero+(dinero * impuestos);

                IO.println("tienes que pagar en total: " + dinero);

            } else if (tiempoLlamada<=10.0) {

                //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                tiempoLlamada = tiempoLlamada - 8;
                dinero = tiempoLlamada * 0.70;
                dinero = dinero + (3*0.80);
                dinero = dinero + 5;

                //dinero mas impestos
                dinero = dinero+(dinero * impuestos);

                IO.println("tienes que pagar en total: " + dinero);

            }else {

                //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                tiempoLlamada = tiempoLlamada - 10;
                dinero = tiempoLlamada * 0.50;
                dinero = dinero + (2*0.70);
                dinero = dinero + (3*0.80);
                dinero = dinero + 5;

                //dinero as impuestos
                dinero = dinero+(dinero * impuestos);

                IO.println("tienes que pagar en total: " + dinero);
            }
        }else if (dias.equals("LUNES")||dias.equals("MARTES")||dias.equals("MIERCOLES")||dias.equals("JUEVES")||dias.equals("VIERNES")||dias.equals("SABADO")){

            //miro si la llamda fue por la mñana o por la tarde
            String horarioTeclado = IO.readln("dime si la llamada fue pot la mañana o par la tarde : ").toLowerCase();

            if (horarioTeclado.equals("tarde")){

                //pongo sus impuestos
                impuestos = 0.10;

                //compraro el tiempo de llamda
                if (tiempoLlamada<=5.0){

                    //dinero sin impuestos
                    dinero = tiempoLlamada;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=8.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 5;
                    dinero = tiempoLlamada * 0.80;
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=10.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 8;
                    dinero = tiempoLlamada * 0.70;
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                }else {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 10;
                    dinero = tiempoLlamada * 0.50;
                    dinero = dinero + (2*0.70);
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero as impuestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);
                }
            } else if (horarioTeclado.equals("mañana")) {

                //miro los impuestos
                impuestos = 0.15;

                //compraro el tiempo de llamda
                if (tiempoLlamada<=5.0){

                    //dinero sin impuestos
                    dinero = tiempoLlamada;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=8.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 5;
                    dinero = tiempoLlamada * 0.80;
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=10.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 8;
                    dinero = tiempoLlamada * 0.70;
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                }else {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 10;
                    dinero = tiempoLlamada * 0.50;
                    dinero = dinero + (2*0.70);
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero as impuestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);
                }
            }else{
                IO.println("es de madrugada tarifa sin impuestos!!!!");

                //miro los impuestos
                impuestos = 0.0;

                //compraro el tiempo de llamda
                if (tiempoLlamada<=5.0){

                    //dinero sin impuestos
                    dinero = tiempoLlamada;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=8.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 5;
                    dinero = tiempoLlamada * 0.80;
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                } else if (tiempoLlamada<=10.0) {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 8;
                    dinero = tiempoLlamada * 0.70;
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero mas impestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);

                }else {

                    //dinero sin impuestos y le resto los minutos de antes que ya se lo que valen
                    tiempoLlamada = tiempoLlamada - 10;
                    dinero = tiempoLlamada * 0.50;
                    dinero = dinero + (2*0.70);
                    dinero = dinero + (3*0.80);
                    dinero = dinero + 5;

                    //dinero as impuestos
                    dinero = dinero+(dinero * impuestos);

                    IO.println("tienes que pagar en total: " + dinero);
                }
            }
        }else {
                IO.println("no inventes anda");
            }


    }
}
