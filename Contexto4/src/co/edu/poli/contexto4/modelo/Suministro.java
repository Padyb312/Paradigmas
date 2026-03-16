package co.edu.poli.contexto4.modelo;

public class Suministro {

	private String tipo;
	private String numero_entrega;
	private String numero_lote;
	private String fecha_fabricacion;
	private String fecha_caducidad;
	private String fecha_recibimiento;
	private String proveedor;
	private String origen;
	private boolean se_refrigera;
	private double peso;
	private double ancho;
	private double altura;
	private double precio;

	// Constructor sobrecargado
	public Suministro(String tipo, String numero_entrega, String numero_lote, String fecha_fabricacion,
			String fecha_caducidad, String fecha_recibimiento, String proveedor, String origen, boolean se_refrigera,
			double peso, double ancho, double altura, double precio) {
		this.tipo = tipo;
		this.numero_entrega = numero_entrega;
		this.numero_lote = numero_lote;
		this.fecha_fabricacion = fecha_fabricacion;
		this.fecha_caducidad = fecha_caducidad;
		this.fecha_recibimiento = fecha_recibimiento;
		this.proveedor = proveedor;
		this.origen = origen;
		this.se_refrigera = se_refrigera;
		this.peso = peso;
		this.ancho = ancho;
		this.altura = altura;
		this.precio = precio;
	}

	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero_entrega() {
		return numero_entrega;
	}

	public void setNumero_entrega(String numero_entrega) {
		this.numero_entrega = numero_entrega;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(String numero_lote) {
		this.numero_lote = numero_lote;
	}

	public String getFecha_fabricacion() {
		return fecha_fabricacion;
	}

	public void setFecha_fabricacion(String fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public String getFecha_recibimiento() {
		return fecha_recibimiento;
	}

	public void setFecha_recibimiento(String fecha_recibimiento) {
		this.fecha_recibimiento = fecha_recibimiento;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isSe_refrigera() {
		return se_refrigera;
	}

	public void setSe_refrigera(boolean se_refrigera) {
		this.se_refrigera = se_refrigera;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministro{" + "tipo='" + tipo + '\'' + ", numero_entrega='" + numero_entrega + '\'' + ", numero_lote='"
				+ numero_lote + '\'' + ", fecha_fabricacion='" + fecha_fabricacion + '\'' + ", fecha_caducidad='"
				+ fecha_caducidad + '\'' + ", fecha_recibimiento='" + fecha_recibimiento + '\'' + ", proveedor='"
				+ proveedor + '\'' + ", origen='" + origen + '\'' + ", se_refrigera=" + se_refrigera + ", peso=" + peso
				+ ", ancho=" + ancho + ", altura=" + altura + ", precio=" + precio + '}';
	}
}