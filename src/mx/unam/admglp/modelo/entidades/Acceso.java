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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.sun.istack.NotNull;

/**
 * Bean para hacer match con la tabla de acceso de los usuarios de la aplicación
 * 
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 20/11/2021 - 21/11/2021
 *
 */
@Entity
@Table(name = "t_acceso")
public class Acceso {
	private Integer id; // Identificador de acceso
	private Usuario usuario; // Usuario relacionado al acceso
	private Date fechaInicioAcceso;// Fecha de inicio de acceso
	private Date fechaFinAcceso; // Fecha en que se termina el acceso (fin de sesión)
	private String descripcion; // Descripción del acceso
	private Integer estatus; // Estatus del acceso

	@Id
	@Column(name = "id_acceso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	@ManyToOne(targetEntity = Usuario.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_usuario", nullable = false)
	@Fetch(FetchMode.JOIN)
	@NotNull
	public Usuario getUsuario() {
		return usuario;
	}

	@Column(name = "acceso_dt_fecha_Inicio_acceso", columnDefinition = "DATETIME")
	public Date getFechaInicioAcceso() {
		return fechaInicioAcceso;
	}

	@Column(name = "acceso_dt_fecha_fin_acceso", columnDefinition = "DATETIME")
	public Date getFechaFinAcceso() {
		return fechaFinAcceso;
	}

	@Column(name = "acceso_descripcion", length = 150)
	@NotNull
	public String getDescripcion() {
		return descripcion;
	}

	@Column(name = "acceso_si_estatus")
	@NotNull
	public Integer getEstatus() {
		return estatus;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setFechaInicioAcceso(Date fechaInicioAcceso) {
		this.fechaInicioAcceso = fechaInicioAcceso;
	}

	public void setFechaFinAcceso(Date fechaFinAcceso) {
		this.fechaFinAcceso = fechaFinAcceso;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Acceso [id=" + id + ", usuario=" + usuario + ", fechaInicioAcceso=" + fechaInicioAcceso
				+ ", fechaFinAcceso=" + fechaFinAcceso + ", descripcion=" + descripcion + ", estatus=" + estatus + "]";
	}

}
