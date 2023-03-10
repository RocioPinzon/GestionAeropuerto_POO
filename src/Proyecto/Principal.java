package Proyecto;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);
	final static int numAeropuertos = 4;
	static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];

	public static void main(String[] args) {

		// Insertar datos de los aeropuertos

		insertarDatosAeropuertos(aeropuertos);
		menu();
		
	}
	
	public static void insertarDatosAeropuertos(Aeropuerto aero[]) {

		//Aerpuerto BARAJAS
		aero[0]  = new AeropuertoPublico(80000000, "Barajas", "Madrid", "Espa?a");

		aero[0].insertarCompania(new Compania("AirImper"));
		aero[0].insertarCompania(new Compania("Air Flights"));

		aero[0].getCompania("AirImper").insertarVuelo(new Vuelo("AI01", "Madrid", "Panama", 1500.45, 125));
		aero[0].getCompania("AirImper").insertarVuelo(new Vuelo("AI02", "Madrid", "Asturias", 25, 50));
		
		aero[0].getCompania("Air Flights").insertarVuelo(new Vuelo("AF01", "Madrid", "Berlin", 75, 80));
		aero[0].getCompania("Air Flights").insertarVuelo(new Vuelo("AF02", "Madrid", "Paris", 75, 80));

		aero[0].getCompania("AirImper").getVuelo("AI01").insertarPasajero(new Pasajero("Rocio", "123456F", "Espa?ola"));
		aero[0].getCompania("AirImper").getVuelo("AI02").insertarPasajero(new Pasajero("Sergio", "546545G", "Espa?ola"));
		
		aero[0].getCompania("Air Flights").getVuelo("AF01").insertarPasajero(new Pasajero("Lydia", "EW87F575", "Alemana"));
		aero[0].getCompania("Air Flights").getVuelo("AF01").insertarPasajero(new Pasajero("Lydia", "EW87F575", "Alemana"));

		//Aerpuerto TOCUMEN
		
		aero[1]  = new AeropuertoPublico(70000000, "Tocumen", "Panama", "Panama");

		aero[1].insertarCompania(new Compania("Air High"));
		aero[1].insertarCompania(new Compania("Air Panama"));

		aero[1].getCompania("Air High").insertarVuelo(new Vuelo("AH01", "Panama", "Bocas del Toro", 1500.45, 125));
		aero[1].getCompania("Air High").insertarVuelo(new Vuelo("AH02", "Panama", "Bogot?", 25, 50));
		
		aero[1].getCompania("Air Panama").insertarVuelo(new Vuelo("AP01", "Panama", "Ciudad de Mexico", 75, 80));
		aero[1].getCompania("Air Panama").insertarVuelo(new Vuelo("AP02", "Panama", "Bogot?", 75, 80));

		aero[1].getCompania("Air High").getVuelo("AH01").insertarPasajero(new Pasajero("Pedro", "156464D", "Paname?a"));
		aero[1].getCompania("Air High").getVuelo("AH02").insertarPasajero(new Pasajero("Maria", "784564S", "Colombiana"));
		
		aero[1].getCompania("Air Panama").getVuelo("AP01").insertarPasajero(new Pasajero("Susana", "EW68541C", "Paname?a"));
		aero[1].getCompania("Air Panama").getVuelo("AP02").insertarPasajero(new Pasajero("Jose", "89d585D", "Colombiana"));
		
		//Aerpuerto PERU
		
		aero[2]  = new AeropuertoPublico(60000000, "Jorge Chavez", "Lima", "Peru");

		aero[2].insertarCompania(new Compania("AeroPeru"));
		aero[2].insertarCompania(new Compania("LATAM"));

		aero[2].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Buenos Aires", 180.99, 120));
		aero[2].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Ciudad de Mexico", 150.90, 150));
		aero[2].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Ciudad de Mexico", 78.90, 100));

		aero[2].getCompania("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[2].getCompania("LATAM").insertarVuelo(new Vuelo("FC13", "Lima", "Berlin", 700.41, 180));

		aero[2].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "484531R", "Peruano"));
		aero[2].getCompania("AeroPeru").getVuelo("IB21").insertarPasajero(new Pasajero("Marc", "789213W", "Mexicano"));
				
		aero[2].getCompania("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "8965456Y", "Peruano"));
		aero[2].getCompania("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Seul", "56453SDF", "Peruano"));
		aero[2].getCompania("LATAM").getVuelo("FC13").insertarPasajero(new Pasajero("Marina", "454564H", "Alemana"));
		
		
		
		//Aerpuerto PERU
		
		aero[3]  = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "Espa?a");

		aero[3].insertarCompania(new Compania("AirEuropa"));
		String empresas[] = {"CobreSol", "Airmar"};
		((AeropuertoPrivado) aero[3]).insertarEmpresas(empresas);
		aero[3].getCompania("AirEuropa").insertarVuelo(new Vuelo("AE40", "Ciudad Real", "Madrid", 45.5, 50));
		aero[3].getCompania("AirEuropa").getVuelo("AE40").insertarPasajero(new Pasajero("Marta", "4684563I", "Espa?ola"));
	}
	
	public static void menu() {
		
		String nombreAeropuerto, nombreCompania, origen,  destino;
		int opcion;
		Aeropuerto aeropuerto;
		Compania compania;
		
		do{
			System.out.print("\t .: MENU :.");
			System.out.print("\n1. Ver aeropuertos (Publicos o Privados)");
			System.out.print("\n2. Ver empresas(Privado) o subvencion(Publico)");
			System.out.print("\n3. Lista compa?ias de un aeropuerto");
			System.out.print("\n4. Lista de vuelos por compa?ia");
			System.out.print("\n5. Listar posibles vuelos de Origen y Destino");
			System.out.print("\n6. Salir");
			
			System.out.print("\nOpcion: ");

			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1: // Ver aeropuertos (Publicos o Privados)
				System.out.print("");
				mostrarDatosAeropuertos(aeropuertos);
				
				break;
			case 2: // 	Ver empresas(Privado) o subvencion(Publico)
				System.out.print("");
				mostrarPatrocinador(aeropuertos);
				break;
			case 3: // 	Lista compa?ias de un aeropuerto
				
				entrada.nextLine();
				System.out.println("\nDigite el nombre del aeropuerto: ");
				nombreAeropuerto = entrada.nextLine();
				
				aeropuerto = buscadorAeropuerto(nombreAeropuerto, aeropuertos);
				
				if(aeropuerto==null) {
					System.out.println("El aeropuerto no existe.");

				}else {					
					mostrarCompanias(aeropuerto);
				}
				
				break;
			case 4: // 	Lista de vuelos por compa?ia
				entrada.nextLine();
				System.out.println("\nDigite el nombre del aeropuerto");

				nombreAeropuerto = entrada.nextLine();
				aeropuerto = buscadorAeropuerto(nombreAeropuerto, aeropuertos);

				if(aeropuerto==null) {
					System.out.println("El aeropuerto no existe.");

				}else {
					System.out.println("\nDigite el nombre de la compa?ia");
					nombreCompania = entrada.nextLine();
					
					compania = aeropuerto.getCompania(nombreCompania);
					mostrarVuelos(compania);

				}
				break;
				
			case 5: // 	Listar posibles vuelos de Origen y Destino
				
				entrada.nextLine();
				System.out.println("\nDigite ciudad origen");
				origen = entrada.nextLine();
				
				System.out.println("\nDigite ciudad destino");
				destino = entrada.nextLine();

				mostrarVueloOrigenDestino(origen, destino, aeropuertos);
				break;
				
			case 6: // 	Salir
				break;
				
			default:
				System.out.print("");
				System.out.print("Opcion de men? no v?lida. Pruebe con las opciones del 1 al 6.\n");
				break;
			}
		}while(opcion!=6);
		
		}
	
		public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
			
			for (int i = 0; i < aeropuertos.length; i++) {

				if(aeropuertos[i] instanceof AeropuertoPrivado) {
					System.out.print("\n || Aeropuerto Privado ||");
					System.out.print("\nNombre: " + aeropuertos[i].getNombre());
					System.out.print("\nCiudad: " + aeropuertos[i].getCiudad());
					System.out.print("\nPais: " + aeropuertos[i].getPais());
					System.out.print("\n");
				}else {
					
					System.out.print("\n || Aeropuerto Publico || ");
					System.out.print("\nNombre: " + aeropuertos[i].getNombre());
					System.out.print("\nCiudad: " + aeropuertos[i].getCiudad());
					System.out.print("\nPais: " + aeropuertos[i].getPais());
					System.out.print("\n");
				}
				System.out.print("");
				System.out.print("\n");

			}
		
		}
		
		public static void mostrarPatrocinador(Aeropuerto aeropuertos[]) {
			
			String empresas[];
			
			for (int i = 0; i < aeropuertos.length; i++) {

				if(aeropuertos[i] instanceof AeropuertoPrivado) {
					System.out.println("Aeropuerto Privado '" + aeropuertos[i].getNombre()+ "'");
					empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
					
					System.out.println("Empresas");

					for (int j = 0; j < empresas.length; j++) {
						System.out.println(" - " + empresas[j]);

					}
				}else {
					System.out.println("Aeropuerto Privado '" + aeropuertos[i].getNombre()+ "'");
					System.out.println("Suvencion " + ((AeropuertoPublico)aeropuertos[i]).getSuvencion());

					
				}
				System.out.println("");

			}
		
		}
		
		public static Aeropuerto buscadorAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
		
			boolean encontrado = false;
			int i = 0;
			Aeropuerto aero = null;
			
			while ((!encontrado)&& (i<aeropuertos.length)) {
				if(nombre.equals(aeropuertos[i].getNombre())) {
					encontrado=true;
					aero = aeropuertos[i];
				}
				i++;
			}
			
			return aero;
		}
	
		public static void mostrarCompanias(Aeropuerto aeropuerto) {
			System.out.println("Las compa?ias del aeropuerto: " + aeropuerto.getNombre());

			for (int i = 0; i < aeropuerto.getNumCompanias(); i++) {
				System.out.println(aeropuerto.getCompania(i).getNombre());

			}
			
		}
		
		public static void mostrarVuelos(Compania compania) {

			Vuelo vuelo;
			System.out.println("Las compa?ias del aeropuerto: " + compania.getNombre());

			for (int i = 0; i < compania.getNumVuelo(); i++) {
				vuelo = compania.getVuelo(i);
				System.out.println("");
				System.out.println("Identidicador: " + vuelo.getIdentificador());
				System.out.println("Ciudad Origen: " + vuelo.getCiudadOrigen());
				System.out.println("Ciudad Destino: " + vuelo.getCiudadDestino());
				System.out.println("Precio: $ " + vuelo.getPrecio());

			}
			System.out.println("");

		}
		
		public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
			
			Vuelo vuelo;
			int contador = 0;
			Vuelo listaVuelos[];
			
			for (int i = 0; i < aeropuertos.length; i++) { // Recorremos aeropuertos
				for (int j = 0; j < aeropuertos[i].getNumCompanias(); j++) {// Recorremos compa?ias
					for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) { // Recorremos los vuelos
						vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
						if(origen.equals(vuelo.getCiudadOrigen())&& destino.equals(vuelo.getCiudadDestino())) {
							contador++;
						}
					}
				}
			}
			
			listaVuelos = new Vuelo[contador];
			int q = 0;
			
			for (int i = 0; i < aeropuertos.length; i++) { // Recorremos aeropuertos
				for (int j = 0; j < aeropuertos[i].getNumCompanias(); j++) {// Recorremos compa?ias
					for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) { // Recorremos los vuelos
						vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
						if(origen.equals(vuelo.getCiudadOrigen())&& destino.equals(vuelo.getCiudadDestino())) {
							listaVuelos[q] = vuelo;
							q++;
						}
					}
				}
			}

			
			return listaVuelos;

			
			
		}
		
		public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
			
			Vuelo vuelos[];
			
			vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
			if(vuelos.length==0) {
				System.out.println("No existen vuelos de esas ciudad origen a destino");

			}else {
				System.out.println("Vuelos encontrados");
				for (int i = 0; i < vuelos.length; i++) {
					System.out.println("Identificador: " + vuelos[i].getIdentificador());
					System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
					System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
					System.out.println("Precio $" + vuelos[i].getPrecio());
					System.out.println("");
					
				}

			}
			
		}
	}

	






