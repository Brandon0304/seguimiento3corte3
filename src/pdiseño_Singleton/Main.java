package pdiseño_Singleton;

public class Main {
    public static void main(String[] args) {
        ejemplo1 Ejemplo1 = ejemplo1.getInstance();

        Ejemplo1.setNombre("Brandon");
        Ejemplo1.setApellido("Ortiz Medina");
        Ejemplo1.setEdad(17);

        System.out.println("Nombre : " + Ejemplo1.getNombre());
        System.out.println("Apellido: " + Ejemplo1.getApellido());
        System.out.println("Edad: " + Ejemplo1.getEdad());
    }
}
