package melomano.dominio.hbmUtils;

import melomano.dominio.hbmUtils.ServiceCommand;

@SuppressWarnings("all")
public interface Runner {
  public abstract <T extends Object> T run(final ServiceCommand<T> s);
}
