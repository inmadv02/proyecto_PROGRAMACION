package controller;

import java.util.Random;

public class ControllerObjeto {
	
	public static int GenerarBonusVida() {
		
		Random r = new Random (System.nanoTime());
		int bonusVida , desde = 5,hasta = 10, uno = 1;
		
		bonusVida = r.nextInt(hasta-desde-uno)+desde;

		return bonusVida;
		
		
		}
	
	public static int GenerarBonusFuerza() {
		
		Random r = new Random (System.nanoTime());
		int bonusFuerza , desde = 5,hasta = 10, uno = 1;
		
		bonusFuerza = r.nextInt(hasta-desde-uno)+desde;

		return bonusFuerza;
		
		
		}

}
