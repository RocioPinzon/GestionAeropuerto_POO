package Proyecto;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);
	final static int numAeropuertos = 4;
	static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];

	public static void main(String[] args) {

		// Insertar datos de los aeropuertos

		
	}
	
	public static void insertarDatosAeropuertos(Aeropuerto aero[]) {

		//Aerpuerto BARAJAS
		aero[0]  = new AeropuertoPublico(80000000, "Barajas", "Madrid", "España");

		aero[0].insertarCompania(new Compania("AirImper"));
		aero[0].insertarCompania(new Compania("Air Flights"));

		aero[0].getCompania("AirImper").insertarVuelo(new Vuelo("AI01", "Madrid", "Panama", 1500.45, 125));
		aero[0].getCompania("AirImper").insertarVuelo(new Vuelo("AI02", "Madrid", "Asturias", 25, 50));
		
		aero[0].getCompania("Air Flights").insertarVuelo(new Vuelo("AF01", "Madrid", "Berlin", 75, 80));
		aero[0].getCompania("Air Flights").insertarVuelo(new Vuelo("AF02", "Madrid", "Paris", 75, 80));

		aero[0].getCompania("AirImper").getVuelo("AI01").insertarPasajero(new Pasajero("Rocio", "123456F", "Española"));
		aero[0].getCompania("AirImper").getVuelo("AF02").insertarPasajero(new Pasajero("Sergio", "546545G", "Española"));
		
		aero[0].getCompania("Air Flights").getVuelo("AF01").insertarPasajero(new Pasajero("Lydia", "EW87F575", "Alemana"));
		aero[0].getCompania("Air Flights").getVuelo("AF01").insertarPasajero(new Pasajero("Lydia", "EW87F575", "Alemana"));

		//Aerpuerto TOCUMEN
		
		aero[1]  = new AeropuertoPublico(70000000, "Tocumen", "Panama", "Panama");

		aero[1].insertarCompania(new Compania("Air High"));
		aero[1].insertarCompania(new Compania("Air Panama"));

		aero[1].getCompania("Air High").insertarVuelo(new Vuelo("AH01", "Panama", "Bocas del Toro", 1500.45, 125));
		aero[1].getCompania("Air High").insertarVuelo(new Vuelo("AH02", "Panama", "Bogotá", 25, 50));
		
		aero[1].getCompania("Air Panama").insertarVuelo(new Vuelo("AP01", "Panama", "Ciudad de Mexico", 75, 80));
		aero[1].getCompania("Air Panama").insertarVuelo(new Vuelo("AP02", "Panama", "Bogotá", 75, 80));

		aero[1].getCompania("Air High").getVuelo("AH01").insertarPasajero(new Pasajero("Pedro", "156464D", "Panameña"));
		aero[1].getCompania("Air High").getVuelo("AH02").insertarPasajero(new Pasajero("Maria", "784564S", "Colombiana"));
		
		aero[1].getCompania("Air Panama").getVuelo("AP01").insertarPasajero(new Pasajero("Susana", "EW68541C", "Panameña"));
		aero[1].getCompania("Air Panama").getVuelo("AP02").insertarPasajero(new Pasajero("Jose", "89d585D", "Colombiana"));
		
		//Aerpuerto PERU
		
		aero[2]  = new AeropuertoPublico(60000000, "Jorge Chavez", "Lima", "Peru");

		aero[2].insertarCompania(new Compania("AeroPeru"));
		aero[2].insertarCompania(new Compania("LATAM"));

		aero[2].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Buenos Aires", 180.99, 120));
		aero[2].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Ciudad de Mexico", 150.90, 150));
				
		aero[2].getCompania("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[2].getCompania("LATAM").insertarVuelo(new Vuelo("FC13", "Lima", "Berlin", 700.41, 180));

		aero[2].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "484531R", "Peruano"));
		aero[2].getCompania("AeroPeru").getVuelo("IB21").insertarPasajero(new Pasajero("Marc", "789213W", "Mexicano"));
				
		aero[2].getCompania("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "8965456Y", "Peruano"));
		aero[2].getCompania("LATAM").getVuelo("FC13").insertarPasajero(new Pasajero("Marina", "454564H", "Alemana"));
		
	}

}
