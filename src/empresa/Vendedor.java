package empresa;

import productos.Producto;

public class Vendedor extends Empleado {
    public Vendedor(String nombre, String id) {

        super(nombre, id, "Vendedor");
    }

    public void consultarDetalle(Producto p) {

        p.mostrarDetalle();
    }
}
