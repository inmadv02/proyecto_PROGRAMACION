package model;

public class Mapa {
	 
	private int x;
	private int y;
	char [][] mapaPrueba;
	
	
	public Mapa(int x, int y, char[][] mapaPrueba) {
		super();
		this.x = x;
		this.y = y;
		this.mapaPrueba = mapaPrueba;
	}


	public Mapa(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public char[][] getMapaPrueba() {
		return mapaPrueba;
	}


	public void setMapaPrueba(char[][] mapaPrueba) {
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
