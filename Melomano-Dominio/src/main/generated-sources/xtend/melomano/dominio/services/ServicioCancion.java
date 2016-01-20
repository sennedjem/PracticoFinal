package melomano.dominio.services;

import java.util.List;
import melomano.dominio.Cancion;
import melomano.dominio.daoHbm.CancionDao;
import melomano.dominio.hbmUtils.SessionManager;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class ServicioCancion {
  public ServicioCancion() {
    Cancion cancion1 = new Cancion("diez años despues", "si diez ___ despues te vuelvo a _____  en algun lugar no\nte olvides que soy distinto de aquel, pero casi igual", "años", "encontrar", "en que cd se publico esta cancion?", 
      "en que año?", "como se llama el tema?", "a que banda pertenece?", "Palabras mas palabras menos", "1995", "Diez años despues", "Los Rodriguez", "rock");
    Cancion cancion2 = new Cancion("Perro amor explota", "muy lejos del ___, se enciende otra _____ , y crece en sus ojos,\n como un destello que no te deja dormir", "mar", "sal", "en que cd se publico esta cancion?", 
      "en que año?", "como se llama el tema?", "cual es el nombre completo de la banda a que pertenece?", "De la Cabeza", "2002", "Perro amor explota", "Bersuit Vergarabat", "rock");
    Cancion cancion3 = new Cancion("Bajan", "Tengo tiempo para saber si lo que ____ concluye en algo,No te apures ya mas,\n loco, porque es entonces cuando las horas___", "sueño", "bajan", "en que cd se publico esta cancion?", 
      "cual es el apodo del principal integrante de la banda?", "como se llama el tema?", "cual es el nombre de la banda a que pertenece?", "Artaud", "flaco", "Bajan", "Pescado Rabioso", "rock");
    this.guardarCancion(cancion1);
    this.guardarCancion(cancion2);
    this.guardarCancion(cancion3);
  }
  
  public List<Cancion> getPorGenero(final String genero) {
    final Function0<List<Cancion>> _function = new Function0<List<Cancion>>() {
      public List<Cancion> apply() {
        CancionDao _cancionDao = new CancionDao();
        String _lowerCase = genero.toLowerCase();
        return _cancionDao.getPorGenero(_lowerCase);
      }
    };
    return SessionManager.<List<Cancion>>runInSession(_function);
  }
  
  public Integer guardarCancion(final Cancion can) {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          CancionDao _cancionDao = new CancionDao();
          _cancionDao.save(can);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    return SessionManager.<Integer>runInSession(_function);
  }
  
  public Integer eliminarCancion(final Cancion can) {
    final Function0<Integer> _function = new Function0<Integer>() {
      public Integer apply() {
        int _xblockexpression = (int) 0;
        {
          CancionDao _cancionDao = new CancionDao();
          _cancionDao.delete(can);
          _xblockexpression = 1;
        }
        return Integer.valueOf(_xblockexpression);
      }
    };
    return SessionManager.<Integer>runInSession(_function);
  }
}
