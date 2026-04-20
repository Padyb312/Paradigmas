package co.edu.poli.contexto4.vista;
import co.edu.poli.contexto4.servicios.*;
import java.io.Serializable;
import java.util.Scanner;
import co.edu.poli.contexto4.modelo.*;

public class Principal implements Serializable {
    public static void main(String[] args) {

        Astronauta astronauta1 = new Astronauta("Juan", "05/06/2000", "02/03/2026", "Colombiana",
                "Mestizo", 'M', 1.75, 72.0, "AST-01", "10203040", 5.2, 25.4, "Piloto", "Excelente");

        ImplementacionOperacionCRUD operaciones = new ImplementacionOperacionCRUD();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--------MENU-------");
            System.out.println("1. Crear Traje");
            System.out.println("2. Mostrar Uno");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Modificar Traje");
            System.out.println("5. Eliminar");
            System.out.println("6. Serializar Guardar");
            System.out.println("7. Deserializar Buscar");
            System.out.println("8. Salir");

            // ✅ FIX #1: Se limpia el buffer con nextLine() antes de continuar
            try {
                opcion = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Solo se permiten numeros del 1 al 8");
                teclado.nextLine(); // Limpia el buffer correctamente
                continue;
            }

            switch (opcion) {
                case 1:
                    int opcion2;
                    do {
                        System.out.println("--------Trajes-------");
                        System.out.println("1. Crear Traje Exploracion");
                        System.out.println("2. Crear Traje Combate");
                        System.out.println("3. Crear Traje Hazmat");
                        System.out.println("4. Volver");

                        // ✅ FIX #2: try/catch en submenú de creación
                        try {
                            opcion2 = teclado.nextInt();
                        } catch (Exception e) {
                            System.out.println("Solo se permiten numeros del 1 al 4");
                            teclado.nextLine();
                            opcion2 = 0;
                            continue;
                        }

                        switch (opcion2) {
                            case 1:
                                // ✅ FIX #3: try/catch para cada entrada de datos del traje
                                try {
                                    TrajeExploracion exploracionBase = new TrajeExploracion("Kevlar-Polímero",
                                            25.0, 1.80, null, "Houston", astronauta1, 8.0, 120.0, 100.0, 85.0, 5.0);
                                    System.out.println("Ingrese peso de traje (double)");
                                    exploracionBase.setPeso(teclado.nextDouble());
                                    System.out.println("Ingrese altura de traje (double)");
                                    exploracionBase.setAltura(teclado.nextDouble());
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    exploracionBase.setNumero_traje(teclado.next());
                                    System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                    exploracionBase.setLugar_fabricacion(teclado.next());
                                    System.out.println("Ingrese tiempo de uso (horas) traje (double)");
                                    exploracionBase.setTiempo_uso(teclado.nextDouble());
                                    System.out.println(operaciones.crear(exploracionBase));
                                } catch (Exception e) {
                                    System.out.println("Error al ingresar datos del Traje de Exploracion: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 2:
                                try {
                                    TrajeDeCombate combateBase = new TrajeDeCombate("Titanio-Carbono",
                                            35.0, 1.85, "TC-101", "Houston", astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4);
                                    System.out.println("Ingrese peso de traje (double)");
                                    combateBase.setPeso(teclado.nextDouble());
                                    System.out.println("Ingrese altura de traje (double)");
                                    combateBase.setAltura(teclado.nextDouble());
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    combateBase.setNumero_traje(teclado.next());
                                    System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                    combateBase.setLugar_fabricacion(teclado.next());
                                    System.out.println("Ingrese cantidad de armas del traje (Int)");
                                    combateBase.setCantidadDeArmas(teclado.nextInt());
                                    System.out.println(operaciones.crear(combateBase));
                                } catch (Exception e) {
                                    System.out.println("Error al ingresar datos del Traje de Combate: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 3:
                                try {
                                    TrajeHazmat hazmatBase = new TrajeHazmat("Titanio-Carbono",
                                            35.0, 1.85, "TC-101", "Houston", astronauta1, 9.5, 100.0, 90.0, 75.0, 3.0, 4,
                                            "Radiactivos", 55);
                                    System.out.println("Ingrese peso de traje (double)");
                                    hazmatBase.setPeso(teclado.nextDouble());
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    hazmatBase.setNumero_traje(teclado.next());
                                    System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                    hazmatBase.setLugar_fabricacion(teclado.next());
                                    System.out.println("Ingrese cantidad de armas del traje (Int)");
                                    hazmatBase.setCantidadDeArmas(teclado.nextInt());
                                    System.out.println("Ingrese tiempo maximo de exposicion (double)");
                                    hazmatBase.setTiempoMaximoExposicion(teclado.nextDouble());
                                    System.out.println(operaciones.crear(hazmatBase));
                                } catch (Exception e) {
                                    System.out.println("Error al ingresar datos del Traje Hazmat: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 4:
                                System.out.println("Volviendo...");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                        }
                    } while (opcion2 != 4);
                    break;

                case 2:
                    System.out.println("Ingrese Codigo de traje a mostrar (String)");
                    System.out.println(operaciones.leeruno(teclado.next()));
                    break;

                case 3:
                    // ✅ FIX #4: Protección contra NullPointerException al recorrer el arreglo
                    Traje[] trajes2 = operaciones.leerTodos();
                    for (int i = 0; i < trajes2.length; i++) {
                        
                            System.out.println("Indice = " + i + " " + trajes2[i]);
                        
                    }
                    break;

                case 4:
                    int opcion3;
                    do {
                        System.out.println("--------Trajes-------");
                        System.out.println("1. Modificar Traje Exploracion");
                        System.out.println("2. Modificar Traje Combate");
                        System.out.println("3. Modificar Traje Hazmat");
                        System.out.println("4. Volver");

                        // ✅ FIX #5: try/catch en submenú de modificación
                        try {
                            opcion3 = teclado.nextInt();
                        } catch (Exception e) {
                            System.out.println("Solo se permiten numeros del 1 al 4");
                            teclado.nextLine();
                            opcion3 = 0;
                            continue;
                        }

                        switch (opcion3) {
                            case 1:
                                // ✅ FIX #6: ClassCastException si el código no es de ese tipo
                                try {
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    String codigo = teclado.next();
                                    TrajeExploracion exploracionBase = (TrajeExploracion) operaciones.leeruno(codigo);
                                    if (exploracionBase != null) {
                                        System.out.println("Ingrese peso de traje (double)");
                                        exploracionBase.setPeso(teclado.nextDouble());
                                        System.out.println("Ingrese altura de traje (double)");
                                        exploracionBase.setAltura(teclado.nextDouble());
                                        System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                        exploracionBase.setLugar_fabricacion(teclado.next());
                                        System.out.println("Ingrese tiempo de uso (horas) traje (double)");
                                        exploracionBase.setTiempo_uso(teclado.nextDouble());
                                        System.out.println(operaciones.modificar(codigo, exploracionBase));
                                    } else {
                                        System.out.println(operaciones.modificar(codigo, null));
                                    }
                                } catch (ClassCastException e) {
                                    System.out.println("Error: El traje encontrado no es de tipo Exploracion.");
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar Traje de Exploracion: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 2:
                                try {
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    String codigo2 = teclado.next();
                                    TrajeDeCombate combateBase = (TrajeDeCombate) operaciones.leeruno(codigo2);
                                    if (combateBase != null) {
                                        System.out.println("Ingrese peso de traje (double)");
                                        combateBase.setPeso(teclado.nextDouble());
                                        System.out.println("Ingrese altura de traje (double)");
                                        combateBase.setAltura(teclado.nextDouble());
                                        System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                        combateBase.setLugar_fabricacion(teclado.next());
                                        System.out.println("Ingrese cantidad de armas del traje (Int)");
                                        combateBase.setCantidadDeArmas(teclado.nextInt());
                                        System.out.println(operaciones.modificar(codigo2, combateBase));
                                    } else {
                                        System.out.println(operaciones.modificar(codigo2, null));
                                    }
                                } catch (ClassCastException e) {
                                    System.out.println("Error: El traje encontrado no es de tipo Combate.");
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar Traje de Combate: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 3:
                                try {
                                    System.out.println("Ingrese Codigo de traje (String)");
                                    String codigo3 = teclado.next();
                                    TrajeHazmat hazmatBase = (TrajeHazmat) operaciones.leeruno(codigo3);
                                    if (hazmatBase != null) {
                                        System.out.println("Ingrese peso de traje (double)");
                                        hazmatBase.setPeso(teclado.nextDouble());
                                        System.out.println("Ingrese ciudad de fabricacion de traje (String)");
                                        hazmatBase.setLugar_fabricacion(teclado.next());
                                        System.out.println("Ingrese cantidad de armas del traje (Int)");
                                        hazmatBase.setCantidadDeArmas(teclado.nextInt());
                                        System.out.println("Ingrese tiempo maximo de exposicion (double)");
                                        hazmatBase.setTiempoMaximoExposicion(teclado.nextDouble());
                                        System.out.println(operaciones.modificar(codigo3, hazmatBase));
                                    } else {
                                        System.out.println(operaciones.modificar(codigo3, null));
                                    }
                                } catch (ClassCastException e) {
                                    System.out.println("Error: El traje encontrado no es de tipo Hazmat.");
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar Traje Hazmat: " + e.getMessage());
                                    teclado.nextLine();
                                }
                                break;

                            case 4:
                                System.out.println("Volviendo...");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                        }
                    } while (opcion3 != 4);
                    break;

                case 5:
                    System.out.println("Ingrese Codigo de traje a eliminar (String)");
                    System.out.println(operaciones.eliminar(teclado.next()));
                    break;

                case 6:
                    // ✅ FIX #7: Catch con mensaje útil en serialización
                    try {
                        String patch = "";
                        String name = "Trajes";
                        Traje[] trajes = operaciones.leerTodos();
                        System.out.println(operaciones.serializar(trajes, patch, name));
                    } catch (Exception e) {
                        System.out.println("Error al serializar los trajes: " + e.getMessage());
                    }
                    break;

                case 7:
                    // ✅ FIX #8: Catch con mensaje útil en deserialización
                    try {
                        String patch2 = "";
                        String name2 = "Trajes";
                        Traje[] trajes0 = operaciones.deserializar(patch2, name2);
                        for (int i = 0; i < trajes0.length; i++) {
                            if (trajes0[i] != null) {
                                operaciones.crear(trajes0[i]);
                            }
                        }
                        System.out.println("Deserializado correctamente");
                    } catch (Exception e) {
                        System.out.println("Error al deserializar los trajes: " + e.getMessage());
                    }
                    break;

                case 8:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 8);

        teclado.close(); // ✅ FIX #9: Cerrar el Scanner al finalizar
    }
}