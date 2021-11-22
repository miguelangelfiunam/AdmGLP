package mx.unam.admglp.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase rol que hace match con el catalogo de roles
 * 
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 20/11/2021 - 20/11/2021
 *
 */
@Entity
@Table(name = "c_rol")
public class Rol {
	private Integer idRol; // Identificador del rol
	private String nombre; // Nombre del rol
	private String tipo; // Tipo del rol
	private Date fecRegistro; // Fecha de registro
	private Date fecActualizacion; // Fecha de actualizacion
	private Integer estatus; // Estatus del registro en la base

	@Id
	@Column(name = "id_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdRol() {
		return idRol;
	}

	@Column(name = "rol_vc_nombre", length = 50)
	@NotNull
	public String getNombre() {
		return nombre;
	}

	@Column(name = "rol_c_tipo_rol", length = 1, columnDefinition = "CHAR")
	@NotNull
	public String getTipo() {
		return tipo;
	}

	@Column(name = "rol_dt_fecha_registro", columnDefinition = "DATETIME", nullable = false)
	public Date getFecRegistro() {
		return fecRegistro;
	}

	@Column(name = "rol_dt_fecha_actualizacion", columnDefinition = "DATETIME", nullable = true)
	public Date getFecActualizacion() {
		return fecActualizacion;
	}

	@Column(name = "rol_si_estatus")
	@NotNull
	public Integer getEstatus() {
		return estatus;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Rol [idRol=" + idRol + ", nombre=" + nombre + ", tipo=" + tipo + ", fecRegistro=" + fecRegistro
				+ ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + "]";
	}
}
