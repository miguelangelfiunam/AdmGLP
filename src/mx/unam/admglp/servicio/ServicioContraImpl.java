package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.ContraImpl;
import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Usuario;

public class ServicioContraImpl implements ServicioContra {

	private static ServicioContraImpl instance;

	private ServicioContraImpl() {

	}

	public static ServicioContraImpl getInstance() {
		if (instance == null) {
			instance = new ServicioContraImpl();
		}
		return instance;
	}

	@Override
	public Contra obtener(Integer id) {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		return contraImpl.get(id);
	}

	@Override
	public List<Contra> obtenerTodo() {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		return contraImpl.findAll();
	}

	@Override
	public void guardar(Contra contra) {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		contraImpl.save(contra);
	}

	@Override
	public void actualizar(Contra contra) {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		contraImpl.update(contra);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		contraImpl.delete(id);
	}

	@Override
	public void borrarContraPorUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		ContraImpl contraImpl = new ContraImpl();
		contraImpl.deleteContraByUsuario(usuario);
	}

}
