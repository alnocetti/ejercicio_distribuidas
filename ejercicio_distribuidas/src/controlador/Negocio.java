package controlador;

import java.util.Vector;

import modelo.Alumno;
import modelo.AlumnoView;
import modelo.Curso;
import modelo.CursoView;
import modelo.Direccion;
import modelo.Materia;
import modelo.MateriaView;
import modelo.Profesor;
import modelo.ProfesorView;

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
	
	//Agregar alumno al sistema
	public void agregarAlumno(AlumnoView alumno){
		Alumno nuevo = new Alumno(alumno.getLegajo(), alumno.getNombre(), alumno.getEstado());
		alumnos.add(nuevo);
		return;
	}
	
	//Agregar materia al sistema
	public void agregarMateria (MateriaView materia){
		Materia nueva = new Materia (materia.getNumero(), materia.getNombre());
		materias.add(nueva);
		return;
	}
	
	//Agregar profesor al sistema
	public void agregarProfesor (ProfesorView profesor){
		Vector<Materia> materias = new Vector<Materia>();
		for (MateriaView materiaView : profesor.getMaterias()) {
			Materia materia = new Materia (materiaView.getNumero(), materiaView.getNombre());
			materias.add(materia);
		}
		Direccion direccion = new Direccion (profesor.getDireccion().getCalle(), profesor.getDireccion().getNumero(), profesor.getDireccion().getCp(), profesor.getDireccion().getLocalidad(),profesor.getDireccion().getPiso(), profesor.getDireccion().getDepto());
		Profesor nuevo = new Profesor(profesor.getNumeroLegajo(), direccion, materias);
		profesores.add(nuevo);
	}
	
	//Buscar alumno en el sistema
	public Alumno buscarAlumno (int legajo){
		for (Alumno alumno : alumnos) {
			if (alumno.getLegajo() == legajo)
				return alumno;
		}
		return null;
	}
	
	//Buscar alumno por legajo, devuelve alumno vista
	public AlumnoView obtenerAlumnoPorLegajo (int legajo){
		for (Alumno alumno : alumnos) {
			if(alumno.getLegajo() == legajo)
				return alumno.getView();
		}
		return null;
	}
	
	//Eliminar alumno del sistema
	public void eliminarAlumno (AlumnoView alumno){
		//Acá elimino al alumno de todos los cursos en los que está inscripto
		for (Curso curso : cursos) {
			for (Alumno alumnoCurso : curso.getAlumnos()) {
				if(alumnoCurso.getLegajo() == alumno.getLegajo())
					curso.eliminarAlumno(alumnoCurso);
			}
		}
		//Acá elimino al alumno del sistema
		Alumno buscado = buscarAlumno (alumno.getLegajo());
		if (buscado == null)
			return;
		else
			alumnos.remove(buscado);
	}
	
	//Buscar curso en el sistema
	public Curso buscarCurso (int numeroCurso){
		for (Curso curso : cursos) {
			if(curso.getNumeroCurso() == numeroCurso)
				return curso;
		}
		return null;
	}
	
	//Buscar curso por numero, devuelve Curso vista
	public CursoView obtenerCursoPorNumero(int numero){
		for (Curso curso : cursos) {
			if (curso.getNumeroCurso() == numero)
				return curso.getView();
		}
		return null;
	}
	
	//Eliminar curso del sistema
	public void eliminarCurso(CursoView curso){
		Curso buscado = buscarCurso(curso.getNumeroCurso());
		if(buscado == null)
			return;
		else
			cursos.remove(buscado);
	}
	
	//Buscar materia en el sistema
	public Materia buscarMateria (String numero){
		for (Materia materia : materias) {
			if(materia.getNumero().equals(numero))
				return materia;
		}
		return null;
	}
	
	//Buscar materia por numero, devuelve materia vista
	public MateriaView obtenerMateriaPorNumero(String numero){
		for (Materia materia : materias) {
			if (materia.getNumero().equals(numero))
				return materia.getView();
		}
		return null;
	}
	
	//Eliminar materia del sistema
	public void eliminarMateria (MateriaView materia){
		//Acá elimino la materia de todos los profesores
		for (Profesor profesor : profesores) {
			for (Materia materiaProfesor : profesor.getMaterias()) {
				if(materiaProfesor.getNumero().equals(materia.getNumero()))
					profesor.eliminarMateria(materiaProfesor);
			}
		}
		//Acá elimino la materia del sistema
		Materia buscada = buscarMateria(materia.getNumero());
		if (buscada == null)
			return;
		else
			materias.remove(buscada);
	}
	
	//Buscar profesor en el sistema 
	public Profesor buscarProfesor(int numeroLegajo){
		for (Profesor profesor : profesores) {
			if (profesor.getNumeroLegajo() == numeroLegajo)
				return profesor;
		}
		return null;
	}
	
	//Buscar profesor por legajo, devuelve profesor vista
	public ProfesorView obtenerProfesorPorLegajo(int legajo){
		for (Profesor profesor : profesores) {
			if(profesor.getNumeroLegajo() == legajo)
				return profesor.getView();
		}
		return null;
	}
	
	//Eliminar profesor del sistema
	public void eliminarProfesor(ProfesorView profesor){
		Profesor buscado = buscarProfesor(profesor.getNumeroLegajo());
		if (buscado == null)
			return;
		else
			profesores.remove(buscado);
	}
	
	//Obener todos los alumnos del sistema
	public Vector<AlumnoView> obtenerAlumnos(){
		Vector<AlumnoView> alumnosView = new Vector<AlumnoView>();
		for (Alumno alumno : alumnos) {
			alumnosView.add(alumno.getView());
		}
		return alumnosView;
	}
	
	//Obener todos los cursos del sistema
		public Vector<CursoView> obtenerCursos(){
			Vector<CursoView> cursosView = new Vector<CursoView>();
			for (Curso curso : cursos) {
				cursosView.add(curso.getView());
			}
			return cursosView;
	}
	
	//Obtener todas las materias del sistema
		public Vector<MateriaView> obtenerMaterias(){
			Vector<MateriaView> materiasView = new Vector<MateriaView>();
			for (Materia materia : materias) {
				materiasView.add(materia.getView());
			}
			return materiasView;
		}
	
	//Obtener todos los profesores del sistema
		public Vector<ProfesorView> obtenerProfesores(){
		Vector<ProfesorView> profesoresView = new Vector<ProfesorView>();
		for (Profesor profesor : profesores) {
			profesoresView.add(profesor.getView());
			}
		return profesoresView;
		}
		
	//Generar nuevo curso
		public void nuevoCurso(MateriaView materiaView, ProfesorView profesorView, int cantidadMaxima){
			Materia materia = buscarMateria(materiaView.getNumero());
			Profesor profesor = buscarProfesor(profesorView.getNumeroLegajo());
			Curso curso = new Curso(materia, profesor, cantidadMaxima);
			cursos.add(curso);
		}
	
	//Asignar materia a profesor
		public void asignarMateriaAProfesor(MateriaView materiaView, ProfesorView profesorView){
			Profesor profesor = buscarProfesor(profesorView.getNumeroLegajo());
			Materia materia = buscarMateria(materiaView.getNumero());
			profesor.agregarMateria(materia);
			return;
		}
		
	//Asignar alumno a curso
		public void asignarAlumnoACurso(AlumnoView alumnoView, CursoView cursoView){
			Alumno alumno = buscarAlumno(alumnoView.getLegajo());
			Curso curso = buscarCurso(cursoView.getNumeroCurso());
			curso.agregarAlumno(alumno);
			return;
		}
		
	//Eliminar alumno de un curso
		public void eliminarAlumnoDeCurso(AlumnoView alumnoView, CursoView cursoView){
			Alumno alumno = buscarAlumno(alumnoView.getLegajo());
			Curso curso = buscarCurso(cursoView.getNumeroCurso());
			curso.eliminarAlumno(alumno);
			return;
		}
		
		
}
