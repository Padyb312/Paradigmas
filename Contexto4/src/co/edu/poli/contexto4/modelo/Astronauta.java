package co.edu.poli.contexto4.modelo;

public class Astronauta {

	private String nombre;
	private String fecha_nacimiento;
	private String fecha_exposicion;
	private String nacionalidad;
	private String etnia;
	private char genero;
	private double altura;
	private double peso;
	private String id;
	private String numero_identificacion;
	private double cantidad_radiacion;
	private double radiacion_acumulada;
	private String especialidad;
	private String estado_salud;

	// Constructor sobrecargado
	public Astronauta(String nombre, String fecha_nacimiento, String fecha_exposicion, String nacionalidad,
			String etnia, char genero, double altura, double peso, String id, String numero_identificacion,
			double cantidad_radiacion, double radiacion_acumulada, String especialidad, String estado_salud) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_exposicion = fecha_exposicion;
		this.nacionalidad = nacionalidad;
		this.etnia = etnia;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
		this.id = id;
		this.numero_identificacion = numero_identificacion;
		this.cantidad_radiacion = cantidad_radiacion;
		this.radiacion_acumulada = radiacion_acumulada;
		this.especialidad = especialidad;
		this.estado_salud = estado_salud;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getFecha_exposicion() {
		return fecha_exposicion;
	}

	public void setFecha_exposicion(String fecha_exposicion) {
		this.fecha_exposicion = fecha_exposicion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	public double getCantidad_radiacion() {
		return cantidad_radiacion;
	}

	public void setCantidad_radiacion(double cantidad_radiacion) {
		this.cantidad_radiacion = cantidad_radiacion;
	}

	public double getRadiacion_acumulada() {
		return radiacion_acumulada;
	}

	public void setRadiacion_acumulada(double radiacion_acumulada) {
		this.radiacion_acumulada = radiacion_acumulada;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEstado_salud() {
		return estado_salud;
	}

	public void setEstado_salud(String estado_salud) {
		this.estado_salud = estado_salud;
	}

	@Override
	public String toString() {
		return "Astronauta{" + "nombre='" + nombre + '\'' + ", fecha_nacimiento='" + fecha_nacimiento + '\''
				+ ", fecha_exposicion='" + fecha_exposicion + '\'' + ", nacionalidad='" + nacionalidad + '\''
				+ ", etnia='" + etnia + '\'' + ", genero=" + genero + ", altura=" + altura + ", peso=" + peso + ", id='"
				+ id + '\'' + ", numero_identificacion='" + numero_identificacion + '\'' + ", cantidad_radiacion="
				+ cantidad_radiacion + ", radiacion_acumulada=" + radiacion_acumulada + ", especialidad='"
				+ especialidad + '\'' + ", estado_salud='" + estado_salud + '\'' + '}';
	}
}