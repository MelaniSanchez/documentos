import java.lang.*;

 /*
  * 
  */
  public class Vehiculo{
    private String marca;
    private String modelo;
    private int placa;

    /*
     * 
     */
    public Vehiculo(){
        marca = "";
        modelo = "";
        placa = 0;
    }
        /*
     * 
    */
    public void Leer(){
        //TODO: INGRESAR DATOS DEL VEHICULO
    }
    /*
     * 
     */
    public void Imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL VEHICULO
    }
    /*
     * 
     */
    public int getplaca(){
        if(placa=0)
        return "ERROR EL VEHICULO NO EXISTE";
        else
        return placa;
    }
  }
