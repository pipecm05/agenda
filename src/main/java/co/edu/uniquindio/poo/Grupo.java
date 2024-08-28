package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private List<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    // Métodos para agregar y remover contactos
    public boolean agregarContacto(Contacto contacto) {
        if (contactos.size() < 5 && !contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    public boolean removerContacto(Contacto contacto) {
        return contactos.remove(contacto);
    }
}