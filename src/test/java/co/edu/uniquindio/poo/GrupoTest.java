package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

public class GrupoTest {

    private Grupo grupo;

    @Test
    public void testLimiteContactos() {
        grupo = new Grupo("Amigos", Categoria.AMIGOS);
        grupo.agregarContacto(new Contacto("Contacto 1", "C1", "Direccion 1", "111", "c1@gmail.com"));
        grupo.agregarContacto(new Contacto("Contacto 2", "C2", "Direccion 2", "222", "c2@gmail.com"));
        grupo.agregarContacto(new Contacto("Contacto 3", "C3", "Direccion 3", "333", "c3@gmail.com"));
        grupo.agregarContacto(new Contacto("Contacto 4", "C4", "Direccion 4", "444", "c4@gmail.com"));
        grupo.agregarContacto(new Contacto("Contacto 5", "C5", "Direccion 5", "555", "c5@gmail.com"));

        Contacto contactoExtra = new Contacto("Contacto 6", "C6", "Direccion 6", "666", "c6@gmail.com");
        assertFalse(grupo.agregarContacto(contactoExtra), "No debería poder agregar más de 5 contactos a un grupo");
        JOptionPane.showMessageDialog(null, "Test de límite de contactos en grupo pasado");
    }
}