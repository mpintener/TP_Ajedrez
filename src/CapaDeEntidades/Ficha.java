package CapaDeEntidades;

public abstract class Ficha 
{	
	private boolean estado;
	
	public enum Color{Blanco,Negro};
	
	private Posicion posicion;

	
	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
