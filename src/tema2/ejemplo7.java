package tema2;

public class ejemplo7 {
    public static void main(String[] args) {

        /*
         * Somos una empresa de transporte y vamos a ver el estado de los paquetes.
         * Pedimos por teclado el estado del paquete como String:
         * - PENDIENTE
         * - PROCESANDO
         * - ENVIADO
         * - ENTREGADO
         * - CANCELADO
         * 
         * Según la opción mostraremos el estado del pedido:
         * - Tu pedido ha sido recibido y está pendiente de pago
         * - Tu pedido se está preparando en el almacén
         * - El pedido va en camino con el servicio de mensajería
         * - El pedido ha sido entregado con éxito
         * - El pedido ha sido cancelado
         * - Estado del pedido desconocido (si no es uno de los anteriores)
         */

        String estado;

        IO.println("dime le estaddo de tu pedido");
        IO.println("PENDIENTE");
        IO.println("PROCESANDO");
        IO.println("ENVIADO");
        IO.println("ENTREGADO");
        IO.println("CANCELADO");

        estado = (IO.readln("dame el estado: "));

        switch (estado.toUpperCase()) {
            case "PENDIENTE" -> {
                IO.println("Tu pedido ha sido recibido y está pendiente de pago");
            }
            case "PROCESANDO" -> {
                IO.println("Tu pedido se está preparando en el almacén");
            }
            case "ENVIADO" -> {
                IO.println("El pedido va en camino con el servicio de mensajería");
            }
            case "ENTREGADO" -> {
                IO.println("El pedido ha sido entregado con éxito");
            }
            case "CANCELADO" -> {
                IO.println("El pedido ha sido cancelado");
            }
            default -> IO.println("Estado del pedido desconocido (si no es uno de los anteriores)");
        }
    }
}
