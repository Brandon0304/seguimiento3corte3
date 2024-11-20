package pdiseño_observer;
import java.util.ArrayList;
import java.util.List;


public class Sujeto {
    private List<Observer> observers = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObservador(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.update(estado);
        }
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores();
    }
}
