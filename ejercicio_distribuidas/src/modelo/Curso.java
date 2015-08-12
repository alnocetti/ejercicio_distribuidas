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
	
	//nuevo constructos, para el metodo del sistema de nuevo curso
	public Curso(Materia materia, Profesor profesor, int cantidadMaxima){
		super();
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = null;
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
	
	//Generador de cursoView
	public CursoView getView(){
		Vector<AlumnoView> alumnosView = new Vector<AlumnoView>();
		for (Alumno alumno : alumnos) {
			alumnosView.add(alumno.getView());
		}
		CursoView cursoView = new CursoView(numeroCurso, materia.getView(), profesor.getView(),alumnosView, cantidadMaxima);
		return cursoView;
	}
	
	//Agregar alumno a curso
	public void agregarAlumno (Alumno alumno){
		for (Alumno a : alumnos) {
			if (a.getLegajo() == alumno.getLegajo()){
				return;
			}else{
				alumnos.add(a);
			}
		}
		return;
	}
	
	//Eliminar alumno de curso
	public void eliminarAlumno (Alumno alumno){
		for (Alumno a : alumnos) {
			if (a.getLegajo() == alumno.getLegajo()){
				alumnos.remove(a);
				return;
			}
		}
		return;
	}
	
	//Reasignar profesor al curso
	public void reasignarProfesor(Profesor profesor){
		if (this.profesor.getNumeroLegajo() != profesor.getNumeroLegajo())
			this.profesor = profesor;
		return;
	}
	
}
