package poli;

//definicion de la clase vehiculoFurgoneta HIJO
public class VehiculoFurgoneta extends Vehiculo { //hereda de la clase PADRE
		private int carga;
		
			
		//crear el constructor de la clase HIJO
		public  VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
			super(matricula, marca, modelo); //estos atributos son heredados, por eso super
			this.carga = carga;
			
		}
		//método getters 
		public int getCarga() {
			return carga;
		}
	
		@Override //esto se pone porque el método de abajo se ha sobreescrito
		public String mostrarDatos() //no es tipo void
		{
			return "Carga: " +getCarga();
		}
		
	}


