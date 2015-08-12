package modelo;

import java.util.Vector;

public class Profesor {

	//atributos
	private int numeroLegajo;
	private Direccion direccion;
	private Vector<Materia> materias;
	
	//constructor
	public Profesor(int numeroLegajo, Direccion direccion,
			Vector<Materia> materias) {
		super();
		this.numeroLegajo = numeroLegajo;
		this.direccion = direccion;
		this.materias = materias;
	}
	
	//getters & setters
	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Vector<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Vector<Materia> materias) {
		this.materias = materias;
	}
	
	
	
}
