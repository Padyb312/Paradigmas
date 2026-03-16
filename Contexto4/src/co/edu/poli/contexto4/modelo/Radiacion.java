package co.edu.poli.contexto4.modelo;

public class Radiacion {

	private String tipo_radiacion;
	private double nivel_peligro;
	private double cantidad;
	private double extension;
	private String lugar;
	private String fecha_inicio;
	private boolean es_visible;
	private boolean es_curable;
	private boolean es_reversible;
	private boolean es_tratable;
	private String color;
	private double tasa_penetracion;

	// Constructor sobrecargado
	public Radiacion(String tipo_radiacion, double nivel_peligro, double cantidad, double extension, String lugar,
			String fecha_inicio, boolean es_visible, boolean es_curable, boolean es_reversible, boolean es_tratable,
			String color, double tasa_penetracion) {
		this.tipo_radiacion = tipo_radiacion;
		this.nivel_peligro = nivel_peligro;
		this.cantidad = cantidad;
		this.extension = extension;
		this.lugar = lugar;
		this.fecha_inicio = fecha_inicio;
		this.es_visible = es_visible;
		this.es_curable = es_curable;
		this.es_reversible = es_reversible;
		this.es_tratable = es_tratable;
		this.color = color;
		this.tasa_penetracion = tasa_penetracion;
	}

	// Getters y Setters
	public String getTipo_radiacion() {
		return tipo_radiacion;
	}

	public void setTipo_radiacion(String tipo_radiacion) {
		this.tipo_radiacion = tipo_radiacion;
	}

	public double getNivel_peligro() {
		return nivel_peligro;
	}

	public void setNivel_peligro(double nivel_peligro) {
		this.nivel_peligro = nivel_peligro;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getExtension() {
		return extension;
	}

	public void setExtension(double extension) {
		this.extension = extension;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public boolean isEs_visible() {
		return es_visible;
	}

	public void setEs_visible(boolean es_visible) {
		this.es_visible = es_visible;
	}

	public boolean isEs_curable() {
		return es_curable;
	}

	public void setEs_curable(boolean es_curable) {
		this.es_curable = es_curable;
	}

	public boolean isEs_reversible() {
		return es_reversible;
	}

	public void setEs_reversible(boolean es_reversible) {
		this.es_reversible = es_reversible;
	}

	public boolean isEs_tratable() {
		return es_tratable;
	}

	public void setEs_tratable(boolean es_tratable) {
		this.es_tratable = es_tratable;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTasa_penetracion() {
		return tasa_penetracion;
	}

	public void setTasa_penetracion(double tasa_penetracion) {
		this.tasa_penetracion = tasa_penetracion;
	}

	@Override
	public String toString() {
		return "Radiacion{" + "tipo_radiacion='" + tipo_radiacion + '\'' + ", nivel_peligro=" + nivel_peligro
				+ ", cantidad=" + cantidad + ", extension=" + extension + ", lugar='" + lugar + '\''
				+ ", fecha_inicio='" + fecha_inicio + '\'' + ", es_visible=" + es_visible + ", es_curable=" + es_curable
				+ ", es_reversible=" + es_reversible + ", es_tratable=" + es_tratable + ", color='" + color + '\''
				+ ", tasa_penetracion=" + tasa_penetracion + '}';
	}
}
