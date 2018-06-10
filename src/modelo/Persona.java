package modelo;

public class Persona {
    private int edad;
    private String nombre;
    private double documento;

    public Persona() {
        this.documento=0;
        this.edad=0;
        this.nombre="";
    }

    public Persona(int edad, String nombre, double documento) {
        this.edad = edad;
        this.nombre = nombre;
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }
    
    
}
