package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Municipio;

public interface ServicioMunicipio {
	public Municipio obtener(Integer id);

	public List<Municipio> obtenerTodo();

	public void guardar(Municipio municipio);

	public void actualizar(Municipio municipio);
}
