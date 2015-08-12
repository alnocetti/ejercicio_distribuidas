package controlador;

import java.util.Vector;

import modelo.Alumno;
import modelo.Curso;
import modelo.Direccion;
import modelo.Materia;
import modelo.Profesor;

public class Negocio {
	//Vectores donde se almacenan las clases en el controlador
	private Vector<Alumno> alumnos;
	private Vector<Curso> cursos;
	private Vector<Direccion> direcciones;
	private Vector<Materia> materias;
	private Vector<Profesor> profesores;
	
	//constructor
	public Negocio(Vector<Alumno> alumnos, Vector<Curso> cursos,
			Vector<Direccion> direcciones, Vector<Materia> materias,
			Vector<Profesor> profesores) {
		super();
		this.alumnos = alumnos;
		this.cursos = cursos;
		this.direcciones = direcciones;
		this.materias = materias;
		this.profesores = profesores;
	}
	
	//getters

	public Vector<Alumno> getAlumnos() {
		return alumnos;
	}

	public Vector<Curso> getCursos() {
		return cursos;
	}

	public Vector<Direccion> getDirecciones() {
		return direcciones;
	}

	public Vector<Materia> getMaterias() {
		return materias;
	}

	public Vector<Profesor> getProfesores() {
		return profesores;
	}
	
	
	
}
