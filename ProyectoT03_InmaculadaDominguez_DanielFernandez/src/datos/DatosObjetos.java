package datos;

import model.Objetos;
import controller.ControllerObjeto;

public class DatosObjetos {
	
	public static Objetos mascarilla = new Objetos ("Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos pulverizador = new Objetos ("Frufrú desinfec.", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos gel = new Objetos ("Gel pegajoso", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos papel = new Objetos ("Papel higiénico", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 3, 3);
	public static Objetos mecha = new Objetos ("Carne La Mechá", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 7, 6);
	public static Objetos harina = new Objetos ("Harina   ", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 5, 9);
	
	public static Objetos [] objetos = {mascarilla, pulverizador, gel, papel, mecha, harina};
	
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



	public static Objetos getPapel() {
		return papel;
	}



	public static void setPapel(Objetos papel) {
		DatosObjetos.papel = papel;
	}



	public static Objetos getHarina() {
		return harina;
	}



	public static void setHarina(Objetos harina) {
		DatosObjetos.harina = harina;
	}



	public static Objetos getMecha() {
		return mecha;
	}



	public static void setMecha(Objetos mecha) {
		DatosObjetos.mecha = mecha;
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
//		{"Frufr� desinfectante", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza()}};

}
