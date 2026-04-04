package co.edu.poli.contexto4.vista;

import co.edu.poli.contexto4.servicios.*;
import java.util.Scanner;

import co.edu.poli.contexto4.modelo.*;

public class Principal {
	public static void main(String[] args) {

		// Astronauta
		Astronauta astronauta1 = new Astronauta("Juan", "05/06/2000", "02/03/2026", "Colombiana", "Mestizo", 'M', 1.75,
				72.0, "AST-01", "10203040", 5.2, 25.4, "Piloto", "Excelente");

		// Traje

		TrajeExploracion traje1 = new TrajeExploracion("Kevlar-Polímero", 25.0, 1.80, "T-505", "Houston", astronauta1,
				8.0, 120.0, 100.0, 85.0, 5.0);

		TrajeDeCombate trajeCombate1 = new TrajeDeCombate("Titanio-Carbono", 35.0, 1.85, "TC-101", "Houston",
				astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4);

		Traje.setColor("Negro");

		TrajeExploracion trajeExploracion1 = new TrajeExploracion("Kevlar-Polimero", 28.5, 1.80, "TE-202",
				"Cabo Canaveral", astronauta1, 8.5, 7.0, 80.0, 85.0, 70.0);

		// Actividad_7

		// crear
		ImplementacionOperacionCRUD operaciones = new ImplementacionOperacionCRUD();
		System.out.println(operaciones.crear(trajeExploracion1));
		System.out.println(operaciones.crear(trajeCombate1));

		// Mostra_uno
		System.out.println(operaciones.leeruno(trajeCombate1.getNumero_traje()));

		// Mostra_todos
		Traje[] trajes = operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = " + i + " " + trajes[i]);
		}

		// Modificar_Actibutos
		System.out.println(operaciones.crear(traje1));
		System.out.println("--------------Traje a modificar---------");
		System.out.println(operaciones.leeruno(traje1.getNumero_traje()));
		System.out.println("----------------------------------------");
		TrajeExploracion trajeExploracion2 = new TrajeExploracion("Kevlar", 28, 1.60, "TE-505", "Cabo nuevo",
				astronauta1, 8.3, 5.4, 85.0, 65.0, 40.0);
		System.out.println(operaciones.modificar(traje1.getNumero_traje(), trajeExploracion2));
		System.out.println("----------Modificaiones------------------");
		System.out.println(operaciones.leeruno("TE-505"));

