package crud;

import controller.ControllerObjeto;

import model.Objetos;

public class CrudObjetos {
	
	public void crearObjeto(String nombre, int bonusVida, int bonusFuerza){
		
		Objetos o; //Creo que sería mejor crear los objetos en la clase objeto y luego traerlo aquí
		           //para poder borrarlo en el método de abajo con mayor facilidad.
		
		o = new Objetos(ControllerObjeto.GenerarBonusVida(),ControllerObjeto.GenerarBonusFuerza());
	}
	
	
	//public borrarObjeto(){

}
