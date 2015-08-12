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
	
	//Generador de ProfesorView
	public ProfesorView getView(){
		Vector<MateriaView>materiasView = new Vector<MateriaView>();
		for (Materia materia : materias) {
			materiasView.add(materia.getView());
		}
		ProfesorView profesorView = new ProfesorView(numeroLegajo, direccion.getView(), materiasView);
		return profesorView;
	}
	
	//Agregar materia al vector de materias
	public void agregarMateria(Materia materia){
		for (Materia m : materias) {
			if(m.getNumero().equals(materia.getNumero())){
				return;
			}else{
				materias.add(m);
			}
		}
		return;
	}
	//Eliminar materia del vector de materias
	public void eliminarMateria(Materia materia){
		for (Materia m : materias) {
			if(m.getNumero().equals(materia.getNumero())){
				materias.remove(m);
				return;
			}
		}
		return;
	}
	
	
}
