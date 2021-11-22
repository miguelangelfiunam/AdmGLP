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
@Table(name = "c_asentamiento")
public class Asentamiento extends Catalogo<Integer> {

	private Municipio municipio;
	private String clave;
	private String codigoPostal;
	private String tipo;

	public Asentamiento() {
		super();
	}

	@Override
	@Id
	@Column(name = "id_asentamiento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@ManyToOne(targetEntity = Municipio.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_municipio", nullable = false)
	@Fetch(FetchMode.JOIN)
	public Municipio getMunicipio() {
		return municipio;
	}

	@Column(name = "asenta_c_clave", length = 4, nullable = false, columnDefinition = "CHAR")
	public String getClave() {
		return clave;
	}

	@Column(name = "asenta_c_codigo_postal", length = 5, nullable = false, columnDefinition = "CHAR")
	public String getCodigoPostal() {
		return codigoPostal;
	}

	@Column(name = "asenta_vc_tipo", length = 70, nullable = false)
	public String getTipo() {
		return tipo;
	}

	@Override
	@Column(name = "asenta_vc_nombre", length = 150, nullable = false)
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	@Column(name = "asenta_dt_fecha_registro", columnDefinition = "DATETIME", nullable = false)
	public Date getFecRegistro() {
		// TODO Auto-generated method stub
		return fecRegistro;
	}

	@Override
	@Column(name = "asenta_dt_fecha_actualizacion", columnDefinition = "DATETIME", nullable = true)
	public Date getFecActualizacion() {
		// TODO Auto-generated method stub
		return fecActualizacion;
	}

	@Override
	@Column(name = "asenta_si_estatus", nullable = false)
	public Integer getEstatus() {
		// TODO Auto-generated method stub
		return estatus;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Asentamiento [id=" + id +", clave=" + clave + ", codigoPostal=" + codigoPostal
				+ ", tipo=" + tipo + ", nombre=" + nombre + ", fecRegistro=" + fecRegistro
				+ ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + ", municipio=" + municipio + "]";
	}

}
