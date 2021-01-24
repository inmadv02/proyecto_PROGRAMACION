package model;

import java.util.Arrays;

import datos.DatosTasks;

public class Tasks {
	
	private String texto;
	private boolean activo;
	
	
	public Tasks(String texto, boolean activo) {
		super();
		this.texto = texto;
		this.activo = activo;
		
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String toString() {
		return texto ;
	} 
	
	
	
	
	
	

}
