package learning.oop;

public class Cliente extends Persona{
    private String nombre_empresa;
    private String telefono_de_contacto;

    public static String mostrar(String telefono_de_contacto,String nombre_empresa) {
        this.nombre_empresa=nombre_empresa;
        this.telefono_de_contacto=telefono_de_contacto;
    }

    public static String mostrar() {
    }
}
