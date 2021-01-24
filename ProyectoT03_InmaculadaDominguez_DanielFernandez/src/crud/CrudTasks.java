package crud;

import model.Objetos;
import controller.ControllerPersonaje;
import controller.ControllerEnemigo;
import model.Enemigo;
import datos.DatosTasks;
import model.Tasks;

public class CrudTasks {
	
	public static void desactivarTasks (Tasks [] tasks, Enemigo [] listaEnemigos) {
			int cero = 0, uno = 1, dos = 2;
			
			if(listaEnemigos[cero].getVida() <= cero) {
				tasks[cero].setActivo(false);	
			}
			if(listaEnemigos[uno].getVida() <= cero){
				tasks[uno].setActivo(false);
			}
			if(listaEnemigos[dos].getVida() <= cero) {
				tasks[dos].setActivo(false);	
			}
		}
	}


