package model;

public class Mapa {
	 
	private int x;
	private int y;
	String [][] mapaPrueba;
	
	
	public Mapa(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public String[][] getMapaPrueba() {
		return mapaPrueba;
	}


	public void setMapaPrueba(String[][] mapaPrueba) {
		this.mapaPrueba = mapaPrueba;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	

}
