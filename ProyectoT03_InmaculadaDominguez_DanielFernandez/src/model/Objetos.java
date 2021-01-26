package model;

public class Objetos {
	
	private String nombre;
	private int bonusVida;
	private int bonusFuerza;
	private boolean activo;
	private int posI;
	private int posJ;
	private String efecto;
	
	public Objetos(String nombre, int bonusVida, int bonusFuerza, boolean activo) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
		this.activo = activo;
	}

	public Objetos(String nombre, int bonusVida, int bonusFuerza, boolean activo, int posI, int posJ) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
		this.activo = activo;
		this.posI = posI;
		this.posJ = posJ;
	}

	public Objetos(String nombre, int bonusVida, int bonusFuerza, boolean activo, int posI, int posJ, String efecto) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
		this.activo = activo;
		this.posI = posI;
		this.posJ = posJ;
		this.efecto = efecto;
	}

	public Objetos(String nombre, int bonusVida, int bonusFuerza, boolean activo, String efecto) {
		super();
		this.nombre = nombre;
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
		this.activo = activo;
		this.efecto = efecto;
	}

	public Objetos(int bonusVida, int bonusFuerza) {
		super();
		this.bonusVida = bonusVida;
		this.bonusFuerza = bonusFuerza;
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

	public String getEfecto() {
		return efecto;
	}

	public void setEfecto(String efecto) {
		this.efecto = efecto;
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
		return "\t \t \t       __________________________\r\n"
				+ "\t \t \t      |\t\t\t\t |\r\n"
				+ "\t \t \t      | Nombre: " + nombre + "\t |\r\n"
				+ "\t \t \t      | Vida: " + bonusVida + "\t \t\t |\r\n"
				+ "\t \t \t      | Fuerza: " + bonusFuerza + "\t \t |\r\n"
				+ "\t \t \t      |__________________________|";
	}		
			
	}
	
	
	
	
	
	

	