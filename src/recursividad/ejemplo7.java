package recursividad;

public class ejemplo7 {
    public static void main(String[] args) {
        System.out.println(esPalindroma("larutanatural"));
    }
    public static boolean esPalindroma(String cadena) {
        if (cadena.length() == 1) return true;
        else if (cadena.charAt(0) != cadena.charAt(cadena.length()-1)) return false;
        else return esPalindroma(cadena.substring(1, cadena.length()-1));
    }
}
