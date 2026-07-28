package plantas;

public abstract class Planta {

    private String nombre; //nombre de tipo string
    private double altoTallo; // de tipo double
    private boolean tieneHojas; //de tipo booleano
    private String climaIdeal; //de tipo string

    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
		this.nombre = nombre;
		this.altoTallo = altoTallo;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltoTallo() {
		return altoTallo;
	}

	public void setAltoTallo(double altoTallo) {
		this.altoTallo = altoTallo;
	}

	public boolean isTieneHojas() {
		return tieneHojas;
	}

	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	public String getClimaIdeal() {
		return climaIdeal;
	}

	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	} 
   
	public abstract void decirLoQueSoy(); //declarar el método abstracto
	
	public abstract void fotosintesis();
}

    
    

