package recursividad;

public class ejemplo6 {
    public static void main(String[] args) {
        System.out.println(potencia(2,5));
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        else return base * potencia(base, exponente-1);
    }
}
