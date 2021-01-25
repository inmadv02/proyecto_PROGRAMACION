package model;

public class Personaje {
	
	private char nombre;
	private int vida;
	private int fuerza;
	private int posI;
	private int posJ;
	private int contadorMuertes;
	
	public Personaje(char nombre, int vida, int fuerza, int posI, int posJ, int contadorMuertes) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		this.posI = posI;
		this.posJ = posJ;
		this.contadorMuertes = contadorMuertes;
	}

	public char getNombre() {
		return nombre;	
	}

	public void setNombre(char nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPosI() {
		return posI;
	}

	public void setPosI(int posI) {
		this.posI = posI;
	}

	public int getPosJ() {
		return posJ;
	}

	public void setPosJ(int posJ) {
		this.posJ = posJ;
	}

	public int getContadorMuertes() {
		return contadorMuertes;
	}

	public void setContadorMuertes(int contadorMuertes) {
		this.contadorMuertes = contadorMuertes;
	}

public String toString() {
		
		int diez = 10, cero = 0;
		
		if(vida < diez && vida > cero) {
			return"\t \t \t       _________________________\r\n"
					+ "\t \t \t      |\t\t\t\t|\r\n"
					+ "\t \t \t      |       TU PERSONAJE \t|\r\n"
					+ "\t \t \t      |\t\t\t\t|\r\n"
					+ "\t \t \t      | Nombre: " + nombre + "\t \t|\r\n"
					+ "\t \t \t      | Vida: 0" + vida + "\t\t|\r\n"
					+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
					+ "\t \t \t      |_________________________|";
		}
			
		if(vida <= cero) {
			return "\t \t \t       _________________________\r\n"
					+ "\t \t \t      |\t\t\t\t|\r\n"
					+ "\t \t \t      |       TU PERSONAJE \t|\r\n"
					+ "\t \t \t      |\t\t\t\t|\r\n"
					+ "\t \t \t      | Nombre: " + nombre + "\t \t|\r\n"
					+ "\t \t \t      | Vida: " + cero + "\t\t        |\r\n"
					+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
					+ "\t \t \t      |_________________________|";
			
		}else   return "\t \t \t       _________________________\r\n"
						+ "\t \t \t      |\t\t\t\t|\r\n"
						+ "\t \t \t      |       TU PERSONAJE \t|\r\n"
						+ "\t \t \t      |\t\t\t\t|\r\n"
						+ "\t \t \t      | Nombre: " + nombre + "\t \t|\r\n"
						+ "\t \t \t      | Vida: " + vida + "\t\t|\r\n"
						+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
						+ "\t \t \t      |_________________________|";
	}
	
	
	
	
	
	
	

}
