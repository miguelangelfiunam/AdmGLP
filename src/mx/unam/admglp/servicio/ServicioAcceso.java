package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Acceso;

public interface ServicioAcceso {
	public Acceso obtener(Integer id);

	public List<Acceso> obtenerTodo();

	public void guardar(Acceso acceso);

	public void actualizar(Acceso acceso);

	public void borrar(Integer id);
}
