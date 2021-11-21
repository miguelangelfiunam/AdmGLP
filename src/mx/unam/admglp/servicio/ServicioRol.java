package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Rol;

public interface ServicioRol {
	public Rol obtener(Integer id);

	public List<Rol> obtenerTodo();

	public void guardar(Rol rol);

	public void actualizar(Rol rol);

	public void borrar(Integer id);
}
