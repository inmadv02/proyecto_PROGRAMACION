package model;

import datos.DatosTasks;

public class Tasks {
	
	private String texto;
	private Tasks [] tasks;
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


	public Tasks [] getTasks() {
		return tasks;
	}


	public void setTasks(Tasks [] tasks) {
		this.tasks = DatosTasks.tasks;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	} 
	
	
	
	

}
