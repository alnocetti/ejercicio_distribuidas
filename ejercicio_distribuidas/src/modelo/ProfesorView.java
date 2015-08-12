package modelo;

import java.util.Vector;

public class ProfesorView {
	//atributos
		private int numeroLegajo;
		private DireccionView direccion;
		private Vector<MateriaView> materias;
		
		//constructor
		public ProfesorView(int numeroLegajo, DireccionView direccion,
				Vector<MateriaView> materias) {
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

		public DireccionView getDireccion() {
			return direccion;
		}

		public void setDireccion(DireccionView direccion) {
			this.direccion = direccion;
		}

		public Vector<MateriaView> getMaterias() {
			return materias;
		}

		public void setMaterias(Vector<MateriaView> materias) {
			this.materias = materias;
		}

}
