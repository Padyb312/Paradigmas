package co.edu.poli.contexto4.vista;

import co.edu.poli.contexto4.servicios.*;

import co.edu.poli.contexto4.modelo.*;

public class Principal {
	public static void main(String[] args) {

		// Radiacion
		Radiacion radiacion1 = new Radiacion("Gamma", 8.5, 120.0, 50.0, "Marte Sector 4", "10/02/2026", false, true,
				false, true, "Violeta", 0.9);
		Radiacion[] radiaciones1 = { radiacion1 };

		// Planeta
		Planeta planeta1 = new Planeta("P-001", "Kepler-186f", 12000.5, "17/04/2014", 4000000.0, 500.0, true,
				"Kepler-186", "Vía Láctea", 0, 1.2, 3, 70.0, 5, 200, 24.0, 130.0, 0.5, 2.0);

		// Doctor
		Doctor doctor1 = new Doctor("Dr. Smith", "Universidad Nacional", "TP-5566", "15/12/2015", "Caucásica", 'M',
				"Radiología", "NASA", 101, 2, null);

		// Hospital
		Hospital hospital1 = new Hospital(2, 850.5, "Bogotá Centro", "REG-2024-001", true, "Blanco", 200, 1.0, 150, 80,
				20, 100, 15, "Cardiología", null);

		// Astronauta
		Astronauta astronauta1 = new Astronauta("Juan", "05/06/2000", "02/03/2026", "Colombiana", "Mestizo", 'M', 1.75,
				72.0, "AST-01", "10203040", 5.2, 25.4, "Piloto", "Excelente");

		// Naves
		Nave nave1 = new Nave("Blanco", "Discovery-V", 45.0, 6, 2000.0, "Titanio", "EEUU", "12/01/2020",
				"Cabo Cañaveral", 15000.0, 10.0, 5000.0, 4500.0, 1000.0, 950.0, 1.0);
		Nave[] naves = new Nave[5];
		naves[0] = nave1;

		// Mision
		Astronauta[] astronautas1 = { astronauta1 };
		Mision mision1 = new Mision("MIS-MARS", "Tierra", "Marte", "02/03/2026", "02/03/2027", "N/A",
				"Exploración de cráteres", "Juan, Pedro, Elena", planeta1, 5000000.0, "Activa", "Gobierno Central", 4.5,
				astronautas1, naves);

		// Registro
		Registro registro1 = new Registro("REG-001", "Centro Médico Espacial", mision1, planeta1, doctor1, astronauta1,
				"10/02/2026", "08:00", "10:00", "Marte Sector 4", 120.0, true, false, 98.5, radiaciones1);

		// Traje

		TrajeExploracion traje1 = new TrajeExploracion("Kevlar-Polímero", 25.0, 1.80, "T-505", "Houston", astronauta1,
				8.0, 120.0, 100.0, 85.0, 5.0);
		/*
		 * System.out.println("MOficacion De Color"); Traje.setColor("Blanco");
		 * System.out.println(traje1.getNumero_traje() + " " + Traje.getColor());
		 * 
		 * Traje traje2 = new Traje("Kevlar", 23.0, 1.50, "T-506", "Nasa", astronauta1,
		 * 4.5, 7.0, 120.0, 100.0, 85.0, 5.0); Traje.setColor("Azul");
		 * 
		 * System.out.println(traje2.getNumero_traje() + " " + Traje.getColor());
		 * 
		 * System.out.println(traje1.getNumero_traje() + " " + Traje.getColor());
		 */

		// TrajeDeCombate
		TrajeDeCombate trajeCombate1 = new TrajeDeCombate("Titanio-Carbono", 35.0, 1.85, "TC-101", "Houston",
				astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4);

		Traje.setColor("Negro");

		/*
		 * System.out.println(traje2.getNumero_traje() + " " + Traje.getColor());
		 * System.out.println(traje1.getNumero_traje() + " " + Traje.getColor());
		 * System.out.println(trajeCombate1.getNumero_traje() + " " +
		 * TrajeDeCombate.getColor());
		 */

		// Suministro
		Suministro suministro1 = new Suministro("Alimento", "ENT-44", "LOT-99", "01/01/2026", "01/01/2028",
				"15/01/2026", "SpaceX Food", "Texas", true, 0.5, 0.1, 0.2, 15.0);

		// Combustible
		Combustible combustible1 = new Combustible("Hidrógeno Líquido", "Shell Aero", "20/01/2026", "Refinería Houston",
				5000.0, 0.07, 350.0, 12000.0, "Logística Aero", 6000.0, 5000.0);
		/*
		 * // Sobrescritura System.out.println(traje1.calcularProtecion());
		 * System.out.println(trajeCombate1.calcularProtecion());
		 * 
		 * // Sobrecarga System.out.println(traje1.calcularProtecion());
		 * System.out.println(traje1.calcularProtecion(10.5, 0.5));
		 * 
		 * // Registro System.out.println(registro1);
		 */

		/*
		 * System.out.println(
		 * "======================================================================");
		 * System.out.
		 * println("             REPORTE INTEGRAL DEL SISTEMA AEROESPACIAL                "
		 * ); System.out.println(
		 * "======================================================================\n");
		 * System.out.println(">>> DATOS DE LA MISIÓN:"); System.out.println(mision1);
		 * System.out.println(
		 * "\n----------------------------------------------------------------------\n")
		 * ; System.out.println(">>> DETALLE DEL REGISTRO MÉDICO:");
		 * System.out.println(registro1); System.out.println(trajeCombate1);
		 * System.out.println(
		 * "\n----------------------------------------------------------------------\n")
		 * ; System.out.println(">>> TRIPULACIÓN Y EQUIPAMIENTO:");
		 * System.out.println(astronauta1); System.out.println(traje1);
		 * System.out.println(traje1.calcularProtecion());
		 * System.out.println(trajeCombate1.getCantidadDeArmas());
		 * System.out.println(trajeCombate1.calcularProtecion()); System.out.println(
		 * "\n----------------------------------------------------------------------\n")
		 * ; System.out.println(">>> LOGÍSTICA Y RECURSOS:");
		 * System.out.println(suministro1); System.out.println(combustible1);
		 * System.out.println(
		 * "\n----------------------------------------------------------------------\n")
		 * ; System.out.println(">>> INFRAESTRUCTURA DE SALUD:");
		 * System.out.println(doctor1); System.out.println(hospital1);
		 * System.out.println(
		 * "\n======================================================================");
		 */

		// Actividad_6
		// Punto1
		TrajeExploracion trajeExploracion1 = new TrajeExploracion("Kevlar-Polimero", 28.5, 1.80, "TE-202",
				"Cabo Canaveral", astronauta1, 8.5, 7.0, 80.0, 85.0, 70.0);
		/*
		 * Traje[] trajes = new Traje[5]; trajes[0] = traje1; trajes[1] = trajeCombate1;
		 * trajes[2] = trajeExploracion1;
		 * 
		 * System.out.println(trajes[0].calcularProtecion());
		 * System.out.println(trajes[1].calcularProtecion());
		 * 
		 * // Punto2
		 * System.out.println("\n=== MÉTODO 1: compararProteccion(Traje t) ===");
		 * traje1.compararProteccion(trajeCombate1);
		 * 
		 * System.out.println("\n=== MÉTODO 2: trajeConMayorOxigeno(Traje t) ===");
		 * Traje resultado = trajeExploracion1.trajeConMayorOxigeno(trajeCombate1);
		 * System.out.println("Traje con mayor oxígeno: [" + resultado.getNumero_traje()
		 * + "] - Oxígeno: " + resultado.getCantidad_oxigeno() + " L");
		 */
		// Punto3
		// Atributo estatico en clase traje linea 12 nivel de protecion paquete modelo
		// Metodo creado en traje paquete modelo
		// Clase sin herencia combustible paquete modelo

		// Actividad_7
		
		//crear
		ImplementacionOperacionCRUD operaciones = new ImplementacionOperacionCRUD();
		System.out.println(operaciones.crear(trajeExploracion1));
		System.out.println(operaciones.crear(trajeCombate1));

		//Mostra_uno
		System.out.println(operaciones.leeruno(trajeCombate1.getNumero_traje()));
		
		//Mostra_todos
		Traje[] trajes= operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = "+i+" "+trajes[i]);
		}
		
		//Modificar_Actibutos
		System.out.println(operaciones.crear(traje1));
		System.out.println("--------------Traje a modificar---------");
		System.out.println(operaciones.leeruno(traje1.getNumero_traje()));
		System.out.println("----------------------------------------");
		TrajeExploracion trajeExploracion2 = new TrajeExploracion("Kevlar", 28, 1.60, "TE-505",
				"Cabo nuevo", astronauta1, 8.3, 5.4, 85.0, 65.0, 40.0);
		System.out.println(operaciones.modificar(traje1.getNumero_traje(), trajeExploracion2));
		System.out.println("----------Modificaiones------------------");
		System.out.println(operaciones.leeruno("TE-505"));
		
		//Eliminar
		System.out.println("---------Arreglo sin eliminar----------");
		trajes= operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = "+i+" "+trajes[i]);
		}
		System.out.println(operaciones.eliminar(trajeCombate1.getNumero_traje()));
		System.out.println("---------Arreglo con eliminaciones----------");
		trajes= operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = "+i+" "+trajes[i]);
		}
		//Agrega_en_null
		operaciones.crear(trajeCombate1);
		System.out.println("agrega el primero que este en null");
		trajes= operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = "+i+" "+trajes[i]);
		}
	}
}