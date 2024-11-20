package pdiseño_observer;

public class ObserverConcreto implements Observer{
    private String nombre;

    public ObserverConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
}
