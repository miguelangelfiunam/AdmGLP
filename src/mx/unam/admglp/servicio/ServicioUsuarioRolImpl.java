package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.UsuarioRolImpl;
import mx.unam.admglp.modelo.entidades.UsuarioRol;

public class ServicioUsuarioRolImpl implements ServicioUsuarioRol {
	
	private static ServicioUsuarioRolImpl instance;

	private ServicioUsuarioRolImpl() {

	}

	public static ServicioUsuarioRolImpl getInstance() {
		if (instance == null) {
			instance = new ServicioUsuarioRolImpl();
		}
		return instance;
	}

	@Override
	public UsuarioRol obtener(Integer id) {
		// TODO Auto-generated method stub
		UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();
		return usuarioRolImpl.get(id);
	}

	@Override
	public List<UsuarioRol> obtenerTodo() {
		// TODO Auto-generated method stub
		UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();
		return usuarioRolImpl.findAll();
	}

	@Override
	public void guardar(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();
		usuarioRolImpl.save(usuarioRol);
	}

	@Override
	public void actualizar(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();
		usuarioRolImpl.update(usuarioRol);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();
		usuarioRolImpl.delete(id);
	}

}
