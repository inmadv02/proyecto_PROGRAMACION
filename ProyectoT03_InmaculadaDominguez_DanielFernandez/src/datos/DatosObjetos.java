package datos;

import model.Objetos;
import controller.ControllerObjeto;

public class DatosObjetos {
	
	public static Objetos mascarilla = new Objetos ("Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos pulverizador = new Objetos ("Frufrú desinfec.", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos gel = new Objetos ("Gel pegajoso", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	
	public static Objetos [] objetos = {mascarilla, pulverizador, gel};
	
	public static Objetos getMascarilla() {
		return mascarilla;
	}



	public static void setMascarilla(Objetos mascarilla) {
		DatosObjetos.mascarilla = mascarilla;
	}



	public static Objetos getPulverizador() {
		return pulverizador;
	}



	public static void setPulverizador(Objetos pulverizador) {
		DatosObjetos.pulverizador = pulverizador;
	}



	public static Objetos getGel() {
		return gel;
	}



	public static void setGel(Objetos gel) {
		DatosObjetos.gel = gel;
	}



	public static Objetos[] getObjetos() {
		return objetos;
	}



	public static void setObjetos(Objetos[] objetos) {
		DatosObjetos.objetos = objetos;
	}



	public String toString() {
		return "DatosObjetos [mascarilla=" + mascarilla + ", pulverizador=" + pulverizador + ", gel=" + gel + "]";
	}
	
	
//	Objetos [] obj = 
//		{{"Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza()},
//		{"Frufrú desinfectante", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza()}};

}
