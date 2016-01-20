package melomano.dominio.daoHbm;

import java.util.List;
import melomano.dominio.hbmUtils.SessionManager;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

@SuppressWarnings("all")
public class GenericDao<T extends Object> {
  private Class<T> modelType;
  
  public GenericDao(final Class<T> modelType) {
    this.modelType = modelType;
  }
  
  public void save(final T t) {
    Session _session = SessionManager.getSession();
    _session.saveOrUpdate(t);
  }
  
  public List<T> getAll() {
    Session _session = SessionManager.getSession();
    Criteria _createCriteria = _session.createCriteria(this.modelType);
    List _list = _createCriteria.list();
    return ((List<T>) _list);
  }
  
  public void delete(final T t) {
    Session _session = SessionManager.getSession();
    _session.delete(t);
  }
  
  public int deleteAll() {
    Session _session = SessionManager.getSession();
    String _simpleName = this.modelType.getSimpleName();
    String _plus = ("delete from " + _simpleName);
    Query _createQuery = _session.createQuery(_plus);
    return _createQuery.executeUpdate();
  }
}
