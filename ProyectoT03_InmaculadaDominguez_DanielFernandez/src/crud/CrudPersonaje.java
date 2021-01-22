package crud;

import model.Personaje;
import model.Objetos;


public class CrudPersonaje {
	
	public void modificarVida (Personaje p,Personaje p2){
		
		p.setVida(p.getVida()-p2.getFuerza());
	}
	
	public void modificarFuerzayVida (Personaje p, Objetos [] objetos, int usar){
		
		p.setFuerza(p.getFuerza()+objetos[usar-1].getBonusFuerza());	
		p.setVida(p.getVida()+objetos[usar-1].getBonusVida());
	}
		
		
}
