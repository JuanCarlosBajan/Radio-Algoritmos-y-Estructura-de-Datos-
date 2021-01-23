/**Universidad del Valle de Guatemala
 //Fecha: 22/01/2021
 //Nombres:
 //Juan Carlos Bajan: 20109
 //Pablo Gonzalez: 20362
 Clase Interfaz general que se desararrolla con el proposito de implementarla en cualquier radio.
 */
public interface RadioGeneral{

	/** Metodo para saber si la radio esta encendida*/
	public  boolean isON();

	/** Metodo para encender la radio*/
	public void encender();

	/** Metodo para apagar la radio*/
	public void apagar();

	/** Metodo para incrementar la estacion*/
	public void incrementar();

	/** Metodo para asignar a uno de los 12 botones la radio la cual esta puesta en el momento de iniciar el mismo*/
	public boolean asignar(int num);

	/** Metodo para retornar la emisora guardada en uno de los 12 espacios*/
	public boolean emisora(int num);

	/** Metodo para cambiar de am a fm.*/
	public void  frecuencia();
}