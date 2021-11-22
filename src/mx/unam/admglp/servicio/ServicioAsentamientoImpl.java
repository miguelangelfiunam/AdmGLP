package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.AsentamientoImpl;
import mx.unam.admglp.modelo.entidades.Asentamiento;

public class ServicioAsentamientoImpl implements ServicioAsentamiento {

	private static ServicioAsentamientoImpl instance;

	private ServicioAsentamientoImpl() {

	}

	public static ServicioAsentamientoImpl getInstance() {
		if (instance == null) {
			instance = new ServicioAsentamientoImpl();
		}
		return instance;
	}

	@Override
	public Asentamiento obtener(Integer id) {
		// TODO Auto-generated method stub
		AsentamientoImpl asentamientoImpl = new AsentamientoImpl();
		return asentamientoImpl.get(id);
	}

	@Override
	public List<Asentamiento> obtenerTodo() {
		// TODO Auto-generated method stub
		AsentamientoImpl asentamientoImpl = new AsentamientoImpl();
		return asentamientoImpl.findAll();
	}

	@Override
	public void guardar(Asentamiento acceso) {
		// TODO Auto-generated method stub
		AsentamientoImpl asentamientoImpl = new AsentamientoImpl();
		asentamientoImpl.save(acceso);
	}

	@Override
	public void actualizar(Asentamiento acceso) {
		// TODO Auto-generated method stub
		AsentamientoImpl asentamientoImpl = new AsentamientoImpl();
		asentamientoImpl.update(acceso);
	}
}
