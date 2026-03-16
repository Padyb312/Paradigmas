package co.edu.poli.contexto4.modelo;

public class Traje {

	private String material;
	private static String color;
	private double peso;
	private double altura;
	private String numero_traje;
	private String lugar_fabricacion;
	private Astronauta astronauta;
	private double nivel_proteccion_radiacion;
	private double resistencia_impactos;
	private double tiempo_uso;
	private double capacidad_oxigeno;
	private double cantidad_oxigeno;
	private double desgaste;

	// Constructor sobrecargado
	public Traje(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double nivel_proteccion_radiacion, double resistencia_impactos, double tiempo_uso,
			double capacidad_oxigeno, double cantidad_oxigeno, double desgaste) {
		this.material = material;
		this.peso = peso;
		this.altura = altura;
		this.numero_traje = numero_traje;
		this.lugar_fabricacion = lugar_fabricacion;
		this.astronauta = astronauta;
		this.nivel_proteccion_radiacion = nivel_proteccion_radiacion;
		this.resistencia_impactos = resistencia_impactos;
		this.tiempo_uso = tiempo_uso;
		this.capacidad_oxigeno = capacidad_oxigeno;
		this.cantidad_oxigeno = cantidad_oxigeno;
		this.desgaste = desgaste;
	}

	// Getters y Setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Traje.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNumero_traje() {
		return numero_traje;
	}

	public void setNumero_traje(String numero_traje) {
		this.numero_traje = numero_traje;
	}

	public String getLugar_fabricacion() {
		return lugar_fabricacion;
	}

	public void setLugar_fabricacion(String lugar_fabricacion) {
		this.lugar_fabricacion = lugar_fabricacion;
	}

	public Astronauta getAstronauta() {
		return astronauta;
	}

	public void setAstronauta(Astronauta astronauta) {
		this.astronauta = astronauta;
	}

	public double getNivel_proteccion_radiacion() {
		return nivel_proteccion_radiacion;
	}

	public void setNivel_proteccion_radiacion(double nivel_proteccion_radiacion) {
		this.nivel_proteccion_radiacion = nivel_proteccion_radiacion;
	}

	public double getResistencia_impactos() {
		return resistencia_impactos;
	}

	public void setResistencia_impactos(double resistencia_impactos) {
		this.resistencia_impactos = resistencia_impactos;
	}

	public double getTiempo_uso() {
		return tiempo_uso;
	}

	public void setTiempo_uso(double tiempo_uso) {
		this.tiempo_uso = tiempo_uso;
	}

	public double getCapacidad_oxigeno() {
		return capacidad_oxigeno;
	}

	public void setCapacidad_oxigeno(double capacidad_oxigeno) {
		this.capacidad_oxigeno = capacidad_oxigeno;
	}

	public double getCantidad_oxigeno() {
		return cantidad_oxigeno;
	}

	public void setCantidad_oxigeno(double cantidad_oxigeno) {
		this.cantidad_oxigeno = cantidad_oxigeno;
	}

	public double getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	@Override
	public String toString() {
		return "Traje{" + "material='" + material + '\'' + ", color='" + color + '\'' + ", peso=" + peso + ", altura="
				+ altura + ", numero_traje='" + numero_traje + '\'' + ", lugar_fabricacion='" + lugar_fabricacion + '\''
				+ ", astronauta=" + (astronauta != null ? astronauta.getNombre() : "null")
				+ ", nivel_proteccion_radiacion=" + nivel_proteccion_radiacion + ", resistencia_impactos="
				+ resistencia_impactos + ", tiempo_uso=" + tiempo_uso + ", capacidad_oxigeno=" + capacidad_oxigeno
				+ ", cantidad_oxigeno=" + cantidad_oxigeno + ", desgaste=" + desgaste + '}';
	}

	public double calcularProtecion() {

		return nivel_proteccion_radiacion * resistencia_impactos - desgaste;

	}

	public double calcularProtecion(double n, double h) {
		return nivel_proteccion_radiacion - (n + h);

	}

}