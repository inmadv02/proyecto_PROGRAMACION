package crud;

import model.Personaje;
import model.Objetos;


public class CrudPersonaje {
	
	public static void modificarVida (Personaje p,Personaje p2){
		
		p.setVida(p.getVida()-p2.getFuerza());
	}
	
	public static void modificarFuerzayVidaObj (Personaje p, Objetos [] objetos, int usar){
		
		p.setFuerza(p.getFuerza()+objetos[usar].getBonusFuerza());	
		p.setVida(p.getVida()+objetos[usar].getBonusVida());
	}
		
		
}
