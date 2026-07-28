package poli;

public class Principal {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0]= new Vehiculo("HZB3525", "Audi", "A8");
		misVehiculos[1]= new VehiculoTurismo(5,"LBN4034", "Toyota", "Yaris");
		misVehiculos[2]= new VehiculoDeportivo(2500, "BKH125", "Ferrari", "Rojo");
		misVehiculos[3]= new VehiculoFurgoneta(3000, "FWG4578", "Renault", "Kangoo");
		
		for(Vehiculo nuevoVehiculo: misVehiculos) {
			System.out.println(nuevoVehiculo.mostrarDatos()); 
			System.out.println(" ");
			
		}
	
	}
}
