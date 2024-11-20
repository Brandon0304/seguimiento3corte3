package pdiseño_factory;

public class ProductoFactory {
    public static Producto getProducto(String tipo){
        if (tipo.equalsIgnoreCase("1")){
            return new Producto1();
        }else if(tipo.equalsIgnoreCase("2")){
            return new Producto2();
        }
        throw new IllegalArgumentException("Producto no registrado");
    }
}
