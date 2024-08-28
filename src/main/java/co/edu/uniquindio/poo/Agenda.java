package co.edu.uniquindio.poo;
import java.util.ArrayList;

public class Agenda {
    private String nombre;
    private ArrayList<Contacto> contactos;
    private ArrayList<Grupo> grupos;
    private ArrayList<Reunion> reuniones;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    // Método para agregar un nuevo contacto
    public String agregarContacto(Contacto nuevoContacto) {
        
        String mensaje = "Contacto agregado";
       for (Contacto contacto : contactos) {
           if (contacto.equals(nuevoContacto)) {
                System.out.println("No se puede agregar el contacto. Ya existe un contacto con el mismo nombre y teléfono.");
                return mensaje = "contacto ya EXISTE"; // No se agrega el contacto si ya existe
            }
        }
        contactos.add(nuevoContacto);
        return mensaje;
    }
     // Método para eliminar un contacto basado en nombre y teléfono
     public String eliminarContacto(String nombre, String telefono) {
        String mensaje = "El contacto no ha sido encontrado.";

        for (int i = 0; i < contactos.size(); i++) {
            Contacto contactoAux = contactos.get(i);
            if (contactoAux.getNombre().equals(nombre) && contactoAux.getTelefono().equals(telefono)) {
                contactos.remove(i);
                mensaje = "El contacto ha sido eliminado.";
                return mensaje;
            }
        }
        return mensaje;
    }

     /**
      * Este metodo actualiza la informacion de un estudiante
      * @param nombre
      * @param alias
      * @param direccion
      * @param telefono
      * @param email
      * @return
      */
      public String actualizarContacto(String nombre, String alias, String direccion, String telefono, String email){

        String mensaje = "Estudiante no encontrado";
        Contacto estudianteEncontrado = buscarContacto(telefono);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setEmail(email);
            estudianteEncontrado.setAlias(alias);
            estudianteEncontrado.setTelefono(telefono);
            estudianteEncontrado.setDireccion(direccion);
            mensaje = "Contacto actualizado";
        }
        return mensaje;
    }

    private Contacto buscarContacto(String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto; // Retorna el contacto si el teléfono coincide
            }
        }
        return null; // Retorna null si no se encuentra ningún contacto
    }
    // Método para mostrar todos los contactos
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda no tiene contactos.");
        } else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
    // Método para eliminar un grupo basado en el nombre
    public String eliminarGrupo(String nombreGrupo) {
        String mensaje = "Grupo no encontrado.";
        for (int i = 0; i < grupos.size(); i++) {
            if (grupos.get(i).getNombre().equals(nombreGrupo)) {
                grupos.remove(i);
                return mensaje = "Grupo eliminado exitosamente.";
            }
        }
        return mensaje;
    }
    // Método para eliminar una reunión basada en la descripción
    public String eliminarReunion(String descripcionReunion) {
        String mensaje = "Reunión no encontrada.";
        for (int i = 0; i < reuniones.size(); i++) {
            if (reuniones.get(i).getDescripcion().equals(descripcionReunion)) {
                reuniones.remove(i);
                return mensaje ="Reunión eliminada exitosamente.";
            }
        }
        return mensaje;
    }
}

