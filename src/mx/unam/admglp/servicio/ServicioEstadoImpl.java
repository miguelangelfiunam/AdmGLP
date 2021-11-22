package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.EstadoImpl;
import mx.unam.admglp.modelo.entidades.Estado;

public class ServicioEstadoImpl implements ServicioEstado {

	private static ServicioEstadoImpl instance;

	private ServicioEstadoImpl() {

	}

	public static ServicioEstadoImpl getInstance() {
		if (instance == null) {
			instance = new ServicioEstadoImpl();
		}
		return instance;
	}

	@Override
	public Estado obtener(Integer id) {
		// TODO Auto-generated method stub
		EstadoImpl estadoImpl = new EstadoImpl();
		return estadoImpl.get(id);
	}

	@Override
	public List<Estado> obtenerTodo() {
		// TODO Auto-generated method stub
		EstadoImpl estadoImpl = new EstadoImpl();
		return estadoImpl.findAll();
	}

	@Override
	public void guardar(Estado acceso) {
		// TODO Auto-generated method stub
		EstadoImpl estadoImpl = new EstadoImpl();
		estadoImpl.save(acceso);
	}

	@Override
	public void actualizar(Estado acceso) {
		// TODO Auto-generated method stub
		EstadoImpl estadoImpl = new EstadoImpl();
		estadoImpl.update(acceso);
	}
}
