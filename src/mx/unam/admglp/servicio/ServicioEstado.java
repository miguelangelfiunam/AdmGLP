package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Estado;

public interface ServicioEstado {
	public Estado obtener(Integer id);

	public List<Estado> obtenerTodo();

	public void guardar(Estado estado);

	public void actualizar(Estado estado);
}
