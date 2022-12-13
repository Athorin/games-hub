package org.fran.azorin.gamehub.conway.modelo;

import org.fran.azorin.gamehub.conway.modelo.excepciones.ExcepcionArgumentosIncorrectos;
import org.fran.azorin.gamehub.conway.modelo.excepciones.ExcepcionCoordenadaIncorrecta;

/**
 * Clase Abstracta Coordenada
 * @author fran
 *
 */
public abstract class Coordenada {
	
	/**
	 * Constructor
	 */
	public Coordenada() {
		
	}
	
	/**
	 * Metodo abstracto
	 * @throws ExcepcionArgumentosIncorrectos
	 * @throws ExcepcionCoordenadaIncorrecta 
	 */
	public abstract Coordenada suma(Coordenada c) throws ExcepcionArgumentosIncorrectos, ExcepcionCoordenadaIncorrecta;
	
}
