package pdiseño_factory;

public class Producto2 implements Producto{
    @Override
    public void mostrarInfo() {
        System.out.println("Información del producto 2: Enlatados");
    }

    @Override
    public void describirProducto() {
        System.out.println("Guisantes enlatados");
    }
}
