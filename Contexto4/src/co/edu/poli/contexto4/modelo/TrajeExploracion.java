package co.edu.poli.contexto4.modelo;

public class TrajeExploracion extends Traje {

	public TrajeExploracion(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno,
			double cantidad_oxigeno, double desgaste) {
		super(material, peso, altura, numero_traje, lugar_fabricacion, astronauta, resistencia_impactos, tiempo_uso,
				capacidad_oxigeno, cantidad_oxigeno, desgaste);
	}

	@Override
	public double aumentarOxigeno() {
		double cantidad = getCantidad_oxigeno();
		double capacidad = getCapacidad_oxigeno();
		if (2+cantidad < capacidad) {
			
			setCantidad_oxigeno(cantidad);
		}
		return cantidad;
	}
	
		
	
}