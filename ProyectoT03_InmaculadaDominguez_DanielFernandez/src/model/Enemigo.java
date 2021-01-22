package model;

public class Enemigo {
	
	private String nombre;
	private int vida;
	private int fuerza;
	private int posI;
	private int posJ;
	private boolean activo;
	
	public Enemigo(String nombre, int vida, int fuerza, int posI, int posJ, boolean activo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		this.posI = posI;
		this.posJ = posJ;
		this.activo = activo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Enemigo [nombre=" + nombre + ", vida=" + vida + ", fuerza=" + fuerza + ", posI=" + posI + ", posJ="
				+ posJ + ", activo=" + activo + "]";
	}
	
	
	
	

}
