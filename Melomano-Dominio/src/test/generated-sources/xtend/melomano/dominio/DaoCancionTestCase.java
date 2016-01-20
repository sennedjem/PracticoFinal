package melomano.dominio;

import java.util.List;
import melomano.dominio.Cancion;
import melomano.dominio.daoHbm.CancionDao;
import melomano.dominio.hbmUtils.SessionManager;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DaoCancionTestCase {
  private Cancion cancion1;
  
  private Cancion cancion2;
  
  private Cancion cancion3;
  
  private CancionDao dao;
  
  @Before
  public void setUp() {
    Cancion _cancion = new Cancion("diez años despues", "si diez ___ despues te vuelvo a _____  en algun lugar no\nte olvides que soy distinto de aquel, pero casi igual", "años", "encontrar", "en que cd se publico esta cancion?", 
      "en que año?", "como se llama el tema?", "a que banda pertenece?", "Palabras mas palabras menos", "1995", "Diez años despues", "Los Rodriguez", "rock");
    this.cancion1 = _cancion;
    Cancion _cancion_1 = new Cancion("Perro amor explota", "muy lejos del ___, se enciende otra _____ , y crece en sus ojos,\n como un destello que no te deja dormir", "mar", "sal", "en que cd se publico esta cancion?", 
      "en que año?", "como se llama el tema?", "cual es el nombre completo de la banda a que pertenece?", "De la Cabeza", "2002", "Perro amor explota", "Bersuit Vergarabat", "rock");
    this.cancion2 = _cancion_1;
    Cancion _cancion_2 = new Cancion("Bajan", "Tengo tiempo para saber si lo que ____ concluye en algo,No te apures ya mas,\n loco, porque es entonces cuando las horas___", "sueño", "bajan", "en que cd se publico esta cancion?", 
      "cual es el apodo del principal integrante de la banda?", "como se llama el tema?", "cual es el nombre de la banda a que pertenece?", "Artaud", "flaco", "Bajan", "Pescado Rabioso", "rock");
    this.cancion3 = _cancion_2;
    CancionDao _cancionDao = new CancionDao();
    this.dao = _cancionDao;
  }
  
  @After
  public void tearDown() {
    final Function0<CancionDao> _function = new Function0<CancionDao>() {
      public CancionDao apply() {
        CancionDao _xblockexpression = null;
        {
          DaoCancionTestCase.this.dao.delete(DaoCancionTestCase.this.cancion1);
          DaoCancionTestCase.this.dao.delete(DaoCancionTestCase.this.cancion2);
          DaoCancionTestCase.this.dao.delete(DaoCancionTestCase.this.cancion3);
          DaoCancionTestCase.this.cancion1 = null;
          DaoCancionTestCase.this.cancion2 = null;
          DaoCancionTestCase.this.cancion3 = null;
          _xblockexpression = DaoCancionTestCase.this.dao = null;
        }
        return _xblockexpression;
      }
    };
    SessionManager.<CancionDao>runInSession(_function);
  }
  
  @Test
  public void testSave() {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion1);
          Integer expected = Integer.valueOf(1);
          List<Cancion> _all = DaoCancionTestCase.this.dao.getAll();
          Integer actual = Integer.valueOf(_all.size());
          Assert.assertEquals(expected, actual);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    SessionManager.<Integer>runInSession(_function);
  }
  
  @Test
  public void testGetAll() {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion1);
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion2);
          List<Cancion> canciones = DaoCancionTestCase.this.dao.getAll();
          final List<Cancion> _converted_canciones = (List<Cancion>)canciones;
          int _length = ((Object[])Conversions.unwrapArray(_converted_canciones, Object.class)).length;
          boolean _equals = Integer.valueOf(_length).equals(Integer.valueOf(2));
          Assert.assertTrue(_equals);
          boolean _contains = canciones.contains(DaoCancionTestCase.this.cancion1);
          Assert.assertTrue(_contains);
          boolean _contains_1 = canciones.contains(DaoCancionTestCase.this.cancion2);
          Assert.assertTrue(_contains_1);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    SessionManager.<Integer>runInSession(_function);
  }
  
  @Test
  public void testDelete() {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion1);
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion3);
          List<Cancion> canciones = DaoCancionTestCase.this.dao.getAll();
          final List<Cancion> _converted_canciones = (List<Cancion>)canciones;
          int _length = ((Object[])Conversions.unwrapArray(_converted_canciones, Object.class)).length;
          boolean _equals = Integer.valueOf(_length).equals(Integer.valueOf(2));
          Assert.assertTrue(_equals);
          boolean _contains = canciones.contains(DaoCancionTestCase.this.cancion1);
          Assert.assertTrue(_contains);
          boolean _contains_1 = canciones.contains(DaoCancionTestCase.this.cancion3);
          Assert.assertTrue(_contains_1);
          DaoCancionTestCase.this.dao.delete(DaoCancionTestCase.this.cancion3);
          List<Cancion> _all = DaoCancionTestCase.this.dao.getAll();
          canciones = _all;
          final List<Cancion> _converted_canciones_1 = (List<Cancion>)canciones;
          int _length_1 = ((Object[])Conversions.unwrapArray(_converted_canciones_1, Object.class)).length;
          boolean _equals_1 = Integer.valueOf(_length_1).equals(Integer.valueOf(1));
          Assert.assertTrue(_equals_1);
          boolean _contains_2 = canciones.contains(DaoCancionTestCase.this.cancion1);
          Assert.assertTrue(_contains_2);
          boolean _contains_3 = canciones.contains(DaoCancionTestCase.this.cancion2);
          Assert.assertFalse(_contains_3);
          boolean _contains_4 = canciones.contains(DaoCancionTestCase.this.cancion3);
          Assert.assertFalse(_contains_4);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    SessionManager.<Integer>runInSession(_function);
  }
  
  @Test
  public void testGetPorGenero() {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion1);
          DaoCancionTestCase.this.dao.save(DaoCancionTestCase.this.cancion2);
          List<Cancion> canciones = DaoCancionTestCase.this.dao.getPorGenero("pop");
          final List<Cancion> _converted_canciones = (List<Cancion>)canciones;
          int _length = ((Object[])Conversions.unwrapArray(_converted_canciones, Object.class)).length;
          boolean _equals = Integer.valueOf(_length).equals(Integer.valueOf(2));
          Assert.assertTrue(_equals);
          boolean _contains = canciones.contains(DaoCancionTestCase.this.cancion1);
          Assert.assertTrue(_contains);
          boolean _contains_1 = canciones.contains(DaoCancionTestCase.this.cancion2);
          Assert.assertTrue(_contains_1);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    SessionManager.<Integer>runInSession(_function);
  }
}
