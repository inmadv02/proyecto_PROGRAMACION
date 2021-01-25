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
	
	public static Objetos o1 = new Objetos ("Mascarilla sucia", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos o2 = new Objetos ("Frufrú desinfec.", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos o3 = new Objetos ("Gel pegajoso", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), true);
	public static Objetos o4 = new Objetos ("Papel higiénico", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 3, 3);
	public static Objetos o5 = new Objetos ("Carne La Mechá", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 7, 6);
	public static Objetos o6 = new Objetos ("Harina   ", ControllerObjeto.GenerarBonusVida(), ControllerObjeto.GenerarBonusFuerza(), false, 5, 9);
	
	public static Objetos [] objetosNuevos = {o1,o2,o3,o4,o5,o6};
	
	
	
	public static Objetos getO1() {
		return o1;
	}



	public static void setO1(Objetos o1) {
		DatosObjetos.o1 = o1;
	}



	public static Objetos getO2() {
		return o2;
	}



	public static void setO2(Objetos o2) {
		DatosObjetos.o2 = o2;
	}



	public static Objetos getO3() {
		return o3;
	}



	public static void setO3(Objetos o3) {
		DatosObjetos.o3 = o3;
	}



	public static Objetos getO4() {
		return o4;
	}



	public static void setO4(Objetos o4) {
		DatosObjetos.o4 = o4;
	}



	public static Objetos getO5() {
		return o5;
	}



	public static void setO5(Objetos o5) {
		DatosObjetos.o5 = o5;
	}



	public static Objetos getO6() {
		return o6;
	}



	public static void setO6(Objetos o6) {
		DatosObjetos.o6 = o6;
	}



	public static Objetos[] getObjetosNuevos() {
		return objetosNuevos;
	}



	public static void setObjetosNuevos(Objetos[] objetosNuevos) {
		DatosObjetos.objetosNuevos = objetosNuevos;
	}



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
