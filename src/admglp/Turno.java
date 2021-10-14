package admglp;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Turno
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Turno {

    /**
     * Numero de turno
     */
    private int numeroTurno;
    /**
     * Fecha en que se inicia el turno
     */
    private Date fechaInicioTurno;
    /**
     * Fecha de fin de turno
     */
    private Date fechaFinTurno;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Estado del turno
     */
    private int estadoTurno;

    public Turno() {
    }

    public Turno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public Turno(int numeroTurno, Date fechaInicioTurno, Date fechaFinTurno, Date fechaRegistro, Date fechaActualizacion, int estadoTurno) {
        this.numeroTurno = numeroTurno;
        this.fechaInicioTurno = fechaInicioTurno;
        this.fechaFinTurno = fechaFinTurno;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.estadoTurno = estadoTurno;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(int numeroTurno) {
        if (numeroTurno > 0) {
            this.numeroTurno = numeroTurno;
        }
    }

    public Date getFechaInicioTurno() {
        return fechaInicioTurno;
    }

    public void setFechaInicioTurno(Date fechaInicioTurno) {
        if (fechaInicioTurno != null) {
            this.fechaInicioTurno = fechaInicioTurno;
        }
    }

    public Date getFechaFinTurno() {
        return fechaFinTurno;
    }

    public void setFechaFinTurno(Date fechaFinTurno) {
        if (fechaFinTurno != null) {
            this.fechaFinTurno = fechaFinTurno;
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

    public int getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(int estadoTurno) {
        if (estadoTurno >= 0) {
            this.estadoTurno = estadoTurno;
        }
    }

    /**
     * Metodo para obtener un turno
     *
     * @return
     */
    public Turno obtenerTurno() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener un turno del trabajador del dia actual
     *
     * @return
     */
    public Turno obtenerTurnoTrabajadorHoy() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de turnos
     *
     * @return
     */
    public static List<Turno> obtenerTurnosTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para asignar un turno a un trabajador
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean asignarTurnoTrabajador() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para verificar turnos disponibles
     *
     * @return
     */
    public static List<Turno> verificaTurnosDisponibles() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un turno
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarTurno() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un turno
     *
     * @return
     */
    public int insertarTurno() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un turno
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarTurno() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Turno{" + "numeroTurno=" + numeroTurno + ", fechaInicioTurno=" + fechaInicioTurno + ", fechaFinTurno=" + fechaFinTurno + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", estadoTurno=" + estadoTurno + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.numeroTurno;
        hash = 83 * hash + Objects.hashCode(this.fechaInicioTurno);
        hash = 83 * hash + Objects.hashCode(this.fechaFinTurno);
        hash = 83 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 83 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 83 * hash + this.estadoTurno;
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
        final Turno other = (Turno) obj;
        if (this.numeroTurno != other.numeroTurno) {
            return false;
        }
        if (this.estadoTurno != other.estadoTurno) {
            return false;
        }
        if (!Objects.equals(this.fechaInicioTurno, other.fechaInicioTurno)) {
            return false;
        }
        if (!Objects.equals(this.fechaFinTurno, other.fechaFinTurno)) {
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
