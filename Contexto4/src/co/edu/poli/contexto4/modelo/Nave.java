package co.edu.poli.contexto4.modelo;

public class Nave {

    private String color;
    private String identificacion_nave;
    private double tamano;
    private int capacidad_tripulacion;
    private double capacidad_carga;
    private String material;
    private String pais_creacion;
    private String fecha_creacion;
    private String ubicacion;
    private double peso;
    private double altura;
    private double capacidad_oxigeno;
    private double cantidad_oxigeno;
    private double estado;
    private double capacidad_combustible;
    private double cantidad_combustible;

    // Constructor sobrecargado
    public Nave(String color, String identificacion_nave, double tamano,
                int capacidad_tripulacion, double capacidad_carga, String material,
                String pais_creacion, String fecha_creacion, String ubicacion,
                double peso, double altura, double capacidad_oxigeno,
                double cantidad_oxigeno, double estado,
                double capacidad_combustible, double cantidad_combustible) {
        this.color = color;
        this.identificacion_nave = identificacion_nave;
        this.tamano = tamano;
        this.capacidad_tripulacion = capacidad_tripulacion;
        this.capacidad_carga = capacidad_carga;
        this.material = material;
        this.pais_creacion = pais_creacion;
        this.fecha_creacion = fecha_creacion;
        this.ubicacion = ubicacion;
        this.peso = peso;
        this.altura = altura;
        this.capacidad_oxigeno = capacidad_oxigeno;
        this.cantidad_oxigeno = cantidad_oxigeno;
        this.estado = estado;
        this.capacidad_combustible = capacidad_combustible;
        this.cantidad_combustible = cantidad_combustible;
    }

    // Getters y Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getIdentificacion_nave() { return identificacion_nave; }
    public void setIdentificacion_nave(String identificacion_nave) { this.identificacion_nave = identificacion_nave; }

    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }

    public int getCapacidad_tripulacion() { return capacidad_tripulacion; }
    public void setCapacidad_tripulacion(int capacidad_tripulacion) { this.capacidad_tripulacion = capacidad_tripulacion; }

    public double getCapacidad_carga() { return capacidad_carga; }
    public void setCapacidad_carga(double capacidad_carga) { this.capacidad_carga = capacidad_carga; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getPais_creacion() { return pais_creacion; }
    public void setPais_creacion(String pais_creacion) { this.pais_creacion = pais_creacion; }

    public String getFecha_creacion() { return fecha_creacion; }
    public void setFecha_creacion(String fecha_creacion) { this.fecha_creacion = fecha_creacion; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getCapacidad_oxigeno() { return capacidad_oxigeno; }
    public void setCapacidad_oxigeno(double capacidad_oxigeno) { this.capacidad_oxigeno = capacidad_oxigeno; }

    public double getCantidad_oxigeno() { return cantidad_oxigeno; }
    public void setCantidad_oxigeno(double cantidad_oxigeno) { this.cantidad_oxigeno = cantidad_oxigeno; }

    public double getEstado() { return estado; }
    public void setEstado(double estado) { this.estado = estado; }

    public double getCapacidad_combustible() { return capacidad_combustible; }
    public void setCapacidad_combustible(double capacidad_combustible) { this.capacidad_combustible = capacidad_combustible; }

    public double getCantidad_combustible() { return cantidad_combustible; }
    public void setCantidad_combustible(double cantidad_combustible) { this.cantidad_combustible = cantidad_combustible; }

    @Override
    public String toString() {
        return "Nave{" +
                "color='" + color + '\'' +
                ", identificacion_nave='" + identificacion_nave + '\'' +
                ", tamano=" + tamano +
                ", capacidad_tripulacion=" + capacidad_tripulacion +
                ", capacidad_carga=" + capacidad_carga +
                ", material='" + material + '\'' +
                ", pais_creacion='" + pais_creacion + '\'' +
                ", fecha_creacion='" + fecha_creacion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", capacidad_oxigeno=" + capacidad_oxigeno +
                ", cantidad_oxigeno=" + cantidad_oxigeno +
                ", estado=" + estado +
                ", capacidad_combustible=" + capacidad_combustible +
                ", cantidad_combustible=" + cantidad_combustible +
                '}';
    }
}