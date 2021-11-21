package mx.unam.admglp.modelo.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Tanque
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Articulo {

    /**
     * Identificador del tanque
     */
    private int idTanque;
    /**
     * Presentacion del tanque
     */
    private int tamanoKilos;
    /**
     * Precio del tanque
     */
    private double precio;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Estado del tanque
     */
    private int estadoTanque;

    public Articulo() {
    }

    public Articulo(int idTanque) {
        this.idTanque = idTanque;
    }

    public Articulo(int idTanque, int tamanoKilos, int precio, Date fechaRegistro, Date fechaActualizacion, int estadoTanque) {
        this.idTanque = idTanque;
        this.tamanoKilos = tamanoKilos;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoTanque = estadoTanque;
    }

    public int getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(int idTanque) {
        if (idTanque > 0) {
            this.idTanque = idTanque;
        }
    }

    public int getTamanoKilos() {
        return tamanoKilos;
    }

    public void setTamanoKilos(int tamanoKilos) {
        if (tamanoKilos > 0) {
            this.tamanoKilos = tamanoKilos;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
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

    public int getEstadoTanque() {
        return estadoTanque;
    }

    public void setEstadoTanque(int estadoTanque) {
        if (estadoTanque >= 0) {
            this.estadoTanque = estadoTanque;
        }
    }

    /**
     * Metodo para obtener un tanque
     *
     * @return Bean con la informacion
     */
    public Articulo obtenerTanque() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener informacionde un tanque con informacion del pedido
     *
     * @return Bean con la informacion
     */
    public Articulo obtenerTanquePedido() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de tanques
     *
     * @return Lista con la informacion
     */
    public static List<Articulo> obtenerTanques() {
        // TODO: implement
        return null;
    }

    /**
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean asignaTanquesTransporte() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para obtener una lista de tanques disponibles
     *
     * @return Lista con la informacion
     */
    public static List<Articulo> verificarTanquesDisponibles() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un tanque
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarTanque() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el estado de un tanque
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarEstadoTanque() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el precio de un tanque
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarPrecioTanque() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un tanque
     *
     * @return
     */
    public int insertarTanque() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un tanque
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarTanque() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Tanque{" + "idTanque=" + idTanque + ", tamanoKilos=" + tamanoKilos + ", precio=" + precio + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", estadoTanque=" + estadoTanque + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idTanque;
        hash = 61 * hash + this.tamanoKilos;
        hash = (int) (61 * hash + this.precio);
        hash = 61 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 61 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 61 * hash + this.estadoTanque;
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
        final Articulo other = (Articulo) obj;
        if (this.idTanque != other.idTanque) {
            return false;
        }
        if (this.tamanoKilos != other.tamanoKilos) {
            return false;
        }
        if (this.precio != other.precio) {
            return false;
        }
        if (this.estadoTanque != other.estadoTanque) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizacion, other.fechaActualizacion)) {
            return false;
        }
        return true;
    }

}
