package pdiseño_observer;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        ObserverConcreto obs1 = new ObserverConcreto("Brandon");
        ObserverConcreto obs2 = new ObserverConcreto("Luisa");

        sujeto.agregarObservador(obs1);
        sujeto.agregarObservador(obs2);

        sujeto.setEstado("Buenos días");
        sujeto.setEstado("Buenas tardes");
        sujeto.setEstado("Buenas noches");
    }
}
