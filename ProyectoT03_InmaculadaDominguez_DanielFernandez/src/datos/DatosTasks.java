package datos;

import model.Tasks;

public class DatosTasks {
	
	public static Tasks tarea1 = new Tasks ("\t \t _________________________________________\n"
										  + "\t \t|\t\t\t\t\t  |\n"
										  + "\t \t|   Objetivo: Coger Papel higiénico       |\n"
										  + "\t \t|   Pista: pasillo 3 x 2 - 4 - 4 : 4      |\n"
										  + "\t \t|_________________________________________|", true);
	
	public static Tasks tarea2 = new Tasks ("\t \t _________________________________________\n"
										  + "\t \t|\t\t\t\t\t  |\n"
										  + "\t \t|   Objetivo: Coger Carne La Mechá        |\n"
										  + "\t \t|   Pista: pasillo -16 : 4 + 2 (2+1)      |\n"
										  + "\t \t|_________________________________________|", true);
	
	public static Tasks tarea3 = new Tasks ("\t \t _________________________________________\n"
			  							  + "\t \t|\t\t\t\t\t  |\n"
			  							  + "\t \t|   Objetivo: Coger Harina                |\n"
			  							  + "\t \t|   Pista: pasillo | 2^3 - 5 - 6 |        |\n"
			  							  + "\t \t|_________________________________________|", true);

	
	public static Tasks [] tasks = {tarea1, tarea2, tarea3};

	public static Tasks getTarea1() {
		return tarea1;
	}

	public static void setTarea1(Tasks tarea1) {
		DatosTasks.tarea1 = tarea1;
	}

	public static Tasks getTarea2() {
		return tarea2;
	}

	public static void setTarea2(Tasks tarea2) {
		DatosTasks.tarea2 = tarea2;
	}

	public static Tasks getTarea3() {
		return tarea3;
	}

	public static void setTarea3(Tasks tarea3) {
		DatosTasks.tarea3 = tarea3;
	}

	public static Tasks[] getTasks() {
		return tasks;
	}

	public static void setTasks(Tasks[] tasks) {
		DatosTasks.tasks = tasks;
	}
	
	

}
