package co.edu.poli.contexto4.modelo;

public class Planeta {

	private String id_planeta;
	private String nombre;
	private double tamano;
	private String fecha_descubrimiento;
	private double edad;
	private double distancia_tierra;
	private boolean es_habitable;
	private String nombre_estrella_madre;
	private String galaxia;
	private int cantidad_satelites;
	private double densidad_atmosferica;
	private int numero_cuerpos_agua;
	private double porcentaje_agua_tierra;
	private int numero_continentes;
	private int numero_islas;
	private double tiempo_rotacion_eje;
	private double tiempo_rotacion_estrella;
	private double tasa_radiacion_ambiental;
	private double nivel_peligro;

	// Constructor sobrecargado
	public Planeta(String id_planeta, String nombre, double tamano, String fecha_descubrimiento, double edad,
			double distancia_tierra, boolean es_habitable, String nombre_estrella_madre, String galaxia,
			int cantidad_satelites, double densidad_atmosferica, int numero_cuerpos_agua, double porcentaje_agua_tierra,
			int numero_continentes, int numero_islas, double tiempo_rotacion_eje, double tiempo_rotacion_estrella,
			double tasa_radiacion_ambiental, double nivel_peligro) {
		this.id_planeta = id_planeta;
		this.nombre = nombre;
		this.tamano = tamano;
		this.fecha_descubrimiento = fecha_descubrimiento;
		this.edad = edad;
		this.distancia_tierra = distancia_tierra;
		this.es_habitable = es_habitable;
		this.nombre_estrella_madre = nombre_estrella_madre;
		this.galaxia = galaxia;
		this.cantidad_satelites = cantidad_satelites;
		this.densidad_atmosferica = densidad_atmosferica;
		this.numero_cuerpos_agua = numero_cuerpos_agua;
		this.porcentaje_agua_tierra = porcentaje_agua_tierra;
		this.numero_continentes = numero_continentes;
		this.numero_islas = numero_islas;
		this.tiempo_rotacion_eje = tiempo_rotacion_eje;
		this.tiempo_rotacion_estrella = tiempo_rotacion_estrella;
		this.tasa_radiacion_ambiental = tasa_radiacion_ambiental;
		this.nivel_peligro = nivel_peligro;
	}

	// Getters y Setters
	public String getId_planeta() {
		return id_planeta;
	}

	public void setId_planeta(String id_planeta) {
		this.id_planeta = id_planeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public String getFecha_descubrimiento() {
		return fecha_descubrimiento;
	}

	public void setFecha_descubrimiento(String fecha_descubrimiento) {
		this.fecha_descubrimiento = fecha_descubrimiento;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	public boolean isEs_habitable() {
		return es_habitable;
	}

	public void setEs_habitable(boolean es_habitable) {
		this.es_habitable = es_habitable;
	}

	public String getNombre_estrella_madre() {
		return nombre_estrella_madre;
	}

	public void setNombre_estrella_madre(String nombre_estrella_madre) {
		this.nombre_estrella_madre = nombre_estrella_madre;
	}

	public String getGalaxia() {
		return galaxia;
	}

	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}

	public int getCantidad_satelites() {
		return cantidad_satelites;
	}

	public void setCantidad_satelites(int cantidad_satelites) {
		this.cantidad_satelites = cantidad_satelites;
	}

	public double getDensidad_atmosferica() {
		return densidad_atmosferica;
	}

	public void setDensidad_atmosferica(double densidad_atmosferica) {
		this.densidad_atmosferica = densidad_atmosferica;
	}

	public int getNumero_cuerpos_agua() {
		return numero_cuerpos_agua;
	}

	public void setNumero_cuerpos_agua(int numero_cuerpos_agua) {
		this.numero_cuerpos_agua = numero_cuerpos_agua;
	}

	public double getPorcentaje_agua_tierra() {
		return porcentaje_agua_tierra;
	}

	public void setPorcentaje_agua_tierra(double porcentaje_agua_tierra) {
		this.porcentaje_agua_tierra = porcentaje_agua_tierra;
	}

	public int getNumero_continentes() {
		return numero_continentes;
	}

	public void setNumero_continentes(int numero_continentes) {
		this.numero_continentes = numero_continentes;
	}

	public int getNumero_islas() {
		return numero_islas;
	}

	public void setNumero_islas(int numero_islas) {
		this.numero_islas = numero_islas;
	}

	public double getTiempo_rotacion_eje() {
		return tiempo_rotacion_eje;
	}

	public void setTiempo_rotacion_eje(double tiempo_rotacion_eje) {
		this.tiempo_rotacion_eje = tiempo_rotacion_eje;
	}

	public double getTiempo_rotacion_estrella() {
		return tiempo_rotacion_estrella;
	}

	public void setTiempo_rotacion_estrella(double tiempo_rotacion_estrella) {
		this.tiempo_rotacion_estrella = tiempo_rotacion_estrella;
	}

	public double getTasa_radiacion_ambiental() {
		return tasa_radiacion_ambiental;
	}

	public void setTasa_radiacion_ambiental(double tasa_radiacion_ambiental) {
		this.tasa_radiacion_ambiental = tasa_radiacion_ambiental;
	}

	public double getNivel_peligro() {
		return nivel_peligro;
	}

	public void setNivel_peligro(double nivel_peligro) {
		this.nivel_peligro = nivel_peligro;
	}

	@Override
	public String toString() {
		return "Planeta{" + "id_planeta='" + id_planeta + '\'' + ", nombre='" + nombre + '\'' + ", tamano=" + tamano
				+ ", fecha_descubrimiento='" + fecha_descubrimiento + '\'' + ", edad=" + edad + ", distancia_tierra="
				+ distancia_tierra + ", es_habitable=" + es_habitable + ", nombre_estrella_madre='"
				+ nombre_estrella_madre + '\'' + ", galaxia='" + galaxia + '\'' + ", cantidad_satelites="
				+ cantidad_satelites + ", densidad_atmosferica=" + densidad_atmosferica + ", numero_cuerpos_agua="
				+ numero_cuerpos_agua + ", porcentaje_agua_tierra=" + porcentaje_agua_tierra + ", numero_continentes="
				+ numero_continentes + ", numero_islas=" + numero_islas + ", tiempo_rotacion_eje=" + tiempo_rotacion_eje
				+ ", tiempo_rotacion_estrella=" + tiempo_rotacion_estrella + ", tasa_radiacion_ambiental="
				+ tasa_radiacion_ambiental + ", nivel_peligro=" + nivel_peligro + '}';
	}
}