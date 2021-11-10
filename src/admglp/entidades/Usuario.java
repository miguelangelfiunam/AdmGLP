package admglp.entidades;

import java.util.Date;
import java.util.Objects;

/**
 * Clase Usuario
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Usuario {

    /**
     * Identificador de usuario
     */
    private int idUsuario;
    /**
     * Correo electronico
     */
    private String correo;
    /**
     * Permite el acceso a la aplicacion
     */
    private boolean acceso;
    /**
     * Fecha de Inicio de acceso a la aplicacion
     */
    private Date fecInicioAcceso;
    /**
     * Fecha de fin de acceso a la aplicacion
     */
    private Date fecFinAcceso;
    /**
     * Estado del usuario
     */
    private int estadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String correo, boolean acceso, Date fecInicioAcceso, Date fecFinAcceso, int estadoUsuario) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.acceso = acceso;
        this.fecInicioAcceso = fecInicioAcceso;
        this.fecFinAcceso = fecFinAcceso;
        this.estadoUsuario = estadoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        if (idUsuario > 0) {
            this.idUsuario = idUsuario;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(correo);
        if (m.matches()) {
            this.correo = correo;
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public Date getFecInicioAcceso() {
        return fecInicioAcceso;
    }

    public void setFecInicioAcceso(Date fecInicioAcceso) {
        if (fecInicioAcceso != null) {
            this.fecInicioAcceso = fecInicioAcceso;
        }
    }

    public Date getFecFinAcceso() {
        return fecFinAcceso;
    }

    public void setFecFinAcceso(Date fecFinAcceso) {
        if (fecFinAcceso != null) {
            this.fecFinAcceso = fecFinAcceso;
        }
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        if (estadoUsuario >= 0) {
            this.estadoUsuario = estadoUsuario;
        }
    }

    /**
     * Metodo para obtener un usuario
     *
     * @return
     */
    public Usuario obtenerUsuario() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un usuario
     *
     * @return
     */
    public boolean actualizarUsuario() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para actualizar el estado de un usuario
     *
     * @return
     */
    public boolean actualizarEstadoUsuario() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un usuario
     *
     * @return
     */
    public int insertarUsuario() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un usuario
     *
     * @return
     */
    public boolean borrarUsuario() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para validar un usuario
     *
     * @return
     */
    public boolean validaUsuario() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", correo=" + correo + ", acceso=" + acceso + ", fecInicioAcceso=" + fecInicioAcceso + ", fecFinAcceso=" + fecFinAcceso + ", estadoUsuario=" + estadoUsuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idUsuario;
        hash = 17 * hash + Objects.hashCode(this.correo);
        hash = 17 * hash + (this.acceso ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.fecInicioAcceso);
        hash = 17 * hash + Objects.hashCode(this.fecFinAcceso);
        hash = 17 * hash + this.estadoUsuario;
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
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.acceso != other.acceso) {
            return false;
        }
        if (this.estadoUsuario != other.estadoUsuario) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.fecInicioAcceso, other.fecInicioAcceso)) {
            return false;
        }
        if (!Objects.equals(this.fecFinAcceso, other.fecFinAcceso)) {
            return false;
        }
        return true;
    }

}
