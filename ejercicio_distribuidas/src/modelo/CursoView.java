package modelo;

import java.util.Vector;

public class CursoView {
	//atributos
	private int numeroCurso;
	private MateriaView materia;
	private ProfesorView profesor;
	private Vector<AlumnoView> alumnos;
	private int cantidadMaxima;
	
	//constructor
	public CursoView(int numeroCurso, MateriaView materia, ProfesorView profesor,
			Vector<AlumnoView> alumnos, int cantidadMaxima) {
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

	public MateriaView getMateria() {
		return materia;
	}

	public void setMateria(MateriaView materia) {
		this.materia = materia;
	}

	public ProfesorView getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorView profesor) {
		this.profesor = profesor;
	}

	public Vector<AlumnoView> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Vector<AlumnoView> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

}
