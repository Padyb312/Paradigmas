package co.edu.poli.contexto4.modelo;

public class Combustible {

	private String tipo_combustible;
	private String marca;
	private String fecha_obtencion;
	private String lugar_extraccion;
	private String numero_lote;
	private double cantidad;
	private double densidad;
	private double peso;
	private double precio;
	private String nombre_transportista;
	private double capacidad_combustible;
	private double cantidad_combustible;

	// Constructor sobrecargado
	public Combustible(String tipo_combustible, String marca, String fecha_obtencion, String lugar_extraccion,
			String numero_lote, double cantidad, double densidad, double peso, double precio,
			String nombre_transportista, double capacidad_combustible, double cantidad_combustible) {
		this.tipo_combustible = tipo_combustible;
		this.marca = marca;
		this.fecha_obtencion = fecha_obtencion;
		this.lugar_extraccion = lugar_extraccion;
		this.numero_lote = numero_lote;
		this.cantidad = cantidad;
		this.densidad = densidad;
		this.peso = peso;
		this.precio = precio;
		this.nombre_transportista = nombre_transportista;
		this.capacidad_combustible = capacidad_combustible;
		this.cantidad_combustible = cantidad_combustible;
	}

	// Getters y Setters
	public String getTipo_combustible() {
		return tipo_combustible;
	}

	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFecha_obtencion() {
		return fecha_obtencion;
	}

	public void setFecha_obtencion(String fecha_obtencion) {
		this.fecha_obtencion = fecha_obtencion;
	}

	public String getLugar_extraccion() {
		return lugar_extraccion;
	}

	public void setLugar_extraccion(String lugar_extraccion) {
		this.lugar_extraccion = lugar_extraccion;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(String numero_lote) {
		this.numero_lote = numero_lote;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getDensidad() {
		return densidad;
	}

	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre_transportista() {
		return nombre_transportista;
	}

	public void setNombre_transportista(String nombre_transportista) {
		this.nombre_transportista = nombre_transportista;
	}

	public double getCapacidad_combustible() {
		return capacidad_combustible;
	}

	public void setCapacidad_combustible(double capacidad_combustible) {
		this.capacidad_combustible = capacidad_combustible;
	}

	public double getCantidad_combustible() {
		return cantidad_combustible;
	}

	public void setCantidad_combustible(double cantidad_combustible) {
		this.cantidad_combustible = cantidad_combustible;
	}

	@Override
	public String toString() {
		return "Combustible{" + "tipo_combustible='" + tipo_combustible + '\'' + ", marca='" + marca + '\''
				+ ", fecha_obtencion='" + fecha_obtencion + '\'' + ", lugar_extraccion='" + lugar_extraccion + '\''
				+ ", numero_lote='" + numero_lote + '\'' + ", cantidad=" + cantidad + ", densidad=" + densidad
				+ ", peso=" + peso + ", precio=" + precio + ", nombre_transportista='" + nombre_transportista + '\''
				+ ", capacidad_combustible=" + capacidad_combustible + ", cantidad_combustible=" + cantidad_combustible
				+ '}';
	}
}