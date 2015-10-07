package CapaDeNegocio;

import CapaDeEntidades.Jugador;

import org.omg.CORBA.portable.ApplicationException;

import CapaDeDatos.DataAjedrez;

public class CtrlAjedrez {
	
	private DataAjedrez catalogo;
	
	public CtrlAjedrez(){
		catalogo = new DataAjedrez();
	}

	public void save(Jugador j) throws ApplicationException {
		if (catalogo.getByDni(j.getDni())== null){
			catalogo.add(j);
		} else {
			catalogo.update(j);
		}
	}
	
	public Jugador getByDni(String dni){
		return catalogo.getByDni(dni);
	}

}
