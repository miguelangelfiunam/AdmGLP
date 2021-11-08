package admglp;

import java.util.Date;
import java.util.List;
import java.util.Objects;
 
/**
 * Clase cliente
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Cliente extends Persona {

    /**
     * Numero de cliente
     */
    private int numeroCliente;
    /**
     * Fecha de registro del cliente
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion del cliente
     */
    private Date fechaActualizacion;
    /**
     * Estado del cliente
     */
    private int estadoCliente;
    /**
     * Direccion del cliente
     */
    private Direccion direccion;

    public Cliente() {
    }

    public Cliente(int numeroCliente, Date fechaRegistro, Date fechaActualizacion, int estadoCliente, Direccion direccion, String nombre, String apellido1, String apellido2, int edad, Date fechaNacimiento) {
        super(nombre, apellido1, apellido2, edad, fechaNacimiento);
        this.numeroCliente = numeroCliente;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoCliente = estadoCliente;
        this.direccion = direccion;
    }

    public Cliente(int numeroCliente, Date fechaRegistro, Date fechaActualizacion, int estadoCliente, Direccion direccion) {
        this.numeroCliente = numeroCliente;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoCliente = estadoCliente;
        this.direccion = direccion;
    }

    public Cliente(int numeroCliente, Date fechaRegistro, Date fechaActualizacion, int estadoCliente, Direccion direccion, String nombre, String apellido1, String apellido2, int edad, Date fechaNacimiento, int idUsuario, String correo, boolean acceso, Date fecInicioAcceso, Date fecFinAcceso, int estadoUsuario) {
        super(nombre, apellido1, apellido2, edad, fechaNacimiento, idUsuario, correo, acceso, fecInicioAcceso, fecFinAcceso, estadoUsuario);
        this.numeroCliente = numeroCliente;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoCliente = estadoCliente;
        this.direccion = direccion;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        if (numeroCliente > 0) {
            this.numeroCliente = numeroCliente;
        }
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        if (fechaRegistro != null) {
            this.fechaRegistro = fechaRegistro;
        }
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        if (fechaActualizacion != null) {
            this.fechaActualizacion = fechaActualizacion;
        }
    }

    public int getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(int estadoCliente) {
        if (estadoCliente >= 0) {
            this.estadoCliente = estadoCliente;
        }
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        }
    }

    /**
     * Metodo para obtener un cliente
     *
     * @return
     */
    public Cliente obtenerCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de clientes
     *
     * @return
     */
    public static List<Cliente> obtenerClientes() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un cliente
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarCliente() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el estado de un cliente
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarEstadoCliente() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un cliente
     *
     * @return
     */
    public int insertarCliente() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un cliente
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarCliente() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", estadoCliente=" + estadoCliente + ", direccion=" + direccion + '}';
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
        final Cliente other = (Cliente) obj;
        if (this.numeroCliente != other.numeroCliente) {
            return false;
        }
        if (this.estadoCliente != other.estadoCliente) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizacion, other.fechaActualizacion)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numeroCliente;
        hash = 47 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 47 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 47 * hash + this.estadoCliente;
        hash = 47 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

}
