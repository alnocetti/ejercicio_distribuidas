package modelo;

import java.util.Vector;

public class Curso {
	
	//atributos
	private int numeroCurso;
	private Materia materia;
	private Profesor profesor;
	private Vector<Alumno> alumnos;
	private int cantidadMaxima;
	
	//constructor
	public Curso(int numeroCurso, Materia materia, Profesor profesor,
			Vector<Alumno> alumnos, int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	
	//getters & setters
	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Vector<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Vector<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	
	
}
