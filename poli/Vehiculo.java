package poli;

//definicion de la clase vehiculo es la clase PADRE
public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//crear el constructor
	public  Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		
	}
	//método getters 
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String mostrarDatos() //no es tipo void
	{
		return "Matricula: " + getMatricula()+ " Marca: " +getMarca() + " Modelo: " +getModelo();
	}
	
}
	


