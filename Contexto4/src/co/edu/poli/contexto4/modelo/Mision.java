package co.edu.poli.contexto4.modelo;

public class Mision {

    private String codigo_mision;
    private String origen;
    private String destino;
    private String fecha_mision;
    private String fecha_fin_estimado_mision;
    private String fecha_real_finalizacion;
    private String objetivo_mision;
    private String miembros;
    private Planeta planeta;
    private double costo;
    private String estado;
    private String autorizacion;
    private double nivel_riesgo;
    private Astronauta[] astronautas;

    // Constructor sobrecargado
    public Mision(String codigo_mision, String origen, String destino,
                  String fecha_mision, String fecha_fin_estimado_mision,
                  String fecha_real_finalizacion, String objetivo_mision,
                  String miembros, Planeta planeta, double costo,
                  String estado, String autorizacion, double nivel_riesgo,
                  Astronauta[] astronautas) {
        this.codigo_mision = codigo_mision;
        this.origen = origen;
        this.destino = destino;
        this.fecha_mision = fecha_mision;
        this.fecha_fin_estimado_mision = fecha_fin_estimado_mision;
        this.fecha_real_finalizacion = fecha_real_finalizacion;
        this.objetivo_mision = objetivo_mision;
        this.miembros = miembros;
        this.planeta = planeta;
        this.costo = costo;
        this.estado = estado;
        this.autorizacion = autorizacion;
        this.nivel_riesgo = nivel_riesgo;
        this.astronautas = astronautas;
    }

    // Getters y Setters
    public String getCodigo_mision() { return codigo_mision; }
    public void setCodigo_mision(String codigo_mision) { this.codigo_mision = codigo_mision; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getFecha_mision() { return fecha_mision; }
    public void setFecha_mision(String fecha_mision) { this.fecha_mision = fecha_mision; }

    public String getFecha_fin_estimado_mision() { return fecha_fin_estimado_mision; }
    public void setFecha_fin_estimado_mision(String fecha_fin_estimado_mision) { this.fecha_fin_estimado_mision = fecha_fin_estimado_mision; }

    public String getFecha_real_finalizacion() { return fecha_real_finalizacion; }
    public void setFecha_real_finalizacion(String fecha_real_finalizacion) { this.fecha_real_finalizacion = fecha_real_finalizacion; }

    public String getObjetivo_mision() { return objetivo_mision; }
    public void setObjetivo_mision(String objetivo_mision) { this.objetivo_mision = objetivo_mision; }

    public String getMiembros() { return miembros; }
    public void setMiembros(String miembros) { this.miembros = miembros; }

    public Planeta getPlaneta() { return planeta; }
    public void setPlaneta(Planeta planeta) { this.planeta = planeta; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getAutorizacion() { return autorizacion; }
    public void setAutorizacion(String autorizacion) { this.autorizacion = autorizacion; }

    public double getNivel_riesgo() { return nivel_riesgo; }
    public void setNivel_riesgo(double nivel_riesgo) { this.nivel_riesgo = nivel_riesgo; }

    public Astronauta[] getAstronautas() { return astronautas; }
    public void setAstronautas(Astronauta[] astronautas) { this.astronautas = astronautas; }

    @Override
    public String toString() {
        return "Mision{" +
                "codigo_mision='" + codigo_mision + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha_mision='" + fecha_mision + '\'' +
                ", fecha_fin_estimado_mision='" + fecha_fin_estimado_mision + '\'' +
                ", fecha_real_finalizacion='" + fecha_real_finalizacion + '\'' +
                ", objetivo_mision='" + objetivo_mision + '\'' +
                ", miembros='" + miembros + '\'' +
                ", planeta=" + (planeta != null ? planeta.getNombre() : "null") +
                ", costo=" + costo +
                ", estado='" + estado + '\'' +
                ", autorizacion='" + autorizacion + '\'' +
                ", nivel_riesgo=" + nivel_riesgo +
                '}';
    }
}