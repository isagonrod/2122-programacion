package Tema12.Anexo.Act_10;

public class Regalo implements IRegalos {
    private Integer codigo;
    private String descripcion;
    private Double precio;
    private Boolean disponible;

    public Regalo(Integer codigo, String descripcion, Double precio, Boolean disponible) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Regalo{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}
