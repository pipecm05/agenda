package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

public class AgendaTest {
    //Crear un contacto
    @Test
    public void testCrearContacto() {
        Contacto contacto1 = new Contacto("Felipe Garcia", "pipe", "Calle 15", "123456789", "felipe@gmail.com");
        assertEquals("Felipe Garcia", contacto1.getNombre(), "El nombre del contacto debería ser 'Felipe Garcia'");
        assertEquals("pipe", contacto1.getAlias(), "El alias del contacto debería ser 'pipe'");
        assertEquals("Calle 15", contacto1.getDireccion(), "La dirección del contacto debería ser 'Calle 15'");
        assertEquals("123456789", contacto1.getTelefono(), "El teléfono del contacto debería ser '123456789'");
        assertEquals("felipe@gmail.com", contacto1.getEmail(), "El email del contacto debería ser 'felipe@gmail.com'");
        JOptionPane.showMessageDialog(null, "Contactos creado");

    }
    @Test
    void testNoAgregarContactoDuplicado() {
        // Crear una nueva agenda
        Agenda agenda = new Agenda("Mi Agenda");

        // Crear un nuevo contacto y agregarlo
        Contacto contacto = new Contacto("Felipe Garcia", "pipe", "Calle 15", "123456789", "felipe@gmail.com");
        agenda.agregarContacto(contacto);

        // Intentar agregar el mismo contacto otra vez
        Contacto contactoDuplicado2 = new Contacto("Felipe Garcia", "pipe", "Calle 15", "123456789", "felipe@gmail.com");
        String resultado = agenda.agregarContacto(contactoDuplicado2);

        // Verificar que el resultado sea "contacto ya EXISTE"
        assertEquals("contacto ya EXISTE", resultado);
        JOptionPane.showMessageDialog(null, "Contactos duplicados");

    }
    @Test
    void testEliminarContacto() {
        // Crear una nueva agenda
        Agenda agenda = new Agenda("Mi Agenda");

        // Crear y agregar un nuevo contacto
        Contacto contacto = new Contacto("Felipe Garcia", "pipe", "Calle 15", "123456789", "felipe@gmail.com");
        agenda.agregarContacto(contacto);

        // Eliminar el contacto de la agenda
        String resultado = agenda.eliminarContacto("Felipe Garcia", "123456789");

        // Verificar que el resultado sea "El contacto ha sido eliminado."
        assertEquals("El contacto ha sido eliminado.", resultado);
        JOptionPane.showMessageDialog(null, "Contacto eliminado");

    }
    @Test
    public void testContactosDiferentes() {
        Contacto contacto1 = new Contacto("Felipe Garcia", "pipe", "Calle 15", "123456789", "felipe@gmail.com");
        Contacto contacto2 = new Contacto("Vanessa", "vane", "Calle 56", "987654321", "vane@gmail.com");
        assertNotEquals(contacto1, contacto2, "Los contactos con diferente nombre o teléfono deberían ser diferentes");
        JOptionPane.showMessageDialog(null, "Contactos agregados");
    }
    
}