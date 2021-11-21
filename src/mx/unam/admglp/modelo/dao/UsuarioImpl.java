package mx.unam.admglp.modelo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;

public class UsuarioImpl extends GenericDAOImplHibernate<Usuario, Integer> implements UsuarioDAO {

	@Override
	public List<Usuario> getContactosByIdEstaus(Integer idEstatus) {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = null;
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			usuarios = session.createNamedQuery("contactosPorEstatus", Usuario.class).setParameter("idEstatus", idEstatus).list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
		return usuarios;
	}

	@Override
	public List<Usuario> getContactosByIdRol(Integer idRol) {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = null;
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			usuarios = session.createNamedQuery("contactosPorRol", Usuario.class)
					.setParameter("idRol", idRol).list();
			session.getTransaction().commit();
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				System.out.println("Falló al hacer un rollback=" + exc);
			}
			throw ex;
		}
		return usuarios;
	}
	
}
