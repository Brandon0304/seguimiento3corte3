package recursividad;

public class ejemplo2 {
    public static void main(String[] args) {
        System.out.println(mcd(9, 36));
    }

    public static int mcd(int a, int b){
        if (b == 0) return a;
        else return mcd(b, a%b);
    }
}
