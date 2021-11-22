package mx.unam.admglp.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Catalogo<T extends Serializable> implements Serializable {

	protected Integer id;
	protected String nombre;
	protected Date fecRegistro; // Fecha de Inicio de acceso a la aplicacion
	protected Date fecActualizacion; // Fecha de fin de acceso a la aplicacion
	protected Integer estatus;

	abstract Integer getId();

	abstract String getNombre();

	abstract Date getFecRegistro();

	abstract Date getFecActualizacion();

	abstract Integer getEstatus();

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public void setFecActualizacion(Date fecActualizacion) {
		this.fecActualizacion = fecActualizacion;
	}

}
