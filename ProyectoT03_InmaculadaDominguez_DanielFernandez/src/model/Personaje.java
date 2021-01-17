package model;

public class Personaje {
	
	private String nombre;
	private int vida;
	private int fuerza;
	//private double energia;
	
	public Personaje (String nombre, int vida, int fuerza) {
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreJ) {
		this.nombre = nombreJ;
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

	public String toString() {
		return "\t \t \t       _________________________\r\n"
				+ "\t \t \t      |\t\t\t\t|\r\n"
				+ "\t \t \t      | Nombre: " + nombre + "\t \t|\r\n"
				+ "\t \t \t      | Vida: " + vida + "\t \t|\r\n"
				+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
				+ "\t \t \t      |_________________________|";
	}
	
	
	
	
	
	
	
	

}
