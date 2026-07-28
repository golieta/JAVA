package poli;

//definicion de la clase vehiculoTurismo HIJO
public class VehiculoTurismo extends Vehiculo { //hereda de la clase PADRE
		private int nPuertas;
		
			
		//crear el constructor de la clase HIJO
		public  VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
			super(matricula, marca, modelo); //estos atributos son heredados, por eso super
			this.nPuertas = nPuertas;
			
		}
		//método getters 
		public int getPuertas() {
			return nPuertas;
		}
	
		@Override //esto se pone porque el método de abajo se ha sobreescrito
		public String mostrarDatos() //no es tipo void
		{
			return "Puertas: " +getPuertas();
		}
		
	}
	
	
	
	

