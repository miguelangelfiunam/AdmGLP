package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.UsuarioRol;

public interface ServicioUsuarioRol {
	public UsuarioRol obtener(Integer id);

	public List<UsuarioRol> obtenerTodo();

	public void guardar(UsuarioRol usuarioRol);

	public void actualizar(UsuarioRol usuarioRol);

	public void borrar(Integer id);
}
