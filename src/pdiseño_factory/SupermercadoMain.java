package pdiseño_factory;
import java.util.Objects;


public class SupermercadoMain {
    public static void main(String[] args) {
        Producto p1 = ProductoFactory.getProducto("1");
        Objects.requireNonNull(p1).mostrarInfo();
        Objects.requireNonNull(p1).describirProducto();
        System.out.println("\n---------------------------\n");
        Producto p2 = ProductoFactory.getProducto("2");
        Objects.requireNonNull(p2).mostrarInfo();
        Objects.requireNonNull(p2).describirProducto();


    }
}
