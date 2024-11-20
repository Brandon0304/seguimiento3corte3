package recursividad;

public class ejemplo1 {
    public static void main(String[] args) {
        System.out.println(sumaDigitos(20));
    }

    public static int sumaDigitos(int n){
        if(n==0) return 0;
        else return n%10 + sumaDigitos(n/10);
    }
}
