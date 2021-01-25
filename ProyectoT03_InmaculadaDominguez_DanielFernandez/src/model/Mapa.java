package model;

public class Mapa {
	 
	private int x;
	private int y;
	char [][] mapa;
	

	public Mapa(int x, int y, char[][] mapa) {
		super();
		this.x = x;
		this.y = y;
		this.mapa = mapa;
	}


	public Mapa(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public char[][] getMapa() {
		return mapa;
	}


	public void setMapa(char[][] mapa) {
		this.mapa = mapa;
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
