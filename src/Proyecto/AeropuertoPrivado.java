package Proyecto;

public class AeropuertoPrivado extends Aeropuerto{

	
	private String listaEmpresas[] = new String[10];
	private int numEmpresas;
	
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		
	}

	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] c, String e[]) {
		super(nombre, ciudad, pais, c);
		this.listaEmpresas = e;
		this.numEmpresas = e.length;
	}

	public void insertarEmpresas(String e[]) {
		this.listaEmpresas = e;
		this.numEmpresas = e.length;
	}
	
	public void insertarEmpresa(String e) {
		this.listaEmpresas[numEmpresas] = e;
		numEmpresas++;
	}
	

	
}
