package pdiseño_Singleton;

public class ejemplo1 {
    private static ejemplo1 instance;
    private String nombre;
    private String apellido;
    private int edad;

    private ejemplo1(){

    }

    public static ejemplo1 getInstance(){
        if (instance==null){
            instance = new ejemplo1();
        }return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
