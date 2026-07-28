package plantas;

public class Principal {

	public static void main(String[] args) {
        Arbol arbolito = new Arbol("Pino", 7.5, true, "verano", "variedad","tipoTronco", 1.0, "colorHojas", "tipoHojas");
    	
        Flor florecita = new Flor("Amapola", 1.0, true, "climaIdeal","colorPetalos", 1, "colorPistilo", "variedad", "estacionFlorece");
    	
        Arbustos arbustito = new Arbustos("zarza", 3.5, true, "climaIdeal", 1.0, true, "variedadArbusto", "colorHojas", true);
 
        arbolito.decirLoQueSoy();
        arbolito.fotosintesis();
        florecita.decirLoQueSoy();
              
        florecita.fotosintesis();
        arbustito.decirLoQueSoy();
        arbustito.fotosintesis();
        
        System.out.println("Mi nombre es " +arbolito.getNombre());
        
        System.out.println("\nMi nombre es " +florecita.getNombre());
        
        System.out.println("\nMi nombre es " +arbustito.getNombre());
        
        System.out.println("El tallo de arbol mide " +arbolito.getAltoTallo());
        
        System.out.println("El tallo de flor mide " +florecita.getAltoTallo());
        
        System.out.println("El tallo de arbusto mide " +arbustito.getAltoTallo());
        
        

	}

}
