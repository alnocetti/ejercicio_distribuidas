package modelo;

public class Alumno {
	
	//atributos
	private int legajo;
	private String nombre;
	private String estado;
	
	
	//constructor
	public Alumno(int legajo, String nombre, String estado) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	//getters & setters
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//Generador de AlumnoView
	public AlumnoView getView(){
		AlumnoView alumnoView = new AlumnoView(legajo, nombre, estado);
		return alumnoView;
	}

}
