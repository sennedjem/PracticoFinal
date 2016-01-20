package melomano.dominio.hbmUtils;

import java.util.concurrent.Callable;

@SuppressWarnings("all")
public interface ServiceCommand<T extends Object> extends Callable<T> {
  public abstract T call();
}
