package mx.unam.admglp.servicio;

import java.util.List;

import mx.unam.admglp.modelo.dao.MunicipioImpl;
import mx.unam.admglp.modelo.entidades.Municipio;

public class ServicioMunicipioImpl implements ServicioMunicipio {

	private static ServicioMunicipioImpl instance;

	private ServicioMunicipioImpl() {

	}

	public static ServicioMunicipioImpl getInstance() {
		if (instance == null) {
			instance = new ServicioMunicipioImpl();
		}
		return instance;
	}

	@Override
	public Municipio obtener(Integer id) {
		// TODO Auto-generated method stub
		MunicipioImpl municipioImpl = new MunicipioImpl();
		return municipioImpl.get(id);
	}

	@Override
	public List<Municipio> obtenerTodo() {
		// TODO Auto-generated method stub
		MunicipioImpl municipioImpl = new MunicipioImpl();
		return municipioImpl.findAll();
	}

	@Override
	public void guardar(Municipio acceso) {
		// TODO Auto-generated method stub
		MunicipioImpl municipioImpl = new MunicipioImpl();
		municipioImpl.save(acceso);
	}

	@Override
	public void actualizar(Municipio acceso) {
		// TODO Auto-generated method stub
		MunicipioImpl municipioImpl = new MunicipioImpl();
		municipioImpl.update(acceso);
	}
}
