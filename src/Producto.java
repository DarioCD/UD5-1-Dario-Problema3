import Utils.RobotUtils;

public class Producto extends RobotUtils {
    private String nombre;
    private double precio;

    public Producto() {
        this.nombre = generarNombreProducto();
        this.precio = (float)generarNumeroAleatorio(900);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre del producto :" + nombre + "\n" + "Precio del producto: " + precio;
    }
}
