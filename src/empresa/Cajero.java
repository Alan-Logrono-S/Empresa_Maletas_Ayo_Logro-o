package empresa;

import productos.Producto;
import productos.Mochila;
import productos.MaletaViaje;

public class Cajero extends Empleado {
    public Cajero(String nombre, String id) {

        super(nombre, id, "Cajero");
    }

    public void realizarVenta(Producto p, int cantidad) {
        if (p.getPrecio()<cantidad){
            System.out.println("No hay suficiente stock disponible.");
            return;
        }
        double subtotal = p.getPrecio() * cantidad;
        if (p instanceof Mochila) subtotal *= 0.90;
        if (p instanceof MaletaViaje) subtotal *= 0.80;
        double total = subtotal * 1.15;
        p.reducirStock(cantidad);
        System.out.println("Venta realizada. Total a pagar: $" + total);
    }

    public void consultarDetalle(Producto p) {
        p.mostrarDetalle();
    }
}
