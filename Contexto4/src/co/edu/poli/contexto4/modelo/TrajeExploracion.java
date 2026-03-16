package co.edu.poli.contexto4.modelo;

public class TrajeExploracion extends Traje {

	private double alcanceExploracion;

	// Constructor sobrecargado
	public TrajeExploracion(String material, String color, double peso, double altura, String numero_traje,
			String lugar_fabricacion, Astronauta astronauta, double nivel_proteccion_radiacion,
			double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno, double cantidad_oxigeno,
			double desgaste, double alcanceExploracion) {
		super(material, peso, altura, numero_traje, lugar_fabricacion, astronauta, nivel_proteccion_radiacion,
				resistencia_impactos, tiempo_uso, capacidad_oxigeno, cantidad_oxigeno, desgaste);
		this.alcanceExploracion = alcanceExploracion;
	}

	// Getters y Setters
	public double getAlcanceExploracion() {
		return alcanceExploracion;
	}

	public void setAlcanceExploracion(double alcanceExploracion) {
		this.alcanceExploracion = alcanceExploracion;
	}

	@Override
	public String toString() {
		return "TrajeExploracion{" + "alcanceExploracion=" + alcanceExploracion + ", " + super.toString() + '}';
	}
}