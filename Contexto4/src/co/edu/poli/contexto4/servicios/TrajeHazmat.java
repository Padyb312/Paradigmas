package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.*;

public class TrajeHazmat extends TrajeDeCombate {
	private String tipoMaterialPeligroso;
	private int tiempoMaximoExposicion;

	public TrajeHazmat(String material, double peso, double altura, String numeroTraje, String lugarFabricacion,
			Astronauta astronauta, double resistenciaImpactos, double tiempoUso, double capacidadOxigeno,
			double cantidadOxigeno, double desgaste,int cantidadDeArmas, String tipoMaterialPeligroso, int tiempoMaximoExposicion) {
		super(material, peso, altura, numeroTraje, lugarFabricacion, astronauta, resistenciaImpactos, tiempoUso,
				capacidadOxigeno, cantidadOxigeno, desgaste, cantidadDeArmas);
		this.tipoMaterialPeligroso = tipoMaterialPeligroso;
		this.tiempoMaximoExposicion = tiempoMaximoExposicion;
	}

	public String getTipoMaterialPeligroso() {
		return tipoMaterialPeligroso;
	}

	public void setTipoMaterialPeligroso(String tipoMaterialPeligroso) {
		this.tipoMaterialPeligroso = tipoMaterialPeligroso;
	}

	public int getTiempoMaximoExposicion() {
		return tiempoMaximoExposicion;
	}

	public void setTiempoMaximoExposicion(int tiempoMaximoExposicion) {
		this.tiempoMaximoExposicion = tiempoMaximoExposicion;
	}

	@Override
	public String toString() {
		return "TrajeHazmat{" + "tipoMaterialPeligroso='" + tipoMaterialPeligroso + '\'' + ", tiempoMaximoExposicion="
				+ tiempoMaximoExposicion + ", " + super.toString() + '}';
	}

	@Override
	public double aumentarOxigeno() {
		double cantidad = getCantidad_oxigeno();
		double capacidad = getCapacidad_oxigeno();
		if (3+cantidad < capacidad) {
			
			setCantidad_oxigeno(cantidad);
		}
		return cantidad;
	}

}