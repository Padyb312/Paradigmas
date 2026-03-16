package co.edu.poli.contexto4.modelo;

public class Registro {

	private String numero_registro;
	private String lugar_atencion;
	private Mision mision;
	private Planeta planeta;
	private Doctor doctor;
	private Astronauta astronauta;
	private String fecha;
	private String hora_inicio;
	private String hora_finalizacion;
	private String lugar_muestra;
	private double cantidad_radiacion;
	private boolean es_sintomas_detectados;
	private boolean es_tratamiento_aplicado;
	private double signos_vitales;
	private Radiacion[] radiacion;

	// Constructor sobrecargado
	public Registro(String numero_registro, String lugar_atencion, Mision mision, Planeta planeta, Doctor doctor,
			Astronauta astronauta, String fecha, String hora_inicio, String hora_finalizacion, String lugar_muestra,
			double cantidad_radiacion, boolean es_sintomas_detectados, boolean es_tratamiento_aplicado,
			double signos_vitales, Radiacion[] radiacion) {
		this.numero_registro = numero_registro;
		this.lugar_atencion = lugar_atencion;
		this.mision = mision;
		this.planeta = planeta;
		this.doctor = doctor;
		this.astronauta = astronauta;
		this.fecha = fecha;
		this.hora_inicio = hora_inicio;
		this.hora_finalizacion = hora_finalizacion;
		this.lugar_muestra = lugar_muestra;
		this.cantidad_radiacion = cantidad_radiacion;
		this.es_sintomas_detectados = es_sintomas_detectados;
		this.es_tratamiento_aplicado = es_tratamiento_aplicado;
		this.signos_vitales = signos_vitales;
		this.radiacion = radiacion;
	}

	// Getters y Setters
	public String getNumero_registro() {
		return numero_registro;
	}

	public void setNumero_registro(String numero_registro) {
		this.numero_registro = numero_registro;
	}

	public String getLugar_atencion() {
		return lugar_atencion;
	}

	public void setLugar_atencion(String lugar_atencion) {
		this.lugar_atencion = lugar_atencion;
	}

	public Mision getMision() {
		return mision;
	}

	public void setMision(Mision mision) {
		this.mision = mision;
	}

	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Astronauta getAstronauta() {
		return astronauta;
	}

	public void setAstronauta(Astronauta astronauta) {
		this.astronauta = astronauta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_finalizacion() {
		return hora_finalizacion;
	}

	public void setHora_finalizacion(String hora_finalizacion) {
		this.hora_finalizacion = hora_finalizacion;
	}

	public String getLugar_muestra() {
		return lugar_muestra;
	}

	public void setLugar_muestra(String lugar_muestra) {
		this.lugar_muestra = lugar_muestra;
	}

	public double getCantidad_radiacion() {
		return cantidad_radiacion;
	}

	public void setCantidad_radiacion(double cantidad_radiacion) {
		this.cantidad_radiacion = cantidad_radiacion;
	}

	public boolean isEs_sintomas_detectados() {
		return es_sintomas_detectados;
	}

	public void setEs_sintomas_detectados(boolean es_sintomas_detectados) {
		this.es_sintomas_detectados = es_sintomas_detectados;
	}

	public boolean isEs_tratamiento_aplicado() {
		return es_tratamiento_aplicado;
	}

	public void setEs_tratamiento_aplicado(boolean es_tratamiento_aplicado) {
		this.es_tratamiento_aplicado = es_tratamiento_aplicado;
	}

	public double getSignos_vitales() {
		return signos_vitales;
	}

	public void setSignos_vitales(double signos_vitales) {
		this.signos_vitales = signos_vitales;
	}

	public Radiacion[] getRadiacion() {
		return radiacion;
	}

	public void setRadiacion(Radiacion[] radiacion) {
		this.radiacion = radiacion;
	}

	@Override
	public String toString() {
		return "Registro{" + "numero_registro='" + numero_registro + '\'' + ", lugar_atencion='" + lugar_atencion + '\''
				+ ", mision=" + (mision != null ? mision.getCodigo_mision() : "null") + ", planeta="
				+ (planeta != null ? planeta.getNombre() : "null") + ", doctor="
				+ (doctor != null ? doctor.getNombre() : "null") + ", astronauta="
				+ (astronauta != null ? astronauta.getNombre() : "null") + ", fecha='" + fecha + '\''
				+ ", hora_inicio='" + hora_inicio + '\'' + ", hora_finalizacion='" + hora_finalizacion + '\''
				+ ", lugar_muestra='" + lugar_muestra + '\'' + ", cantidad_radiacion=" + cantidad_radiacion
				+ ", es_sintomas_detectados=" + es_sintomas_detectados + ", es_tratamiento_aplicado="
				+ es_tratamiento_aplicado + ", signos_vitales=" + signos_vitales + '}';
	}
}