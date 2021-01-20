package model;

public class Personaje {
	
	private char nombre;
	private int vida;
	private int fuerza;
	private int posI;
	private int posJ;
	
	public Personaje(char nombre, int vida, int fuerza, int posI, int posJ) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		this.posI = posI;
		this.posJ = posJ;
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

	public String toString() {
		return "\t \t \t       _________________________\r\n"
				+ "\t \t \t      |\t\t\t\t|\r\n"
				+ "\t \t \t      | Nombre: " + nombre + "\t \t|\r\n"
				+ "\t \t \t      | Vida: " + vida + "\t \t|\r\n"
				+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
				+ "\t \t \t      |_________________________|";
	}
	
	
	
	
	
	
	
	

}
