package model;

public class Personaje {
	
	private String nombre;
	private double vida;
	private double fuerza;
	//private double energia;
	
	public Personaje(String nombre, double vida, double fuerza) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", fuerza=" + fuerza + "]";
	}
	
	
	
	

}
