package herencia; //pertenece al mismo paquete que persona

//definir clase Estudiante
public class Estudiante extends Persona{ //CLASE Estudiante hereda de Persona
	private int codigoEstudiante; //atributos propios de Estudiante
	private float notaFinal; //atributos propios de Estudiante

//constructor dentro de su propia clase
public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
	super(nombre, apellido, edad); //estos atributos los hereda de clase Persona
	this.codigoEstudiante =codigoEstudiante; //atributo propio de la clase Estudiante
	this.notaFinal = notaFinal; //atributo propio de la clase Estudiante
//this sirve para acceder a las variables de instancia
}
//metodo sirve solo para mostrar los datos
public void mostrarDatos(){
	System.out.println("Nombre: " + getNombre()+ "\nApellido: " +getApellido() + "\nEdad: " +getEdad() + "\nCodigoEstudiante:" +codigoEstudiante + "\nNota Final " + notaFinal);
}


} //cierra la clase Estudiante



