import java.lang.*;
public class DTaller{
    public static void main(String[] args) {
        Taller taller;//
        Factura factura;//
        Vehiculo vehiculo;//
        Propietario propietario;//
        taller = new Taller();
        factura = new Factura();
        vehiculo = new Vehiculo();
        propietario = new Propietario();

        
        taller.Leer();
        taller.Imprimir();
        factura.Leer();
        factura.Imprimir();
        vehiculo.Leer();
        vehiculo.Imprimir();
        propietario.Leer();
        propietario.Imprimir();
}
