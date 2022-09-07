package ar.edu.unq.poo2.tp3.Ej11;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> conjuntoDeIntegrantes;
	
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.conjuntoDeIntegrantes = new ArrayList<Persona>();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	public void aregarAlEquipo(Persona persona) {
		this.conjuntoDeIntegrantes.add(persona);
	}
	
	
	public Integer edadPromedia() {
		Integer edadPromedia = 0;
		
		for (Persona persona:this.conjuntoDeIntegrantes)
			edadPromedia += persona.getEdad();
		
		return edadPromedia / this.conjuntoDeIntegrantes.size();
	}
	
	
	
}
