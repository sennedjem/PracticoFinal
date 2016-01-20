package melomano.dominio.daoHbm

import melomano.dominio.Cancion
import java.util.List
import melomano.dominio.hbmUtils.SessionManager
import org.hibernate.criterion.Restrictions

class CancionDao extends GenericDao<Cancion> {
	
	new() {
		super(Cancion)
	}
	
	
	def getPorGenero(String genero){
		  SessionManager.getSession().createCriteria(Cancion).add(Restrictions.like("genero",genero)).list as List<Cancion>
		
	}
	
}