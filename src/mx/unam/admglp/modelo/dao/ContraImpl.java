package mx.unam.admglp.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;

public class ContraImpl extends GenericDAOImplHibernate<Contra, Integer> implements ContraDAO {
	
	SessionFactory sessionFactory;

	public ContraImpl() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}

	@Override
	public Boolean deleteContraByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Boolean borrado = false;
		Session session = sessionFactory.getCurrentSession();
		try {
			// se inicia una transaccion
			session.beginTransaction();

			System.out.println("Borrando..." + usuario.getContra());

			session.delete(usuario.getContra());
			// se realiza el commit
			session.getTransaction().commit();
			borrado = true;
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
		return borrado; 
	}
	
}
