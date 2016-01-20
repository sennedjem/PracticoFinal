package melomano.dominio.hbmUtils;

import melomano.dominio.hbmUtils.Runner;
import melomano.dominio.hbmUtils.ServiceCommand;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.runner.notification.RunNotifier;

/**
 * Executa un ServiceCommand en el contexto de una sessi�n / transacci�n
 * de hibernate.
 * 
 * Se encarga de liberar los recursos y comitear / rollbackear la transacci�n
 * luego de que el commando haya sido ejecutado
 */
@SuppressWarnings("all")
public class HibernateRunner implements Runner {
  private static SessionFactory SESSION_FACTORY = HibernateRunner.initFactory();
  
  private static ThreadLocal<Session> CURRENT_SESSION = new ThreadLocal<Session>();
  
  public <T extends Object> T run(final ServiceCommand<T> command) {
    Session session = null;
    T result = null;
    try {
      org.hibernate.classic.Session _openSession = HibernateRunner.SESSION_FACTORY.openSession();
      session = _openSession;
      session.beginTransaction();
      HibernateRunner.CURRENT_SESSION.set(session);
      T _call = command.call();
      result = _call;
      session.flush();
      Transaction _transaction = session.getTransaction();
      _transaction.commit();
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
        final RuntimeException e = (RuntimeException)_t;
        boolean _and = false;
        if (!(session != null)) {
          _and = false;
        } else {
          Transaction _transaction_1 = session.getTransaction();
          boolean _isActive = _transaction_1.isActive();
          _and = _isActive;
        }
        if (_and) {
          Transaction _transaction_2 = session.getTransaction();
          _transaction_2.rollback();
        }
        throw e;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    } finally {
      HibernateRunner.CURRENT_SESSION.set(null);
      if ((session != null)) {
        session.close();
      }
    }
  }
  
  private static SessionFactory initFactory() {
    SessionFactory _xblockexpression = null;
    {
      final Configuration cfg = new Configuration();
      cfg.configure();
      _xblockexpression = cfg.buildSessionFactory();
    }
    return _xblockexpression;
  }
  
  public static Session currentSession() {
    Session _xblockexpression = null;
    {
      final Session session = HibernateRunner.CURRENT_SESSION.get();
      if ((session == null)) {
        throw new RuntimeException("La session de hibernate no est� inicializada. \n\t\t\t\t\t\t\t\tEsto solamente puede llamarse en el contexto de un runner");
      }
      _xblockexpression = session;
    }
    return _xblockexpression;
  }
  
  public void getDescription() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void run(final RunNotifier notifier) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
