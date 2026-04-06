package co.edu.poli.contexto4.vista;

import co.edu.poli.contexto4.servicios.*;
import java.util.Scanner;

import co.edu.poli.contexto4.modelo.*;

public class Principal {
	public static void main(String[] args) {

		// Astronauta
		Astronauta astronauta1 = new Astronauta("Juan", "05/06/2000", "02/03/2026", "Colombiana", "Mestizo", 'M', 1.75,
				72.0, "AST-01", "10203040", 5.2, 25.4, "Piloto", "Excelente");

		// crear
		ImplementacionOperacionCRUD operaciones = new ImplementacionOperacionCRUD();

		Scanner teclado = new Scanner(System.in);

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
							exploracionBase.setPeso(teclado.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese altura de traje (double)");
							exploracionBase.setAltura(teclado.nextDouble());

							// Dato_solicitado#3
							System.out.println("Ingrese Codigo de traje (String)");
							exploracionBase.setNumero_traje(teclado.next());

							// Dato_solicitado#4
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							exploracionBase.setLugar_fabricacion(teclado.next());

							// Dato_solicitado#5
							System.out.println("Ingrese tiempo de uso (horas) traje (double)");
							exploracionBase.setTiempo_uso(teclado.nextDouble());

							System.out.println(operaciones.crear(exploracionBase));

							break;
						case 2:

							TrajeDeCombate combateBase = new TrajeDeCombate("Titanio-Carbono", 35.0, 1.85, "TC-101",
									"Houston", astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4);
							// Dato_solicitado#1
							System.out.println("Ingrese peso de traje (double)");
							combateBase.setPeso(teclado.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese altura de traje (double)");
							combateBase.setAltura(teclado.nextDouble());

							// Dato_solicitado#3
							System.out.println("Ingrese Codigo de traje (String)");
							combateBase.setNumero_traje(teclado.next());

							// Dato_solicitado#4
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							combateBase.setLugar_fabricacion(teclado.next());

							// Dato_solicitado#5
							System.out.println("Ingrese cantidad de armas del traje (Int)");
							combateBase.setCantidadDeArmas(teclado.nextInt());

							System.out.println(operaciones.crear(combateBase));

							break;

						case 3:
							TrajeHazmat hazmatBase = new TrajeHazmat("Titanio-Carbono", 35.0, 1.85, "TC-101", "Houston",
									astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4, "Radiactivos", 55);
							// Dato_solicitado#1
							System.out.println("Ingrese peso de traje (double)");
							hazmatBase.setPeso(teclado.nextDouble());

							// Dato_solicitado#2
							System.out.println("Ingrese Codigo de traje (String)");
							hazmatBase.setNumero_traje(teclado.next());

							// Dato_solicitado#3
							System.out.println("Ingrese ciudad de fabricacion de traje (String)");
							hazmatBase.setLugar_fabricacion(teclado.next());

							// Dato_solicitado#4
							System.out.println("Ingrese cantidad de armas del traje (Int)");
							hazmatBase.setCantidadDeArmas(teclado.nextInt());
							// Dato_solicitado#5
							System.out.println("Ingrese tiempo maximo de exposicion (double)");
							hazmatBase.setTiempoMaximoExposicion(teclado.nextDouble());

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
				System.out.println(operaciones.leeruno(teclado.next()));

				break;
			case 3:// MostarTodos

				Traje[] trajes2 = operaciones.leerTodos();
				for (int i = 0; i < trajes2.length; i++) {
					System.out.println("Indice = " + i + " " + trajes2[i]);
				}
				break;
			case 4:// ModificarTraje
				int opcion3;
				do {
					{
						System.out.println("--------Trajes-------");
						System.out.println("1. Modificar Traje Exploracion");
						System.out.println("2. Modificar Traje Combate");
						System.out.println("3. Modificar Traje Hazmat");
						System.out.println("4. Volver");
						opcion3 = teclado.nextInt();
						switch (opcion3) {

						case 1:
							System.out.println("Ingrese Codigo de traje (String)");
							String codigo = teclado.next();

							TrajeExploracion exploracionBase = (TrajeExploracion) operaciones.leeruno(codigo);
							if (exploracionBase != null) {
								// Dato_solicitado#1
								System.out.println("Ingrese peso de traje (double)");
								exploracionBase.setPeso(teclado.nextDouble());

								// Dato_solicitado#2
								System.out.println("Ingrese altura de traje (double)");
								exploracionBase.setAltura(teclado.nextDouble());

								// Dato_solicitado#3
								System.out.println("Ingrese ciudad de fabricacion de traje (String)");
								exploracionBase.setLugar_fabricacion(teclado.next());

								// Dato_solicitado#4
								System.out.println("Ingrese tiempo de uso (horas) traje (double)");
								exploracionBase.setTiempo_uso(teclado.nextDouble());

								System.out.println(operaciones.modificar(codigo, exploracionBase));
								break;
							} else {
								System.out.println(operaciones.modificar(codigo, null));
								break;
							}

						case 2:
							System.out.println("Ingrese Codigo de traje (String)");
							String codigo2 = teclado.next();
							TrajeDeCombate combateBase = (TrajeDeCombate) operaciones.leeruno(codigo2);

							if (combateBase != null) {
								// Dato_solicitado#1
								System.out.println("Ingrese peso de traje (double)");
								combateBase.setPeso(teclado.nextDouble());

								// Dato_solicitado#2
								System.out.println("Ingrese altura de traje (double)");
								combateBase.setAltura(teclado.nextDouble());

								// Dato_solicitado#3
								System.out.println("Ingrese ciudad de fabricacion de traje (String)");
								combateBase.setLugar_fabricacion(teclado.next());

								// Dato_solicitado#4
								System.out.println("Ingrese cantidad de armas del traje (Int)");
								combateBase.setCantidadDeArmas(teclado.nextInt());

								System.out.println(operaciones.modificar(codigo2, combateBase));

								break;
							} else {
								System.out.println(operaciones.modificar(codigo2, null));

								break;
							}

						case 3:
							System.out.println("Ingrese Codigo de traje (String)");
							String codigo3 = teclado.next();
							TrajeHazmat hazmatBase = (TrajeHazmat) operaciones.leeruno(codigo3);

							if (hazmatBase != null) {

								// Dato_solicitado#1
								System.out.println("Ingrese peso de traje (double)");
								hazmatBase.setPeso(teclado.nextDouble());

								// Dato_solicitado#2
								System.out.println("Ingrese ciudad de fabricacion de traje (String)");
								hazmatBase.setLugar_fabricacion(teclado.next());

								// Dato_solicitado#3
								System.out.println("Ingrese cantidad de armas del traje (Int)");
								hazmatBase.setCantidadDeArmas(teclado.nextInt());
								// Dato_solicitado#4
								System.out.println("Ingrese tiempo maximo de exposicion (double)");
								hazmatBase.setTiempoMaximoExposicion(teclado.nextDouble());

								System.out.println(operaciones.modificar(codigo3, hazmatBase));

								break;
							} else {
								System.out.println(operaciones.modificar(codigo3, null));
								break;
							}

						case 4:
							System.out.println("Volviendo...");
							break;
						default:
							System.out.println("Opcion invalida");
						}

					}

				} while (opcion3 != 4);
				break;
			case 5:// EliminarTraje
				System.out.println("Ingrese Codigo de traje a eliminar (String)");
				System.out.println(operaciones.eliminar(teclado.next()));
				break;
			case 6:// Serializar
				System.out.println("Ingrese path (String)");
				String patch = teclado.next();
				System.out.println("Ingrese name (String)");
				String name = teclado.next();
				System.out.println(operaciones.serializar(operaciones.leerTodos(), patch, name));
				break;
			case 7:// Deserializar
				System.out.println("Ingrese path (String)");
				String patch2 = teclado.next();
				System.out.println("Ingrese name (String)");
				String name2 = teclado.next();
				System.out.println(operaciones.deserializar(patch2, name2));
				break;
			case 8:// Salir
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion invalida");
			}

		} while (opcion != 8);
		Traje hola = new TrajeExploracion("Kevlar-Polímero", 25.0, 1.80, null,
				"Houston", astronauta1, 8.0, 120.0, 100.0, 85.0, 5.0); 
	}
	
}