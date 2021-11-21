package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.UsuarioImpl;
import mx.unam.admglp.modelo.entidades.Usuario;

public class ServicioUsuarioImpl implements ServicioUsuario {
	
	private static ServicioUsuarioImpl instance;

	private ServicioUsuarioImpl() {

	}

	public static ServicioUsuarioImpl getInstance() {
		if (instance == null) {
			instance = new ServicioUsuarioImpl();
		}
		return instance;
	}

	@Override
	public Usuario obtener(Integer id) {
		// TODO Auto-generated method stub
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		return usuarioImpl.get(id);
	}

	@Override
	public List<Usuario> obtenerTodo() {
		// TODO Auto-generated method stub
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		return usuarioImpl.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		usuarioImpl.save(usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		usuarioImpl.update(usuario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		usuarioImpl.delete(id);
	}

}
