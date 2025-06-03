package empresa;

public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected String rol;

    public Empleado(String nombre, String id, String rol) {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
    }
//WADA
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Rol: " + rol);
    }
}



