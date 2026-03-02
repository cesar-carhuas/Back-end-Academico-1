package examen_final.cesar_carhuas.entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TP_PLAY_STORE")
public class play_Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_play_Store;
    private String nombre;
    private String version;
    private String descripcion;
    private String desarrollador;
    private Date fecha_lanzamiento;
    private Float calificacion;
    private Boolean estado;

    public Long getId_play_Store() {
        return id_play_Store;
    }

    public void setId_play_Store(Long id_play_Store) {
        this.id_play_Store = id_play_Store;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}



