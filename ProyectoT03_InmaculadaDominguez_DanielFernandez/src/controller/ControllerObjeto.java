package controller;

import java.util.Random;

public class ControllerObjeto {
	
	public static int GenerarBonus() {
		
		Random r = new Random (System.nanoTime());
		int bonusVida , desde = 5,hasta = 10, uno = 1;
		
		bonusVida = r.nextInt(hasta-desde-uno)+desde;

		return bonusVida;	
		
		}

}
