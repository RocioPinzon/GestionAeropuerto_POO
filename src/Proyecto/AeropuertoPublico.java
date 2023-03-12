package Proyecto;

public class AeropuertoPublico extends Aeropuerto {

	private double suvencion;
	
	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		
	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, Compania[] c) {
		super(nombre, ciudad, pais, c);
		
	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, double suvencion) {
		super(nombre, ciudad, pais);
		this.suvencion = suvencion;
	}

	public double getSuvencion() {
		return suvencion;
	}
	
	
	
}
 