		// Eliminar
		System.out.println("---------Arreglo sin eliminar----------");
		trajes = operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = " + i + " " + trajes[i]);
		}
		System.out.println(operaciones.eliminar(trajeCombate1.getNumero_traje()));
		System.out.println("---------Arreglo con eliminaciones----------");
		trajes = operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = " + i + " " + trajes[i]);
		}
		// Agrega_en_null
		operaciones.crear(trajeCombate1);
		System.out.println("agrega el primero que este en null");
		trajes = operaciones.leerTodos();
		for (int i = 0; i < trajes.length; i++) {
			System.out.println("Indice = " + i + " " + trajes[i]);

		}
		Scanner teclado = new Scanner(System.in);
		Scanner numero = new Scanner(System.in);
		Scanner texto = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("--------MENU-------");
			System.out.println("1. Crear Traje");
			System.out.println("2. Mostrar Uno");
			System.out.println("3. Mostar Todos");
			System.out.println("4. Modificar Traje");
			System.out.println("5. Eliminar");
			System.out.println("6. Serializar");
			System.out.println("7. Deserializar");
			System.out.println("8. Salir");
			// Toma_la_opcion
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				// crear_traje
				int opcion2;
				do {
					{
						System.out.println("--------Trajes-------");
						System.out.println("1. Crear Traje Exploracion");
						System.out.println("2. Crear Traje Combate");
						System.out.println("3. Crear Traje Hazmat");
						System.out.println("4. Volver");
						opcion2 = teclado.nextInt();
						switch (opcion2) {

						case 1:
							TrajeExploracion exploracionBase = new TrajeExploracion("Kevlar-Polímero", 25.0, 1.80, null,
									"Houston", astronauta1, 8.0, 120.0, 100.0, 85.0, 5.0);
							// Dato_solicitado#1
							System.out.println("Ingrese peso de traje (double)");
							exploracionBase.setPeso(numero.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese altura de traje (double)");
							exploracionBase.setAltura(numero.nextDouble());

							// Dato_solicitado#3
							System.out.println("Ingrese Codigo de traje (String)");
							exploracionBase.setNumero_traje(texto.next());

							// Dato_solicitado#4
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							exploracionBase.setLugar_fabricacion(texto.next());

							// Dato_solicitado#5
							System.out.println("Ingrese tiempo de uso (horas) traje (double)");
							exploracionBase.setTiempo_uso(numero.nextDouble());

							System.out.println(operaciones.crear(exploracionBase));

							break;
						case 2:

							TrajeDeCombate combateBase = new TrajeDeCombate("Titanio-Carbono", 35.0, 1.85, "TC-101",
									"Houston", astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4);
							// Dato_solicitado#1
							System.out.println("Ingrese peso de traje (double)");
							combateBase.setPeso(numero.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese altura de traje (double)");
							combateBase.setAltura(numero.nextDouble());

							// Dato_solicitado#3
							System.out.println("Ingrese Codigo de traje (String)");
							combateBase.setNumero_traje(texto.next());

							// Dato_solicitado#4
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							combateBase.setLugar_fabricacion(texto.next());

							// Dato_solicitado#5
							System.out.println("Ingrese cantidad de armas del traje (Int)");
							combateBase.setTiempo_uso(numero.nextInt());

							System.out.println(operaciones.crear(combateBase));

							break;

						case 3:
							TrajeHazmat hazmatBase = new TrajeHazmat("Titanio-Carbono", 35.0, 1.85, "TC-101", "Houston",
									astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4, "Radiactivos", 55);
							// Dato_solicitado#1
							System.out.println("Ingrese peso de traje (double)");
							hazmatBase.setPeso(numero.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese Codigo de traje (String)");
							hazmatBase.setNumero_traje(texto.next());

							// Dato_solicitado#3
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							hazmatBase.setLugar_fabricacion(texto.next());

							// Dato_solicitado#4
							System.out.println("Ingrese cantidad de armas del traje (Int)");
							hazmatBase.setTiempo_uso(numero.nextInt());
							// Dato_solicitado#5
							System.out.println("Ingrese tiempo maximo de exposicion (double)");
							hazmatBase.setTiempo_uso(numero.nextDouble());

							System.out.println(operaciones.crear(hazmatBase));

							break;
						case 4:
							System.out.println("Volviendo...");
							break;
						default:
							System.out.println("Opcion invalida");
						}

					}

				} while (opcion2 != 4);
				break;
			case 2:// MostrarUno

				System.out.println("Ingrese Codigo de traje a mostrar (String)");
				System.out.println(operaciones.leeruno(texto.next()));

				break;
			case 3:// MostarTodos

				Traje[] trajes2 = operaciones.leerTodos();
				for (int i = 0; i < trajes2.length; i++) {
					System.out.println("Indice = " + i + " " + trajes2[i]);
				}
				break;
			case 4:// ModificarTraje
				break;
			case 5:// EliminarTraje
				System.out.println("Ingrese Codigo de traje a eliminar (String)");
				System.out.println(operaciones.eliminar(texto.next()));
				break;
			case 6:// Serializar
				System.out.println(operaciones.serializar(trajes, null, null));
				break;
			case 7:// Deserializar
				break;
			case 8:// Salir
				break;
			default:
				System.out.println("Opcion invalida");
			}

		} while (opcion != 8);
	}
}