package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.RolImpl;
import mx.unam.admglp.modelo.entidades.Rol;

public class ServicioRolImpl implements ServicioRol {

	private static ServicioRolImpl instance;

	private ServicioRolImpl() {

	}

	public static ServicioRolImpl getInstance() {
		if (instance == null) {
			instance = new ServicioRolImpl();
		}
		return instance;
	}

	@Override
	public Rol obtener(Integer id) {
		// TODO Auto-generated method stub
		RolImpl rolImpl = new RolImpl();
		return rolImpl.get(id);
	}

	@Override
	public List<Rol> obtenerTodo() {
		// TODO Auto-generated method stub
		RolImpl rolImpl = new RolImpl();
		return rolImpl.findAll();
	}

	@Override
	public void guardar(Rol rol) {
		// TODO Auto-generated method stub
		RolImpl rolImpl = new RolImpl();
		rolImpl.save(rol);
	}

	@Override
	public void actualizar(Rol rol) {
		// TODO Auto-generated method stub
		RolImpl rolImpl = new RolImpl();
		rolImpl.update(rol);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		RolImpl rolImpl = new RolImpl();
		rolImpl.delete(id);
	}

}
