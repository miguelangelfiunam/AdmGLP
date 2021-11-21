package mx.unam.admglp.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase que hace match de una tabla intermedia entre usuario y rol
 * 
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 20/11/2021 - 20/11/2021
 *
 */
@Entity
@Table(name = "tr_usuario_rol")
public class UsuarioRol {
	private Integer idUsuarioRol;
	private Rol rol;
	private Usuario usuario;
	private Date fecRegistro; // Fecha de registro
	private Date fecActualizacion; // Fecha de actualizacion
	private Integer estatus;

	@Id
	@Column(name = "id_usuario_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdUsuarioRol() {
		return idUsuarioRol;
	}

	@ManyToOne(targetEntity = Rol.class, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_rol", nullable = false, referencedColumnName = "id_rol")
	public Rol getRol() {
		return rol;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	public Usuario getUsuario() {
		return usuario;
	}

	@Column(name = "usu_rol_dt_fecha_registro", columnDefinition = "DATETIME")
	@NotNull
	public Date getFecRegistro() {
		return fecRegistro;
	}

	@Column(name = "usu_rol_dt_fecha_actualizacion", columnDefinition = "DATETIME")
	public Date getFecActualizacion() {
		return fecActualizacion;
	}

	@Column(name = "usu_rol_si_estatus")
	@NotNull
	public Integer getEstatus() {
		return estatus;
	}

	public void setIdUsuarioRol(Integer idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public void setFecActualizacion(Date fecActualizacion) {
		this.fecActualizacion = fecActualizacion;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "UsuarioRol [idUsuarioRol=" + idUsuarioRol + ", fecRegistro=" + fecRegistro + ", fecActualizacion="
				+ fecActualizacion + ", estatus=" + estatus + "]";
	}
}
