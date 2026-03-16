package co.edu.poli.contexto4.modelo;

public class Hospital {

	private int nivel_hospital;
	private double tamano;
	private String ubicacion;
	private String registro_hospital;
	private double es_publico;
	private String color;
	private int capacidad;
	private double es_disponible;
	private int numero_empleados;
	private int numero_pacientes;
	private int numero_consultorios;
	private int numero_camas;
	private int numero_banos;
	private String especialidad;
	private Doctor[] doctor;

	// Constructor sobrecargado
	public Hospital(int nivel_hospital, double tamano, String ubicacion, String registro_hospital, double es_publico,
			String color, int capacidad, double es_disponible, int numero_empleados, int numero_pacientes,
			int numero_consultorios, int numero_camas, int numero_banos, String especialidad, Doctor[] doctor) {
		this.nivel_hospital = nivel_hospital;
		this.tamano = tamano;
		this.ubicacion = ubicacion;
		this.registro_hospital = registro_hospital;
		this.es_publico = es_publico;
		this.color = color;
		this.capacidad = capacidad;
		this.es_disponible = es_disponible;
		this.numero_empleados = numero_empleados;
		this.numero_pacientes = numero_pacientes;
		this.numero_consultorios = numero_consultorios;
		this.numero_camas = numero_camas;
		this.numero_banos = numero_banos;
		this.especialidad = especialidad;
		this.doctor = doctor;
	}

	// Getters y Setters
	public int getNivel_hospital() {
		return nivel_hospital;
	}

	public void setNivel_hospital(int nivel_hospital) {
		this.nivel_hospital = nivel_hospital;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getRegistro_hospital() {
		return registro_hospital;
	}

	public void setRegistro_hospital(String registro_hospital) {
		this.registro_hospital = registro_hospital;
	}

	public double getEs_publico() {
		return es_publico;
	}

	public void setEs_publico(double es_publico) {
		this.es_publico = es_publico;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getEs_disponible() {
		return es_disponible;
	}

	public void setEs_disponible(double es_disponible) {
		this.es_disponible = es_disponible;
	}

	public int getNumero_empleados() {
		return numero_empleados;
	}

	public void setNumero_empleados(int numero_empleados) {
		this.numero_empleados = numero_empleados;
	}

	public int getNumero_pacientes() {
		return numero_pacientes;
	}

	public void setNumero_pacientes(int numero_pacientes) {
		this.numero_pacientes = numero_pacientes;
	}

	public int getNumero_consultorios() {
		return numero_consultorios;
	}

	public void setNumero_consultorios(int numero_consultorios) {
		this.numero_consultorios = numero_consultorios;
	}

	public int getNumero_camas() {
		return numero_camas;
	}

	public void setNumero_camas(int numero_camas) {
		this.numero_camas = numero_camas;
	}

	public int getNumero_banos() {
		return numero_banos;
	}

	public void setNumero_banos(int numero_banos) {
		this.numero_banos = numero_banos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Doctor[] getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor[] doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Hospital{" + "nivel_hospital=" + nivel_hospital + ", tamano=" + tamano + ", ubicacion='" + ubicacion
				+ '\'' + ", registro_hospital='" + registro_hospital + '\'' + ", es_publico=" + es_publico + ", color='"
				+ color + '\'' + ", capacidad=" + capacidad + ", es_disponible=" + es_disponible + ", numero_empleados="
				+ numero_empleados + ", numero_pacientes=" + numero_pacientes + ", numero_consultorios="
				+ numero_consultorios + ", numero_camas=" + numero_camas + ", numero_banos=" + numero_banos
				+ ", especialidad='" + especialidad + '\'' + '}';
	}
}