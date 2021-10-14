package admglp;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Transporte
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Transporte {

    /**
     * Numero de transporte
     */
    private int numeroUnidad;
    /**
     * Anio de la unidad
     */
    private int modelo;
    /**
     * Placas del transporte
     */
    private String placas;
    /**
     * Marca del transporte
     */
    private String marca;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Estado del transporte
     */
    private int estadoTransporte;

    public Transporte() {
    }

    public Transporte(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public Transporte(int numeroUnidad, int modelo, String placas, String marca, Date fechaRegistro, Date fechaActualizacion, int estadoTransporte) {
        this.numeroUnidad = numeroUnidad;
        this.modelo = modelo;
        this.placas = placas;
        this.marca = marca;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoTransporte = estadoTransporte;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        if (numeroUnidad > 0) {
            this.numeroUnidad = numeroUnidad;
        }
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        int year = Calendar.getInstance().get(Calendar.YEAR) + 1;
        if (modelo > 0 && (modelo <= year)) {
            this.modelo = modelo;
        }
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        if (placas != null) {
            this.placas = placas;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
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

    public int getEstadoTransporte() {
        return estadoTransporte;
    }

    public void setEstadoTransporte(int estadoTransporte) {
        if (estadoTransporte >= 0) {
            this.estadoTransporte = estadoTransporte;
        }
    }

    /**
     * Metodo para obtener un transporte
     *
     * @return
     */
    public Transporte obtenerTransporte() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de trasnportes
     *
     * @return
     */
    public static List<Transporte> obtenerTransportes() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para asignar un trasnporte a un trabajador
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean asignaTransporteTrabajador() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar un transporte
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarTransporte() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un transporte
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public int insertarTransporte() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un transporte
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarTransporte() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Transporte{" + "numeroUnidad=" + numeroUnidad + ", modelo=" + modelo + ", placas=" + placas + ", marca=" + marca + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", estadoTransporte=" + estadoTransporte + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.numeroUnidad;
        hash = 61 * hash + this.modelo;
        hash = 61 * hash + Objects.hashCode(this.placas);
        hash = 61 * hash + Objects.hashCode(this.marca);
        hash = 61 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 61 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 61 * hash + this.estadoTransporte;
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
        final Transporte other = (Transporte) obj;
        if (this.numeroUnidad != other.numeroUnidad) {
            return false;
        }
        if (this.modelo != other.modelo) {
            return false;
        }
        if (this.estadoTransporte != other.estadoTransporte) {
            return false;
        }
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
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
