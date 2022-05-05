import GenericClasses.GenericStack;
import Utils.RobotUtils;

public class RobotAlmacen extends RobotUtils {
    private String nombreRobot;
    private double espacioCarga;

    private GenericStack <Producto> RobotCarga = new GenericStack<>();

    public RobotAlmacen() {
        this.nombreRobot = generarNombreRobot();
        this.espacioCarga = (int)generarNumeroAleatorio(5);
        if (espacioCarga == 0){
            this.espacioCarga = 1;
        }
    }
    public void meterRobot(){
        String producto = Producto.generarNombreProducto();
        RobotCarga.push(producto);
        System.out.println("Metió: " + Produ);
    }

    @Override
    public String toString() {
        return "Nombre='" + nombreRobot + '\n' +
                "Espacio de arga=" + espacioCarga + "\n" + "Tiene los siguientes productos: " + producto();
    }
}
