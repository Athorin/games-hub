package org.fran.azorin.gamehub.games.conway.modelo;

import org.fran.azorin.gamehub.games.conway.modelo.excepciones.ExcepcionArgumentosIncorrectos;
import org.fran.azorin.gamehub.games.conway.modelo.excepciones.ExcepcionCoordenadaIncorrecta;
import org.fran.azorin.gamehub.games.conway.modelo.excepciones.ExcepcionEjecucion;
import org.fran.azorin.gamehub.games.conway.modelo.excepciones.ExcepcionPosicionFueraTablero;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Clase Tablero de 2 Dimensiones
 * @author fran
 *
 */
public abstract class Tablero2D extends Tablero {


	/**
	 * Constructor de Tableros 2D
	 * @param ancho Ancho del Tablero
	 * @param alto Alto del Tablero
	 * @throws ExcepcionArgumentosIncorrectos
	 * @throws ExcepcionCoordenadaIncorrecta
	 */
	public Tablero2D(int ancho, int alto) throws ExcepcionArgumentosIncorrectos, ExcepcionCoordenadaIncorrecta {
		
		super(new Coordenada2D(ancho, alto));
		
		Coordenada2D dim = (Coordenada2D) dimensiones;
		
			this.celdas = new HashMap<Coordenada,EstadoCelda>();
			
			for(int y = 0; y < dim.getY(); y++){
				
				for(int x = 0; x < dim.getX(); x++){
					
					try {
						  celdas.put(new Coordenada2D(x, y), EstadoCelda.MUERTA);
					} catch (ExcepcionCoordenadaIncorrecta e) {
						  throw new ExcepcionEjecucion(e);
					} 
				}
			}
		
		
	}

	/**
	 * Metodo Abstracto heredado de Tablero
	 */
	@Override
	public abstract ArrayList<Coordenada> getPosicionesVecinasCCW(Coordenada posicion) throws ExcepcionPosicionFueraTablero;




}
