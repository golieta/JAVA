package plantas;

public class Arbol extends Planta {
	 
	private String variedad;
	private String tipoTronco;
	private double radioTronco;
	private String colorHojas;
	private String tipoHojas;

	public Arbol(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String variedad,
			String tipoTronco, double radioTronco, String colorHojas, String tipoHojas) {
		
		super(nombre, altoTallo, tieneHojas, climaIdeal);
		this.variedad = variedad;
		this.tipoTronco = tipoTronco;
		this.radioTronco = radioTronco;
		this.colorHojas = colorHojas;
		this.tipoHojas = tipoHojas;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getTipoTronco() {
		return tipoTronco;
	}

	public void setTipoTronco(String tipoTronco) {
		this.tipoTronco = tipoTronco;
	}

	public double getRadioTronco() {
		return radioTronco;
	}

	public void setRadioTronco(double radioTronco) {
		this.radioTronco = radioTronco;
	}

	public String getColorHojas() {
		return colorHojas;
	}

	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}

	public String getTipoHojas() {
		return tipoHojas;
	}

	public void setTipoHojas(String tipoHojas) {
		this.tipoHojas = tipoHojas;
	}
	
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }
    
    @Override
    public void fotosintesis() {
        System.out.println("Me gusta la luz");
    }


}
	
	
	