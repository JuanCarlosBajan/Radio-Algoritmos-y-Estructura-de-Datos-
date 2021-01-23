/**Universidad del Valle de Guatemala
 //Fecha: 22/01/2021
 //Nombres:
 //Juan Carlos Bajan: 20109
 //Pablo Gonzalez: 20362
 //Clase radio que implementa la interfaz de Radio general creada con el proposito del ejercicio 1
 */
import java.util.ArrayList;
public class RadioSonora implements RadioGeneral{

  private boolean on = false;
  private boolean am = false;
  private int estacionam = 530;
  private double estacionfm = 87.9;
  ArrayList<Integer> estacionesam= new ArrayList<Integer>();
  ArrayList<Double> estacionesfm= new ArrayList<Double>();


  public RadioSonora(){//Constructor de clase
    for(int i = 0; i< 12; i++){
      estacionesam.add(0);
      estacionesfm.add(0.00);
    }

  }

  /**Metodo para saber si la radio esta encendida*/
  public boolean isON(){
    return on;
  }

  /**Metodo para encender la radio*/
  public void encender(){
    on = true;
  }

  /**Metodo para apagar la radio.*/
  public void apagar(){
    on = false;
  }

  /**Metodo para incrementar la estacion.*/
  public void incrementar(){
    if(estacionam < 1610 && am == true){
      estacionam += 10;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    } else if(estacionfm < 107.80 && am == false){
      estacionfm +=0.2;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    } else if(estacionam == 1610 && am == true) {
      estacionam =530;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    } else if(estacionfm >= 107.90 && am == false) {
      estacionfm =87.9;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    }
  }

  /**Metodo para asignar a uno de los 12 botones la radio la cual esta puesta en el momento de iniciar el mismo.*/
  public boolean asignar(int num){
    if(am == true){
      estacionesam.set(num-1,estacionam);
      System.out.println("Usted ha asignado la estacion " + estacionam + " al boton " + num + " en am");
      return true;
    } else{
      estacionesfm.set(num-1,estacionfm);
      System.out.println("Usted ha asignado la estacion " + estacionfm + " al boton " + num + " en fm");
      return true;
    }


  }

  /**Metodo para retornar la emisora guardada en uno de los 12 espacios*/
  public boolean emisora(int num){
    if(estacionesam.get(num-1) != 0 && am == true){

      estacionam = estacionesam.get(num-1);
      System.out.println("Usted esta escuchando la estacion " + estacionam + "en am");
      return true;

    } else if (estacionesfm.get(num-1) != 0.00 && am == false){
      estacionfm = estacionesfm.get(num-1);
      System.out.println("Usted esta escuchando la estacion " + estacionfm + "en fm");
      return true;

    } else{
      System.out.println("Esta emisora no tiene ninguna estacion");
      return false;
    }
  }

  /**Metodo para cambiar de am a fm.*/
  public void frecuencia(){
    if(am==false){
      am=true;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    }
    else if(am==true){
      am=false;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    }

  }





}