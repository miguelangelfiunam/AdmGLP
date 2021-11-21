package mx.unam.admglp.modelo.entidades.faltantes;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Comentario
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Direccion {

    /**
     * Identificador de direccion
     */
    private int idDireccion;
    /**
     * Descripción de la dirección
     */
    private String direccion;
    /**
     * Numero interior
     */
    private int numInterior;
    /**
     * Número exterior
     */
    private int numExterior;
    /**
     * Nombre de la colonia o zona
     */
    private String colonia;
    /**
     * Codigo postal
     */
    private int codigoPostal;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Comentario adicional en la dirección 150
     */
    private String comentarioDireccion;
    /**
     * Estado de la dirección
     */
    private int estadoDireccion;

    public Direccion() {
    }

    public Direccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direccion(int idDireccion, String direccion, int numInterior, int numExterior, String colonia, int codigoPostal, Date fechaRegistro, Date fechaActualizacion, String comentarioDireccion, int estadoDireccion) {
        this.idDireccion = idDireccion;
        this.direccion = direccion;
        this.numInterior = numInterior;
        this.numExterior = numExterior;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.comentarioDireccion = comentarioDireccion;
        this.estadoDireccion = estadoDireccion;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        if (idDireccion > 0) {
            this.idDireccion = idDireccion;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            if (direccion.length() > 0 && direccion.length() <= 150) {
                this.direccion = direccion;
            }
        }
    }

    public int getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(int numInterior) {
        if (numInterior >= 0) {
            this.numInterior = numInterior;
        }
    }

    public int getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(int numExterior) {
        if (numExterior >= 0) {
            this.numExterior = numExterior;
        }
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        if (colonia != null) {
            if (colonia.length() > 0 && colonia.length() <= 150) {
                this.colonia = colonia;
            }
        }
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        if (codigoPostal > 0) {
            this.codigoPostal = codigoPostal;
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

    public String getComentarioDireccion() {
        return comentarioDireccion;
    }

    public void setComentarioDireccion(String comentarioDireccion) {
        if (comentarioDireccion != null) {
            if (comentarioDireccion.length() > 0 && comentarioDireccion.length() <= 150) {
                this.comentarioDireccion = comentarioDireccion;
            }
        }
    }

    public int getEstadoDireccion() {
        return estadoDireccion;
    }

    public void setEstadoDireccion(int estadoDireccion) {
        if (estadoDireccion >= 0) {
            this.estadoDireccion = estadoDireccion;
        }
    }

    /**
     * Metodo para obtener una direccion
     *
     * @return Bean con la informacion
     */
    public Direccion obtenerDireccion() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de direcciones
     *
     * @return
     */
    public static List<Direccion> obtenerDirecciones() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar una direccion
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarDireccion() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar una direccion
     *
     * @return
     */
    public int insertarDireccion() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar una direccion
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarDireccion() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", direccion=" + direccion + ", numInterior=" + numInterior + ", numExterior=" + numExterior + ", colonia=" + colonia + ", codigoPostal=" + codigoPostal + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", comentarioDireccion=" + comentarioDireccion + ", estadoDireccion=" + estadoDireccion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idDireccion;
        hash = 89 * hash + Objects.hashCode(this.direccion);
        hash = 89 * hash + this.numInterior;
        hash = 89 * hash + this.numExterior;
        hash = 89 * hash + Objects.hashCode(this.colonia);
        hash = 89 * hash + this.codigoPostal;
        hash = 89 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 89 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 89 * hash + Objects.hashCode(this.comentarioDireccion);
        hash = 89 * hash + this.estadoDireccion;
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
        final Direccion other = (Direccion) obj;
        if (this.idDireccion != other.idDireccion) {
            return false;
        }
        if (this.numInterior != other.numInterior) {
            return false;
        }
        if (this.numExterior != other.numExterior) {
            return false;
        }
        if (this.codigoPostal != other.codigoPostal) {
            return false;
        }
        if (this.estadoDireccion != other.estadoDireccion) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.colonia, other.colonia)) {
            return false;
        }
        if (!Objects.equals(this.comentarioDireccion, other.comentarioDireccion)) {
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
