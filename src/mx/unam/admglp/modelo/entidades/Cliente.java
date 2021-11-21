package mx.unam.admglp.modelo.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase cliente
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.1
 * @since 07/10/2021
 */
public class Cliente {

	/**
	 * Numero de cliente
	 */
	private Integer numeroCliente;
	/**
	 * Fecha de registro del cliente
	 */
	private Date fechaRegistro;
	/**
	 * Fecha de actualizacion del cliente
	 */
	private Date fechaActualizacion;
	/**
	 * Estado del cliente
	 */
	private String estadoCliente;

	public Cliente() {
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		if (numeroCliente > 0) {
			this.numeroCliente = numeroCliente;
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

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion="
				+ fechaActualizacion + ", estadoCliente=" + estadoCliente + "]";
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
		final Cliente other = (Cliente) obj;
		if (this.numeroCliente != other.numeroCliente) {
			return false;
		}
		if (this.estadoCliente != other.estadoCliente) {
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
