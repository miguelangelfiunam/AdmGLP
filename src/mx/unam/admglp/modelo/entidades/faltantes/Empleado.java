package mx.unam.admglp.modelo.entidades.faltantes;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Trabajador
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Empleado {

    /**
     * Numero de trabajador
     */
    private int numeroTrabajador;
    /**
     * Numero de seguro social
     */
    private int numeroSeguro;
    /**
     * RFC del trabajador
     */
    private String rfcTrabajador;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Tipo de trabajador
     */
    private String tipoTrabajador;
    /**
     * Transporte del trabajador
     */
    private Transporte transporte;
    /**
     * Turno del trabajador
     */
    private Turno turno;
    /**
     * Estado del trabajador
     */
    private int estadoTrabajador;


    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        if (numeroTrabajador > 0) {
            this.numeroTrabajador = numeroTrabajador;
        }
    }

    public int getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(int numeroSeguro) {
        if (numeroSeguro > 0) {
            this.numeroSeguro = numeroSeguro;
        }
    }

    public String getRfcTrabajador() {
        return rfcTrabajador;
    }

    public void setRfcTrabajador(String rfcTrabajador) {
        if (rfcTrabajador != null) {
            if (rfcTrabajador.length() == 13) {
                this.rfcTrabajador = rfcTrabajador;
            }
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

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        if (tipoTrabajador != null) {
            if (tipoTrabajador.length() > 0) {
                this.tipoTrabajador = tipoTrabajador;
            }
        }

    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        if (transporte != null) {
            this.transporte = transporte;
        }
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        if (turno != null) {
            this.turno = turno;
        }
    }

    public int getEstadoTrabajador() {
        return estadoTrabajador;
    }

    public void setEstadoTrabajador(int estadoTrabajador) {
        if (estadoTrabajador >= 0) {
            this.estadoTrabajador = estadoTrabajador;
        }
    }

    /**
     * Metodo para obtener un trabajador
     *
     * @return
     */
    public Empleado obtenerTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de trabajadores
     *
     * @return
     */
    public static List<Empleado> obtenerTrabajadores() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un trabajador
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarTrabajador() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el estado de un trabajador
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarEstadoTrabajador() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un trabajador
     *
     * @return
     */
    public int insertarTrabajador() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un trabajador
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarTrabajador() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "numeroTrabajador=" + numeroTrabajador + ", numeroSeguro=" + numeroSeguro + ", rfcTrabajador=" + rfcTrabajador + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", tipoTrabajador=" + tipoTrabajador + ", transporte=" + transporte + ", turno=" + turno + ", estadoTrabajador=" + estadoTrabajador + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numeroTrabajador;
        hash = 97 * hash + this.numeroSeguro;
        hash = 97 * hash + Objects.hashCode(this.rfcTrabajador);
        hash = 97 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 97 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 97 * hash + Objects.hashCode(this.tipoTrabajador);
        hash = 97 * hash + Objects.hashCode(this.transporte);
        hash = 97 * hash + Objects.hashCode(this.turno);
        hash = 97 * hash + this.estadoTrabajador;
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
        final Empleado other = (Empleado) obj;
        if (this.numeroTrabajador != other.numeroTrabajador) {
            return false;
        }
        if (this.numeroSeguro != other.numeroSeguro) {
            return false;
        }
        if (this.estadoTrabajador != other.estadoTrabajador) {
            return false;
        }
        if (!Objects.equals(this.rfcTrabajador, other.rfcTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.tipoTrabajador, other.tipoTrabajador)) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizacion, other.fechaActualizacion)) {
            return false;
        }
        if (!Objects.equals(this.transporte, other.transporte)) {
            return false;
        }
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        return true;
    }

}
