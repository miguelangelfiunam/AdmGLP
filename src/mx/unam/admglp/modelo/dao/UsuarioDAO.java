package mx.unam.admglp.modelo.dao;

import java.util.List;

import mx.unam.admglp.modelo.entidades.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {
	List<Usuario> getContactosByIdEstaus(Integer idEstatus);

	List<Usuario> getContactosByIdRol(Integer idRol);
}
