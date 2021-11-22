package mx.unam.admglp.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "c_estado")
public class Estado extends Catalogo<Integer> {

	private String clave;

	public Estado() {
		super();
	}

	@Override
	@Id
	@Column(name = "id_estado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Column(name = "estado_c_clave", length = 2, nullable = false, columnDefinition = "CHAR")
	public String getClave() {
		return clave;
	}

	@Override
	@Column(name = "estado_vc_nombre", length = 100, nullable = false)
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	@Column(name = "estado_dt_fecha_registro", columnDefinition = "DATETIME", nullable = false)
	public Date getFecRegistro() {
		// TODO Auto-generated method stub
		return fecRegistro;
	}

	@Override
	@Column(name = "estado_dt_fecha_actualizacion", columnDefinition = "DATETIME", nullable = true)
	public Date getFecActualizacion() {
		// TODO Auto-generated method stub
		return fecActualizacion;
	}

	@Override
	@Column(name = "estado_si_estatus", nullable = false)
	public Integer getEstatus() {
		// TODO Auto-generated method stub
		return estatus;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nombre=" + nombre + ", clave=" + clave + ", fecRegistro=" + fecRegistro
				+ ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + "]";
	}

}
