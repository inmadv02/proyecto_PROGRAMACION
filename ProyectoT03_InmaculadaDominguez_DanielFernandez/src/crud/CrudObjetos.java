package crud;

import controller.ControllerObjeto;

import model.Objetos;

public class CrudObjetos {
	
	public void crearObjeto(String nombre, int bonusVida, int bonusFuerza){
		
		Objetos o; //Creo que ser�a mejor crear los objetos en la clase objeto y luego traerlo aqu�
		           //para poder borrarlo en el m�todo de abajo con mayor facilidad.
		
		o = new Objetos(ControllerObjeto.GenerarBonusVida(),ControllerObjeto.GenerarBonusFuerza());
	}
	
	
	//public borrarObjeto(){

}
