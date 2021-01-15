package crud;

import controller.ControllerObjeto;
import model.Objetos;

public class CrudObjetos {
	
	public void crearObjeto(String nombre, int bonusVida, int bonusFuerza){
		
		Objetos o;
		
		o = new Objetos(ControllerObjeto.GenerarBonus(),ControllerObjeto.GenerarBonus());
	}
	
	
	//public borrarObjeto(){

}
