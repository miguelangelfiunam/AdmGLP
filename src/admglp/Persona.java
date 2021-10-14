package admglp;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Persona
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Persona extends Usuario {

    /**
     * Nombre de la persona 100
     */
    private String nombre;
    /**
     * Primer apellido 100
     */
    private String apellido1;
    /**
     * Segundo apellido 100
     */
    private String apellido2;
    /**
     * Edad de la persona
     */
    private int edad;
    /**
     * Fecha de nacimiento
     */
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad, Date fechaNacimiento, int idUsuario) {
        super(idUsuario);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad, Date fechaNacimiento, int idUsuario, String correo, boolean acceso, Date fecInicioAcceso, Date fecFinAcceso, int estadoUsuario) {
        super(idUsuario, correo, acceso, fecInicioAcceso, fecFinAcceso, estadoUsuario);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            if (nombre.length() > 0 && nombre.length() < 100) {
                this.nombre = nombre;
            }
        }
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        if (apellido1 != null) {
            if (apellido1.length() > 0 && nombre.length() < 100) {
                this.apellido1 = apellido1;
            }
        }
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        if (apellido2 != null) {
            if (apellido2.length() > 0 && apellido2.length() < 100) {
                this.apellido2 = apellido2;
            }
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if (fechaNacimiento != null) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    /**
     * Metodo para obtener una persona
     *
     * @return
     */
    public Persona obtenerPersona() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de personas
     *
     * @return Lista con la informacion
     */
    public static List<Persona> obtenerPersonas() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar una persona
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarPersona() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar una persona
     *
     * @return
     */
    public int insertarPersona() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar una persona
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarPersona() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido1);
        hash = 97 * hash + Objects.hashCode(this.apellido2);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.fechaNacimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

}
