public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        Almacen almacen = new Almacen();
        for (int i = 0; i < 5; i++) {
            RobotAlmacen robotAlmacen = new RobotAlmacen();
            System.out.println(robotAlmacen);
        }
    }
}