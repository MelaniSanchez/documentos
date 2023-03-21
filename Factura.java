import java.lang.*;
/*
 * 
 */
public class Factura{
    private String fecha;
    private int numero;
    private String importe;
/*
 * 
 */
    public Factura(){
        fecha="";
        numero=0;
        importe="";
    }
    /*
     * 
    */
    public void Leer(){
        //TODO: INGRESAR DATOS DEL LA FACTURA
    }
    /*
     * 
     */
    public void Imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL FACTURA
    }
    /*
     * 
     */
    public int getnumero(){
        if(numero=0)
        return "ERROR LA FACTURA NO EXISTE";
        else
        return numero;
    }
    /*
     * 
     */
    public void setfecha(String fecha){
        this.fecha = fecha;
    }
}
