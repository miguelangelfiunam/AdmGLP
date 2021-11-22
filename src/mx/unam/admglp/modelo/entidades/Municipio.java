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

@Entity
@Table(name = "c_municipio")
public class Municipio extends Catalogo<Integer> {
	private Estado estado;
	private String clave;

	public Municipio() {
		super();
	}

	@Override
	@Id
	@Column(name = "id_municipio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@ManyToOne(targetEntity = Estado.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_estado", nullable = false)
	@Fetch(FetchMode.JOIN)
	public Estado getEstado() {
		return estado;
	}

	@Column(name = "municipio_c_clave", length = 3, nullable = false, columnDefinition = "CHAR")
	public String getClave() {
		return clave;
	}

	@Override
	@Column(name = "municipio_vc_nombre", length = 100, nullable = false)
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	@Column(name = "municipio_dt_fecha_registro", columnDefinition = "DATETIME", nullable = false)
	public Date getFecRegistro() {
		// TODO Auto-generated method stub
		return fecRegistro;
	}

	@Override
	@Column(name = "municipio_dt_fecha_actualizacion", columnDefinition = "DATETIME", nullable = true)
	public Date getFecActualizacion() {
		// TODO Auto-generated method stub
		return fecActualizacion;
	}

	@Override
	@Column(name = "municipio_si_estado", nullable = false)
	public Integer getEstatus() {
		// TODO Auto-generated method stub
		return estatus;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Municipio [estado=" + estado + ", clave=" + clave + ", id=" + id + ", nombre=" + nombre
				+ ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus
				+ "]";
	}

}
