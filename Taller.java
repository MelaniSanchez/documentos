import java.lang.*;
/*
 * 
 */

public class Taller{
    private String nombre;
    private int numero;
    private String fecha;

    public Taller(){
        nombre="";
        numero=0;
        fecha="";
    }
/*
 * 
 */
    public void Leer(){
        //TODO: INGRESAR DATOS DEL TALLER
    }
    public void Imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL TALLER
    }
/*
 * 
 */
    public String getnombre(){
        if(nombre="")
        return "ERROR NO TIENE NOMBRE";
        else
        return nombre;
    }
/*
 * 
 */
    public void setfecha(String fecha){
        this.fecha = fecha;
    }
}
