package Proyecto;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String pais;
	private Compania listaCompanias[] = new Compania[10];
	private int numCompanias;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompanias = 0;

	}

	public Aeropuerto(String nombre, String ciudad, String pais, Compania c[]) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompanias = c;
		this.numCompanias = c.length;
	}
	
	
	public void insertarCompania(Compania compania) {
		listaCompanias[numCompanias] = compania;
		numCompanias++;
	}
	
	public Compania getCompania(int i) {
		
		return listaCompanias[i];
	}

	public Compania getCompania(String nombre) {
		
		boolean encontrado =false;
		int i = 0;
		Compania c = null;
		
		while ((!encontrado)&&(i<listaCompanias.length)) {
			if(nombre.equals(listaCompanias[i].getNombre())) {
				encontrado = true;
				c = listaCompanias[i];
			}
			i++;
		}
		return c;
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public String getPais() {
		return pais;
	}


	public int getNumCompanias() {
		return numCompanias;
	}


	public Compania[] getListaCompanias() {
		return listaCompanias;
	}	
	
}
