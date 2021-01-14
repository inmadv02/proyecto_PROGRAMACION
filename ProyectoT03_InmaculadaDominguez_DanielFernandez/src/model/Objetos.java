package model;

public class Objetos {
	
	private String nombre;
	private double bonusVida;
	private double bonusFuerza;
	//private double bonusEnergia;
	
	
	public Objetos(String nombre, double bonusVida, double bonusFuerza) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getBonusVida() {
		return bonusVida;
	}


	public void setBonusVida(double bonusVida) {
		this.bonusVida = bonusVida;
	}


	public double getBonusFuerza() {
		return bonusFuerza;
	}


	public void setBonusFuerza(double bonusFuerza) {
		this.bonusFuerza = bonusFuerza;
	}
	
	

}
