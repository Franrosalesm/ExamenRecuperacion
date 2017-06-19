package models;

import java.util.Date;

import javax.swing.JTextField;

//Clase pokemons
public class Pokemon {
	 
	
	//Atributos
	protected String Nombre;
	protected Double Numero;
	protected int nivelevolucion;
	protected String Region;
	protected String Comentarios;
	protected String tipo;
	
	
	
	//Constructor
	public Pokemon(String nombre, Double numero, int nivelevolucion, String Region, String Comentarios, String tipo) {
		this.Nombre = nombre;
		this.Numero = numero;
		this.nivelevolucion = nivelevolucion;
		this.Region=Region;
		this.Comentarios= Comentarios;
		this.tipo = tipo;
	}


	//Propiedades. Getters and setters
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getComentarios() {
		return Comentarios;
	}



	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}



	public String getRegion() {
		return Region;
	}


	public void setRegion(String region) {
		Region = region;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public Double getNumero() {
		return Numero;
	}


	public void setNumero(Double numero) {
		Numero = numero;
	}


	public int getNivelevolucion() {
		return nivelevolucion;
	}



	public void setNivelevolucion(int nivelevolucion) {
		this.nivelevolucion = nivelevolucion;
	}



	public void setNivelevolucion(JTextField textField_2) {
		// TODO Auto-generated method stub
		
	}



	public void setNumero(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setNumero(JTextField textField_1) {
		// TODO Auto-generated method stub
		
	}


	



	
	
	
	
	
	

}
