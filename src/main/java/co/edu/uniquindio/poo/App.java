package co.edu.uniquindio.poo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){}
        private ArrayList<Contacto>contactos;
        public String agregarContacto(Contacto nuevoContacto) {
            String mensaje="Contacto agregado";
            // Iterar sobre la lista de contactos para buscar duplicados
            for (Contacto contacto : contactos) {
                if (contacto.equals(nuevoContacto)) {
                    // Si ya existe un contacto con el mismo nombre y teléfono, retornar mensaje
                    System.out.println("No se puede agregar el contacto. Ya existe un contacto con el mismo nombre y teléfono.");
                return mensaje= "contacto ya EXISTE"; // No se agrega el contacto si ya existe
                }
            }
        
        // Si no se encuentra un contacto duplicado, agregar el nuevo contacto
        contactos.add(nuevoContacto);
        JOptionPane.showMessageDialog(null, "Contacto agregado" + contactos);
        return mensaje;

    }
}
