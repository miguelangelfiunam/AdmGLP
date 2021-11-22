package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Asentamiento;

public interface ServicioAsentamiento {
	public Asentamiento obtener(Integer id);

	public List<Asentamiento> obtenerTodo();

	public void guardar(Asentamiento asentamiento);

	public void actualizar(Asentamiento asentamiento);
}
