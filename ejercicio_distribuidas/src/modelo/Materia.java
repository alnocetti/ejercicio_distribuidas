package modelo;

public class Materia {

	
	//atributos
	private String numero;
	private String nombre;
	
	//constructor
	public Materia(String numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}
	
	//getters & setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Generador de MateriaView
	public MateriaView getView(){
		MateriaView materiaView = new MateriaView(numero, nombre);
		return materiaView;
	}
}
