package co.edu.uniquindio.poo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private String hora;
    private List<Contacto> asistentes;

    public Reunion(String descripcion, Date fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }

    // Métodos para agregar y remover asistentes
    public String agregarAsistente(Contacto contacto) {
        String mensaje = "";

        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
            return mensaje="asistente agregado";
        }
        return (mensaje);
    }

    public boolean removerAsistente(Contacto contacto) {
        return asistentes.remove(contacto);
    }
}