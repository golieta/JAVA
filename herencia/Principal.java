package herencia; //pertenece al paquete herencia

public class Principal {
	public static void main(String[] args) {
		//crear un objeto de clase Estudiante
	Estudiante obj = new Estudiante("Marta", "Sanchez",50, 435678, 6.7F);
	Estudiante obj2 = new Estudiante("Pepe", "Ruiz", 40, 56786, 9.8F);
	//obj2 es otro objeto de tipo Estudiante
	obj.mostrarDatos();
	obj2.mostrarDatos();
	
}
}
