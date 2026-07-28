package poli;

	//definición de la clase vehiculoDeportivo HIJO
	public class VehiculoDeportivo extends Vehiculo { //hereda de la clase PADRE
			private int cilindrada;
			
			//crear el constructor de la clase HIJO
			public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
				super(matricula, marca, modelo); //estos atributos son heredados, por eso super
				this.cilindrada = cilindrada;
				
			}
			//método getters 
			public int getCilindrada() {
				return cilindrada;
			}
		
			@Override //esto se pone porque el método de abajo se ha sobreescrito
			public String mostrarDatos() //no es tipo void
			{
				return ("Cilindrada: " +getCilindrada());
			}
			
		}