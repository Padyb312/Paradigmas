package co.edu.poli.contexto4.modelo;

public class TrajeDeCombate extends Traje {

	private int cantidadDeArmas;

	// Constructor sobrecargado
	public TrajeDeCombate(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno,
			double cantidad_oxigeno, double desgaste, int cantidadDeArmas) {
		super(material, peso, altura, numero_traje, lugar_fabricacion, astronauta, resistencia_impactos, tiempo_uso,
				capacidad_oxigeno, cantidad_oxigeno, desgaste);
		this.cantidadDeArmas = cantidadDeArmas;
	}

	// Getters y Setters
	public int getCantidadDeArmas() {
		return cantidadDeArmas;
	}

	public void setCantidadDeArmas(int cantidadDeArmas) {
		this.cantidadDeArmas = cantidadDeArmas;
	}

	@Override
	public String toString() {
		return "TrajeDeCombate{" + "cantidadDeArmas=" + cantidadDeArmas + ", " + super.toString() + '}';
	}

	@Override
	public double calcularProtecion() {

		return super.calcularProtecion() + ((double) cantidadDeArmas * 0.5);

	}



}