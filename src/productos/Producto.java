package productos;

public class Producto {
    private String codigo;
    private String descripcion;
    private String ubicacion;
    private int stock;
    private double precio;

    public Producto(String codigo, String descripcion, String ubicacion, int stock,
                    double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.stock = stock;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {return stock;}
    public void reducirStock(int cantidad){
        stock -= cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Stock: " + stock);
        System.out.println("Precio: $" + precio);
    }

    public void mostrarPrecio() {
        System.out.println("\nPrecio del producto: $" + precio);
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

}
