package model;

import datos.DatosObjetos;
import model.Objetos;

public class Enemigo {
	
	private String nombre;
	private int vida;
	private int fuerza;
	private int posI;
	private int posJ;
	private boolean activo;
	private int posicionArray;
	private String ataque;
	private Objetos objeto;
	
	public Enemigo(String nombre, int vida, int fuerza, int posI, int posJ, boolean activo, int posicionArray,
			String ataque, Objetos objeto) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		this.posI = posI;
		this.posJ = posJ;
		this.activo = activo;
		this.posicionArray = posicionArray;
		this.ataque = ataque;
		this.objeto = objeto;
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

	public int getPosicionArray() {
		return posicionArray;
	}

	public void setPosicionArray(int posicionArray) {
		this.posicionArray = posicionArray;
	}

	public String getAtaque() {
		return ataque;
	}

	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	public Objetos getObjeto() {
		return objeto;
	}

	public void setObjeto(Objetos objeto) {
		this.objeto = objeto;
	}

	@Override
	public String toString() {
		if(posicionArray == 0) {
			return  "\t \t \t       ____________________________________\r\n"
					+ "\t \t \t      |\t\t\t\t\t   |\r\n"
					+ "\t \t \t      | Nombre: " + nombre + "   |\r\n"
					+ "\t \t \t      | Vida: " + vida + "\t\t\t   |\r\n"
					+ "\t \t \t      | Fuerza: " + fuerza + "\t \t\t   |\r\n"
					+ "\t \t \t      |____________________________________|";

		}else
		return "\t \t \t       _________________________\r\n"
				+ "\t \t \t      |\t\t\t\t|\r\n"
				+ "\t \t \t      | Nombre: " + nombre + "\t|\r\n"
				+ "\t \t \t      | Vida: " + vida + "\t \t|\r\n"
				+ "\t \t \t      | Fuerza: " + fuerza + "\t \t|\r\n"
				+ "\t \t \t      |_________________________|";
	}
	
	
	
	

}
