package recursividad;

public class ejemplo3 {
    public static void main(String[] args) {
        System.out.println("El area del triangulo es: " + areatriangulo(10, 6));
    }

    public static int areatriangulo(int base, int altura){
        if (base == 0 || altura == 0){
            return 0;
        }else if (base >=0 && altura >=0){
            return (base*altura)/2;
        }else{
            throw new IllegalArgumentException("La base y la altura deben ser positivos");
        }
    }
}
