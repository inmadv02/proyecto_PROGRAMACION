package datos;

import controller.ControllerEnemigo;
import model.Enemigo;
import datos.DatosObjetos;
import model.Objetos;

public class DatosEnemigos {
 
	
	public static Enemigo e1 = new Enemigo("Pescadero",ControllerEnemigo.generarVidaEnemigos(),5,3,3,true,0,"Bofetada con atún.",DatosObjetos.getPapel());
	public static Enemigo e2 = new Enemigo("Señora mayor",ControllerEnemigo.generarVidaEnemigos(),20,7,6,true,1,"bbbdfsbdg",DatosObjetos.getMecha());
	public static Enemigo e3 = new Enemigo("Limpiadora",ControllerEnemigo.generarVidaEnemigos(),5,5,9,true,2,"ccccfhksbkdfhb",DatosObjetos.getHarina());
	
	public static Enemigo [] listaEnemigos = {e1,e2,e3};

	public static Enemigo getE1() {
		return e1;
	}

	public static void setE1(Enemigo e1) {
		DatosEnemigos.e1 = e1;
	}

	public static Enemigo getE2() {
		return e2;
	}

	public static void setE2(Enemigo e2) {
		DatosEnemigos.e2 = e2;
	}

	public static Enemigo getE3() {
		return e3;
	}

	public static void setE3(Enemigo e3) {
		DatosEnemigos.e3 = e3;
	}

	public static Enemigo[] getListaEnemigos() {
		return listaEnemigos;
	}

	public static void setListaEnemigos(Enemigo[] listaEnemigos) {
		DatosEnemigos.listaEnemigos = listaEnemigos;
	}

	
	
	


}
