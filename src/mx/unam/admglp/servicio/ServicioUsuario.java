package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Usuario;

public interface ServicioUsuario {
	public Usuario obtener(Integer id);

	public List<Usuario> obtenerTodo();

	public void guardar(Usuario usuario);

	public void actualizar(Usuario usuario);

	public void borrar(Integer id);
}
