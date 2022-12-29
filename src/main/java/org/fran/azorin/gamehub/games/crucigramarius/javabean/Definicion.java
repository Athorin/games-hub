package org.fran.azorin.gamehub.games.crucigramarius.javabean;

public class Definicion {
	
	private int codigo;
	private String definicion;
	private String solucion;
	
	public Definicion(){
		
		codigo = 0;
		definicion = new String();
		solucion = new String();
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}
	
	
}
