package pdiseño_factory;

public class Producto1 implements Producto{
    @Override
    public void mostrarInfo(){
        System.out.println("Información del producto 1: Lácteos");
    }

    @Override
    public void describirProducto() {
        System.out.println("Quesos Colanta");
    }
}
