package admglp.entidades;

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
public class Comentario {

    /**
     * Numero de comentario
     */
    private int numeroComentario;
    /**
     * Comentario que se deasea agregar durante el pedido 150
     */
    private String comentario;
    /**
     * Fecha de registro del comentario
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion del comentario
     */
    private Date fechaActualizacion;
    /**
     * Bean on informacion del pedido
     */
    private Pedido pedido;
    /**
     * Estado del comentario
     */
    private int estadoComentario;

    public Comentario() {
    }

    public Comentario(int numeroComentario) {
        this.numeroComentario = numeroComentario;
    }

    public Comentario(int numeroComentario, String comentario, Date fechaRegistro, Date fechaActualizacion, Pedido pedido, int estadoComentario) {
        this.numeroComentario = numeroComentario;
        this.comentario = comentario;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.pedido = pedido;
        this.estadoComentario = estadoComentario;
    }

    public int getNumeroComentario() {
        return numeroComentario;
    }

    public void setNumeroComentario(int numeroComentario) {
        if (numeroComentario > 0) {
            this.numeroComentario = numeroComentario;
        }
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if (comentario != null) {
            if (comentario.length() >= 150) {
                this.comentario = comentario;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido != null) {
            this.pedido = pedido;
        }
    }

    public int getEstadoComentario() {
        return estadoComentario;
    }

    public void setEstadoComentario(int estadoComentario) {
        if (estadoComentario >= 0) {
            this.estadoComentario = estadoComentario;
        }
    }

    /**
     * Metodo para obtener un Comentario
     *
     * @return
     */
    public Comentario obtenerComentario() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de Comentarios
     *
     * @return
     */
    public static List<Comentario> obtenerComentariosPedido() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un Comentario
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarComentario() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el estado de un Comentario
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarEstadoComentario() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un Comentario
     *
     * @return
     */
    public int insertarComentario() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un Comentario
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarComentario() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Comentario{" + "numeroComentario=" + numeroComentario + ", comentario=" + comentario + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", pedido=" + pedido + ", estadoComentario=" + estadoComentario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numeroComentario;
        hash = 89 * hash + Objects.hashCode(this.comentario);
        hash = 89 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 89 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 89 * hash + Objects.hashCode(this.pedido);
        hash = 89 * hash + this.estadoComentario;
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
        final Comentario other = (Comentario) obj;
        if (this.numeroComentario != other.numeroComentario) {
            return false;
        }
        if (this.estadoComentario != other.estadoComentario) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizacion, other.fechaActualizacion)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        return true;
    }

}
