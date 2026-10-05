package temaUno;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        
        double precioSinIva;
        double precioConIva;
        int edad; 
        boolean gratis; //true o false
        
        edad=18; //guardamos datos
        edad=33;

        precioSinIva=99.99;
        precioConIva= precioSinIva * 1.21;


        IO.println("la edad es " + edad);
        IO.println("el precio sin iva es " + precioSinIva);
        IO.println("el precio con iiva es" + precioConIva);

        precioConIva= precioConIva*0.98;

        IO.println("el precio con iiva y un 2% de descuento es " + precioConIva);

        if (precioConIva==0) 
        {
            gratis=true;
        } 
        else 
        {
            gratis=false;
        }

        IO.println("el producto es gratis: " + gratis);
    }

}
