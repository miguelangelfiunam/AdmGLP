package mx.unam.admglp.modelo.dao;

import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Usuario;

public interface ContraDAO extends GenericDAO<Contra, Integer> {
	public Boolean deleteContraByUsuario(Usuario usuario);
}
