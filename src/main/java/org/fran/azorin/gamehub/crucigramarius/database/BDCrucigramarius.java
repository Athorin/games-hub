package database;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;


public class BDCrucigramarius {
	
	private Connection conexion;

	public BDCrucigramarius(){
		conexion = null; //conectar();
	}
	
	
	public void conectar(DataSource servConexiones) throws SQLException{
		synchronized(servConexiones){
			conexion = servConexiones.getConnection();
		}
	}
	public void desconectar() throws SQLException{
		if(conexion != null){
			conexion.close();
		}	
	}
	
	
	//NO LO UTILIZO
	//Obtiene la pregunta de la BD
	public String respuesta() throws SQLException{
		
		Statement sentenciaSQL = null;
		ResultSet datos = null;
		int code = aleatorio(consultar());
		String sql = "SELECT solucion FROM bd_crucigramarius.definiciones WHERE(codigo = "+code+")";
		String frase = new String();
		
		try{
			sentenciaSQL = conexion.createStatement();
			datos = sentenciaSQL.executeQuery(sql);
			
			datos.first();
			frase = datos.getString("solucion");
			
		}finally{
			if(datos != null) datos.close();
			if(sentenciaSQL != null) sentenciaSQL.close();
		}
		
		return frase;
		
	}
	

	
	//Obtiene TODOS los datos de la BD 
	//(NO ES APROPIADO, ENCAPSULAREMOS LOS DATOS EN UN OBJETO)
	public ArrayList contenido() throws SQLException{
		
		ArrayList<String> pregunta = new ArrayList<String>(3);
		int code = aleatorio(consultar());
		
		String sql = "SELECT * FROM bd_crucigramarius.definiciones WHERE(codigo = "+code+")";
		
		Statement sentenciaSQL = null;
		ResultSet datos = null;
		
		try{
			sentenciaSQL = conexion.createStatement();	
			datos = sentenciaSQL.executeQuery(sql);	
			
			datos.first(); 
				
			pregunta.add(datos.getString("codigo"));
			pregunta.add(datos.getString("definicion"));
			pregunta.add(datos.getString("solucion"));
			
		}finally{
			if(datos != null)datos.close();
			if(sentenciaSQL != null)sentenciaSQL.close();
		}
		
		return pregunta;
	}
	
	
	
	//Obtienes el TOTAL de preguntas
	public int consultar() throws SQLException{
		
		String sql = "SELECT * FROM bd_crucigramarius.definiciones;";
		Statement sentenciaSQL = null;
		ResultSet datos = null;
		int total = 0;
		
		try{
			sentenciaSQL = conexion.createStatement();	
			datos = sentenciaSQL.executeQuery(sql);	
			
			while(datos.next()){
				total++;
			}
		}finally{
			if(datos != null)datos.close();
			if(sentenciaSQL != null)sentenciaSQL.close();
		}
		
		return total;
	}
	
	public int aleatorio(int n) {
		
		int naleatorio;
		naleatorio = (int) (Math.random()*n)+1;
		return naleatorio;
	}
	
	
}
