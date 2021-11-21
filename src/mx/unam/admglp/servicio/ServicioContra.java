package mx.unam.admglp.servicio;

import java.util.List;
import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Usuario;

public interface ServicioContra {
	public Contra obtener(Integer id);

	public List<Contra> obtenerTodo();

	public void guardar(Contra contra);

	public void actualizar(Contra contra);

	public void borrar(Integer id);
	
	public void borrarContraPorUsuario(Usuario usuario);
}
