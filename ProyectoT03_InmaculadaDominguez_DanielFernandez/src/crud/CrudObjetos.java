package crud;

import controller.ControllerObjeto;

import model.Objetos;

import datos.DatosObjetos;

public class CrudObjetos {
	
	
	public static void borrarObjeto(int usar, Objetos [] objetos){
		int posicion;
		posicion = usar - 1;
		
		objetos[posicion].setActivo(false);
		
	}
	
	//tendría que poner un método de usar para conseguir la posición
	//real del objeto

}
