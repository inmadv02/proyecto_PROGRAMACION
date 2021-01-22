package model;

public class Objetos {
	
	private String nombre;
	private int bonusVida;
	private int bonusFuerza;
	private boolean activo;
	
	public Objetos(String nombre, int bonusVida, int bonusFuerza, boolean activo) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
		this.activo = activo;
	}

	public Objetos(int bonusVida, int bonusFuerza) {
		super();
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBonusVida() {
		return bonusVida;
	}

	public void setBonusVida(int bonusVida) {
		this.bonusVida = bonusVida;
	}

	public int getBonusFuerza() {
		return bonusFuerza;
	}

	public void setBonusFuerza(int bonusFuerza) {
		this.bonusFuerza = bonusFuerza;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Objetos [nombre=" + nombre + ", bonusVida=" + bonusVida + ", bonusFuerza=" + bonusFuerza + "]";
	}		
			
	}
	
	
	
	
	
	

	