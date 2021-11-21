package mx.unam.admglp.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase Contra donde se guardaran la contraseña del usuario cifrada
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 21/11/2021 - 21/11/2021
 * 
 */
@Entity
@Table(name = "t_contra")
public class Contra {
	private Integer id;
	private Usuario usuario;
	private String contraCifrado;
	private Date fecRegistro; // Fecha de registro
	private Date fecActualizacion; // Fecha de actualizacion
	private Integer estatus; // Estatus del registro en la base

	@Id
	@Column(name = "id_contra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	@OneToOne(mappedBy = "contra")
	public Usuario getUsuario() {
		return usuario;
	}

	@Column(name = "contra_vc_contra_cifrado", length = 500)
	@NotNull
	public String getContraCifrado() {
		return contraCifrado;
	}

	@Column(name = "contra_dt_fecha_registro", columnDefinition = "DATETIME")
	@NotNull
	public Date getFecRegistro() {
		return fecRegistro;
	}

	@Column(name = "contra_dt_fecha_actualizacion", columnDefinition = "DATETIME")
	public Date getFecActualizacion() {
		return fecActualizacion;
	}

	@Column(name = "contra_si_estatus")
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

	public void setContraCifrado(String contraCifrado) {
		this.contraCifrado = contraCifrado;
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
		return "Contra [id=" + id + ", contraCifrado=" + contraCifrado + ", fecRegistro=" + fecRegistro
				+ ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + "]";
	}

}
