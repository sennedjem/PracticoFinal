package melomano.dominio.daoHbm;

import java.util.List;
import melomano.dominio.Cancion;
import melomano.dominio.daoHbm.GenericDao;
import melomano.dominio.hbmUtils.SessionManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

@SuppressWarnings("all")
public class CancionDao extends GenericDao<Cancion> {
  public CancionDao() {
    super(Cancion.class);
  }
  
  public List<Cancion> getPorGenero(final String genero) {
    Session _session = SessionManager.getSession();
    Criteria _createCriteria = _session.createCriteria(Cancion.class);
    SimpleExpression _like = Restrictions.like("genero", genero);
    Criteria _add = _createCriteria.add(_like);
    List _list = _add.list();
    return ((List<Cancion>) _list);
  }
}
