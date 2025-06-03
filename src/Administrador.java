import empresa.Empleado;

public class Administrador {

    class Administrador extends Empleado {
        public Administrador(String nombre, String id) {
            super(nombre, id, "Administrador");
        }
    }

    class Gerente extends Empleado {
        public Gerente(String nombre, String id) {
            super(nombre, id, "Gerente");
        }
    }

    class PersonalLimpieza extends Empleado {
        public PersonalLimpieza(String nombre, String id) {
            super(nombre, id, "Limpieza");
        }
    }

}
