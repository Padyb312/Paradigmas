package co.edu.poli.contexto4.modelo;

public class Doctor {

	private String nombre;
	private String universidad;
	private String numero_tarjeta_profesional;
	private String fecha_graduacion;
	private String etnia;
	private char genero;
	private String especializacion;
	private String empresa;
	private int numero_consultorio;
	private int numero_asistentes;
	private Registro[] registros;

	// Constructor sobrecargado
	public Doctor(String nombre, String universidad, String numero_tarjeta_profesional, String fecha_graduacion,
			String etnia, char genero, String especializacion, String empresa, int numero_consultorio,
			int numero_asistentes, Registro[] registros) {
		this.nombre = nombre;
		this.universidad = universidad;
		this.numero_tarjeta_profesional = numero_tarjeta_profesional;
		this.fecha_graduacion = fecha_graduacion;
		this.etnia = etnia;
		this.genero = genero;
		this.especializacion = especializacion;
		this.empresa = empresa;
		this.numero_consultorio = numero_consultorio;
		this.numero_asistentes = numero_asistentes;
		this.registros = registros;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getNumero_tarjeta_profesional() {
		return numero_tarjeta_profesional;
	}

	public void setNumero_tarjeta_profesional(String numero_tarjeta_profesional) {
		this.numero_tarjeta_profesional = numero_tarjeta_profesional;
	}

	public String getFecha_graduacion() {
		return fecha_graduacion;
	}

	public void setFecha_graduacion(String fecha_graduacion) {
		this.fecha_graduacion = fecha_graduacion;
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

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumero_consultorio() {
		return numero_consultorio;
	}

	public void setNumero_consultorio(int numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}

	public int getNumero_asistentes() {
		return numero_asistentes;
	}

	public void setNumero_asistentes(int numero_asistentes) {
		this.numero_asistentes = numero_asistentes;
	}

	public Registro[] getRegistros() {
		return registros;
	}

	public void setRegistros(Registro[] registros) {
		this.registros = registros;
	}

	@Override
	public String toString() {
		return "Doctor{" + "nombre='" + nombre + '\'' + ", universidad='" + universidad + '\''
				+ ", numero_tarjeta_profesional='" + numero_tarjeta_profesional + '\'' + ", fecha_graduacion='"
				+ fecha_graduacion + '\'' + ", etnia='" + etnia + '\'' + ", genero=" + genero + ", especializacion='"
				+ especializacion + '\'' + ", empresa='" + empresa + '\'' + ", numero_consultorio=" + numero_consultorio
				+ ", numero_asistentes=" + numero_asistentes + '}';
	}
}