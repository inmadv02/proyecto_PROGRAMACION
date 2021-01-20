package datos;

import model.Objetos;
import controller.ControllerObjeto;

public class DatosObjetos {
	
	public static Objetos mascarilla = new Objetos ("Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza());
	public static Objetos pulverizador = new Objetos ("Frufrú desinfectante", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza());
	public static Objetos gel = new Objetos ("Gel pegajoso", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza());
	
	public static Objetos [] objetos = {mascarilla, pulverizador, gel};

	
	public String toString() {
		return "DatosObjetos [mascarilla=" + mascarilla + ", pulverizador=" + pulverizador + ", gel=" + gel + "]";
	}
	
	
//	Objetos [] obj = 
//		{{"Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza()},
//		{"Frufrú desinfectante", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza()}};

}
