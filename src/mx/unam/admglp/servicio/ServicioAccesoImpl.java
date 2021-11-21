package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.AccesoImpl;
import mx.unam.admglp.modelo.entidades.Acceso;

public class ServicioAccesoImpl implements ServicioAcceso {

	private static ServicioAccesoImpl instance;

	private ServicioAccesoImpl() {

	}

	public static ServicioAccesoImpl getInstance() {
		if (instance == null) {
			instance = new ServicioAccesoImpl();
		}
		return instance;
	}

	@Override
	public Acceso obtener(Integer id) {
		// TODO Auto-generated method stub
		AccesoImpl accesoImpl = new AccesoImpl();
		return accesoImpl.get(id);
	}

	@Override
	public List<Acceso> obtenerTodo() {
		// TODO Auto-generated method stub
		AccesoImpl accesoImpl = new AccesoImpl();
		return accesoImpl.findAll();
	}

	@Override
	public void guardar(Acceso rol) {
		// TODO Auto-generated method stub
		AccesoImpl accesoImpl = new AccesoImpl();
		accesoImpl.save(rol);
	}

	@Override
	public void actualizar(Acceso rol) {
		// TODO Auto-generated method stub
		AccesoImpl accesoImpl = new AccesoImpl();
		accesoImpl.update(rol);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		AccesoImpl accesoImpl = new AccesoImpl();
		accesoImpl.delete(id);
	}

}
